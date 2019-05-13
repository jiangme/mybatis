package com.jiang.common;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author Luosj
 * @desc 解决SimpleDataFormat线程不安全方案
 * @date 2019/5/13 11:38 AM
 */
public class DateUtils {

    public static final String PATTERN = "yyyy.MM.dd hh:mm:ss";

    /**
     *
     *  保证每一个线程都获取到一个新的DateFormat实例
     *
     */
    public static final ThreadLocal<DateFormat> SDF_LOCAL = new ThreadLocal<DateFormat>(){

        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat(PATTERN);
        }
    };


    /**
     *
     *  JDK8 用来替代SimpleDateFormat的新API
     *
     *
     */
    public static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(PATTERN);


    public static String parseDate(Date date){
        DateFormat dateFormat = SDF_LOCAL.get();
        return dateFormat.format(date);
    }

}

/**
 * @author Luosj
 * <p>
 * from mybatis-core
 */
