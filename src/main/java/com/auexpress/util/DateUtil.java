package com.auexpress.util;

import javax.print.DocFlavor;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by liu on 2016/9/27.
 */
public class DateUtil {

    /**
     * java 获取时间到毫秒组成字符串
     *
     * */
    public String getTimeSeries(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        return formatter.format(new Date());
    }

}
