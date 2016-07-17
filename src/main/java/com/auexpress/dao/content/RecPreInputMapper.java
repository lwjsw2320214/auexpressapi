package com.auexpress.dao.content;

import com.auexpress.entity.RecPreInput;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by  on 2016/07/10.
 */
public interface RecPreInputMapper {

    /**
     * 分页
     * */
    List<RecPreInput> getPageList(@Param("icid") Integer icid, @Param("irid") Integer irid, @Param("startRow") Integer startRow, @Param("endRow") Integer endRow);

    /**
     * 获取总行数
     * */
    Integer getAllRowCount(@Param("icid") Integer icid, @Param("irid") Integer irid);
 }
