package com.cncs.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public  String Date2String(Date date,String patt){
        SimpleDateFormat sdf = new SimpleDateFormat(patt);
        String format = sdf.format(date);
        return format;
    }
}
