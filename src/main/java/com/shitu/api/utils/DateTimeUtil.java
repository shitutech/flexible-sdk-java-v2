package com.shitu.api.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author andrew
 * @date 2021-10-27 5:26 PM
 */
public final class DateTimeUtil {

    public static final String DATETIME_FORMAT = "yyyyMMddHHmmssSSS";

    public static String getDateStr() {
        SimpleDateFormat sdf = new SimpleDateFormat(DATETIME_FORMAT);
        return sdf.format(new Date());
    }
}
