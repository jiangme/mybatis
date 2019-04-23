package com.jiang.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ShiJiang
 * @desc
 * @date 2019/4/22 10:22 PM
 */
@Configuration
public class MybatisPlusConfig {


    /**
     *
     * 分页插件
     *
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor(){

        return new PaginationInterceptor();
    }

}

/**
 * @author ShiJiang
 * <p>
 * from mybatis-core
 */
