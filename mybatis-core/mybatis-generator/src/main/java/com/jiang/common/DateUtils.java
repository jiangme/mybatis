package com.jiang.common;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

/**
 * @author Luosj
 * @desc 解决SimpleDataFormat线程不安全方案
 * @date 2019/5/13 11:38 AM
 */
public class DateUtils {

    /**
     *
     *  保证每一个线程都获取到一个新的DateFormat实例
     *
     */
    public static final ThreadLocal<DateFormat> sdfLocal = new ThreadLocal<DateFormat>(){

        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat();
        }
    };


    /**
     *
     *  JDK8 用来替代SimpleDateFormat的新API
     *
     *
     */
    public static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");


}

/**
 * @author Luosj
 * <p>
 * from mybatis-core
 */
