package com.auexpress.dao.content;

import com.auexpress.entity.RecPreInput;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by on 2016/07/10.
 */
public interface RecPreInputMapper {


    List<RecPreInput> getPageList(@Param("icid") Integer icid, @Param("irid") Integer irid, @Param("startRow") Integer startRow, @Param("endRow") Integer endRow,@Param("batchId")Integer batchId,@Param("cnum")String cnum);


    Integer getAllRowCount(@Param("icid") Integer icid, @Param("irid") Integer irid,@Param("batchId")Integer batchId,@Param("cnum")String cnum);

    /**
     * 根据原始运单号获取运单id
     * */
    Integer getiid(@Param("icid")Integer icid,@Param("waybillId")String waybillId);

    /**
     * 获取单个运单的详细信息
     * */
    RecPreInput getRecPreInput(@Param("iid")Integer iid);

    Integer saveBatcRecRecPreInput(@Param("iid")Integer iid,@Param("batchId")Integer batchId,@Param("batchDate")Date batchDate);


    /**
     * 查询当前批次号下面是否还有数据
     * */
     Integer getBatcrRecCount(@Param("batchId")Integer batchId);
 }
