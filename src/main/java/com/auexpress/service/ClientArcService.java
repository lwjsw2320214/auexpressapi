package com.auexpress.service;

import com.auexpress.dao.content.ClientArcMapper;
import com.auexpress.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 * Created by 维军 on 2016/07/18.
 */
@Service
@Transactional(value="transtwo", readOnly=true)
public class ClientArcService {
    @Autowired
    ClientArcMapper dao;

    public User getIcid(String username)
    {
        return this.dao.getIcid(username);
    }
}
