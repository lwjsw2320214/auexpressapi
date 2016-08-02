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
     * ����ԭʼ�˵��Ż�ȡ�˵�id
     * */
    Integer getiid(@Param("icid")Integer icid,@Param("waybillId")String waybillId);

    /**
     * ��ȡ�����˵�����ϸ��Ϣ
     * */
    RecPreInput getRecPreInput(@Param("iid")Integer iid);

    Integer saveBatcRecRecPreInput(@Param("iid")Integer iid,@Param("batchId")Integer batchId,@Param("batchDate")Date batchDate);


    /**
     * ��ѯ��ǰ���κ������Ƿ�������
     * */
     Integer getBatcrRecCount(@Param("batchId")Integer batchId);
 }
