package com.cncs.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public String Date2String(Date date, String patt) {
        SimpleDateFormat sdf = new SimpleDateFormat(patt);
        String format = sdf.format(date);
        return format;
    }

    public Date String2Date(String date,String patt){
        return new Date();
    }
}
