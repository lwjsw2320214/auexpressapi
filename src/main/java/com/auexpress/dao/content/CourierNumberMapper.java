package com.auexpress.dao.content;

import com.auexpress.entity.CourierNumber;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

/**
 * Created by 维军 on 2016/07/30.
 */
public interface CourierNumberMapper {

    /**
     * 获取快递号
     * */
    CourierNumber getCourierNumber();

    /**
     * 更新快递单号
     * */
    Integer updateCourierNumber(@Param("updateDate")Date updateDate,@Param("updateUser")Integer updateUser,@Param("courierNumber")String courierNumber);
}
