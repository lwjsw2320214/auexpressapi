package com.auexpress.service;

import com.auexpress.dao.content.ExpressMapper;
import com.auexpress.entity.Express;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 维军 on 2016/07/18.
 */

@Service
@Transactional(value="transtwo", readOnly=true)
public class ExpressService {

    @Autowired
    ExpressMapper dao;

    public List<Express> getList(){
        return dao.getList();
    }
}
