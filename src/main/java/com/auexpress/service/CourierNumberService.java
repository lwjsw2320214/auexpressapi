package com.auexpress.service;

import com.auexpress.dao.content.CourierNumberMapper;
import com.auexpress.entity.CourierNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by 维军 on 2016/07/30.
 */
@Service
@Transactional(value="transtwo", readOnly=true)
public class CourierNumberService {

    @Autowired
    CourierNumberMapper dao;

    public CourierNumber getCourierNumber(){
        return  dao.getCourierNumber();
    }
}
