package com.jiang.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author ShiJiang
 *
 * @desc 数据源配置
 *
 * @date 2019/4/22 10:42 PM
 */
@Configuration
public class DadaSourceConfig {


    /**
     *
     * 数据源配置
     *
     * @return
     */
    @Bean
    public DataSource dataSource(){
        DruidDataSource druidDataSource =  new DruidDataSource();
        druidDataSource.setPassword("123456");
        druidDataSource.setUsername("root");
        druidDataSource.setUrl("jdbc:mysql://127.0.0.1:3306/write_data?useUnicode=true&useSSL=false&characterEncoding=utf8");
        return druidDataSource;
    }


}

/**
 * @author ShiJiang
 * <p>
 * from mybatis-core
 */
