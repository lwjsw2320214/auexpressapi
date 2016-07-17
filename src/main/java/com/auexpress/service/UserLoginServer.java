package com.auexpress.service;

import com.auexpress.entity.User;
import com.auexpress.dao.login.UserMapper;
import com.auexpress.util.GuidUtil;
import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by 维军 on 2016/07/18.
 */
@Service
@Transactional(value="transone", readOnly=true)
public class UserLoginServer {

    @Autowired
    private UserMapper dao;
    @Autowired
    ClientArcService clientArcService;

    @Cacheable(cacheNames={"departCache"}, key="#username")
    public User login(String username)
    {
        GuidUtil uuid = new GuidUtil();
        User user = this.dao.Login(username);
        if (user != null)
        {
            Integer icid = this.clientArcService.getIcid(user.getMcaccount());
            if (icid != null) {
                user.setIcid(icid);
            }
            user.setToken(uuid.getUUID());
        }
        return user;
    }

    public void removeCache(String key)
    {
        CacheManager cacheManager = CacheManager.create();
        Cache cache = cacheManager.getCache("departCache");
        cache.remove(key);
    }

    public boolean userVerification(String username, String token)
    {
        boolean verification = false;
        CacheManager cacheManager = CacheManager.create();
        Cache cache = cacheManager.getCache("departCache");
        Element element = cache.get(username);
        if (element != null)
        {
            User user = (User)element.getObjectValue();
            if (user.getToken().equals(token)) {
                verification = true;
            }
        }
        return verification;
    }
}
