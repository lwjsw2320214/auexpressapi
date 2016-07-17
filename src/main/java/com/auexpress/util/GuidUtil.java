package com.auexpress.util;

import java.util.UUID;

/**
 * Created by 维军 on 2016/07/18.
 */
public class GuidUtil {
    public String getUUID()
    {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
}
