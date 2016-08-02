package com.auexpress.service;

import com.auexpress.dao.content.SmsBatchMapper;
import com.auexpress.entity.SmsBatch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 维军 on 2016/07/20.
 */

@Service
@Transactional(value = "transtwo", readOnly = true)
public class SmsBatchService {

    @Autowired
    SmsBatchMapper dao;

    /**
     * 分页
     * */
    public List<SmsBatch> getPageList(Integer icid,Integer page,int pageSize){
        Integer startRow=(page-1)*pageSize+1;
        Integer endRow=page*pageSize;
        return  dao.getPageList(icid,startRow,endRow);
    }

    /**
     * 获取总页数
     * */
    public Integer getPageCount(Integer icid,int pageSize){
        Integer pageTotal=0;
        Integer total=dao.getAllRowCount(icid);
        if(total%pageSize>0){
            pageTotal=(total/pageSize)+1;
        }else {
            pageTotal=total/pageSize;
        }
        return  pageTotal;
    }

    /**
     * 添加批次号
     * */
    @Transactional(readOnly = false)
    public  Integer add(SmsBatch smsBatch){
        Integer rowCount=2;
        try {
            Integer count = dao.isRepeat(smsBatch);
            if (count <= 0) {
                rowCount = dao.add(smsBatch);
            }
        }catch (Exception e){
            e.printStackTrace();
            rowCount=0;
        }
        return rowCount;
    }

    @Transactional(readOnly = false)
    public Integer delete(Integer id){
        return dao.delete(id);
    }

}
