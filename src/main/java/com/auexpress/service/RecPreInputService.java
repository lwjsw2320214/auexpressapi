package com.auexpress.service;

import com.auexpress.entity.RecPreInput;
import com.auexpress.dao.content.RecPreInputMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by  on 2016/07/16.
 */

@Service
@Transactional(value = "transtwo", readOnly = true)
public class RecPreInputService{

        @Autowired
        RecPreInputMapper dao;

    public List<RecPreInput> getPageList(Integer icid,Integer irid,Integer page,int pageSize,Integer batchId){
        Integer startRow=(page-1)*pageSize+1;
        Integer endRow=page*pageSize;
        return  dao.getPageList(icid,irid,startRow,endRow,batchId);
    }


    public Integer getPageCount(Integer icid,Integer irid,int pageSize,Integer batchId){
        Integer pageTotal=0;
        Integer total=dao.getAllRowCount(icid,irid,batchId);
        if(total%pageSize>0){
            pageTotal=(total/pageSize)+1;
        }else {
            pageTotal=total/pageSize;
        }
        return  pageTotal;
    }

}
