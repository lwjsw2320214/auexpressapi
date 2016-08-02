package com.auexpress.dao.content;

import com.auexpress.entity.SmsBatch;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 维军 on 2016/07/20.
 */
public interface SmsBatchMapper {

    /**
     * 分页
     * */
    List<SmsBatch> getPageList(@Param("icid") Integer icid,@Param("startRow") Integer startRow, @Param("endRow") Integer endRow);

    /**
     * 获取总行数
     * */
    Integer getAllRowCount(@Param("icid") Integer icid);

    /**
     * 添加
     * */
    Integer add(SmsBatch smsBatch);

    /**
     * 查询是否有重复
     * */
    Integer isRepeat(SmsBatch smsBatch);

    /**
     * 软删除
     * */
    Integer delete(Integer id);
}
