package com.auexpress.dao.content;

import com.auexpress.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by 维军 on 2016/07/18.
 */
public interface ClientArcMapper {

     User getIcid(@Param("username") String paramString);

}
