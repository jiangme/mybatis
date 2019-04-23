package com.jiang.config;

import com.baomidou.mybatisplus.core.parser.ISqlParser;
import com.baomidou.mybatisplus.extension.parsers.BlockAttackSqlParser;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ShiJiang
 * @desc
 * @date 2019/4/22 10:22 PM
 */
@Configuration
public class MybatisPlusConfig {


    /**
     *
     * 分页插件、攻击SQL阻断解析器
     *
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor(){

        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        List<ISqlParser> sqlParserList = new ArrayList<>();
        // 攻击 SQL 阻断解析器、加入解析链
        sqlParserList.add(new BlockAttackSqlParser());
        paginationInterceptor.setSqlParserList(sqlParserList);
        return paginationInterceptor;
    }

    /**
     *
     * SQL执行效率插件
     *
     * @return
     */
    @Bean
    @Profile({"dev", "test"}) // 设置dev、test环境开启
    public PerformanceInterceptor performanceInterceptor(){

        return new PerformanceInterceptor();
    }


}

/**
 * @author ShiJiang
 * <p>
 * from mybatis-core
 */
