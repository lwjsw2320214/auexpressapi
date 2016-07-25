package com.auexpress.dao.content;

import com.auexpress.entity.RecPreInput;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by on 2016/07/10.
 */
public interface RecPreInputMapper {


    List<RecPreInput> getPageList(@Param("icid") Integer icid, @Param("irid") Integer irid, @Param("startRow") Integer startRow, @Param("endRow") Integer endRow,@Param("batchId")Integer batchId);


    Integer getAllRowCount(@Param("icid") Integer icid, @Param("irid") Integer irid,@Param("batchId")Integer batchId);

    /**
     * 根据原始运单号获取运单id
     * */
    Integer getiid(@Param("icid")Integer icid,@Param("waybillId")String waybillId);

    /**
     * 获取单个运单的详细信息
     * */
    RecPreInput getRecPreInput(@Param("iid")Integer iid);
 }
