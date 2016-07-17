package com.auexpress.dao.login;

import com.auexpress.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by 维军 on 2016/07/18.
 */
public interface UserMapper {
    public User Login(@Param("username") String paramString);
}
