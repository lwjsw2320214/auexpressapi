package com.auexpress.service;

import com.auexpress.entity.RecPreInput;
import com.auexpress.dao.content.RecPreInputMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * Created by  on 2016/07/16.
 */

@Service
@Transactional(value = "transtwo", readOnly = true)
public class RecPreInputService{

        @Autowired
        RecPreInputMapper dao;

    public List<RecPreInput> getPageList(Integer icid,Integer irid,Integer page,int pageSize,Integer batchId,String cnum){
        Integer startRow=(page-1)*pageSize+1;
        Integer endRow=page*pageSize;
        return  dao.getPageList(icid,irid,startRow,endRow,batchId,cnum);
    }


    public Integer getPageCount(Integer icid,Integer irid,int pageSize,Integer batchId,String cnum){
        Integer pageTotal=0;
        Integer total=dao.getAllRowCount(icid,irid,batchId,cnum);
        if(total%pageSize>0){
            pageTotal=(total/pageSize)+1;
        }else {
            pageTotal=total/pageSize;
        }
        return  pageTotal;
    }

    @Transactional(readOnly = false)
   public  RecPreInput getRecPreInput(Integer iid,Integer icid,String waybillId,Integer batchId){
        RecPreInput recPreInput=null;
        //如果旧运单不为空则表示要这个运单为新运单要通过查询获取id
        if (!StringUtils.isEmpty(waybillId)){
            iid=  dao.getiid(icid,waybillId);
            dao.saveBatcRecRecPreInput(iid, batchId, new Date());
        }
        if(!StringUtils.isEmpty(iid)&&iid!=0){
            recPreInput= dao.getRecPreInput(iid);
        }
        return  recPreInput;
    }

    /**
     * 查询当前批次下
     * 面是否有还有数据
     * */
    public  Integer getBatcrRecCount(Integer batchId){
        return  dao.getBatcrRecCount(batchId);
    }

    /**
     * 查询当前批次下所有
     * 所有的未处理运单
     * */
    public  List<RecPreInput> getAllBatcrRec(Integer batchId){
        return  dao.getAllBatcrRec(batchId);
    }

}
