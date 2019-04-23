package com.jiang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan("com.jiang.**.mapper") // 扫描的是mapper接口
@SpringBootApplication
@EnableTransactionManagement // 启用显示事务
public class MybatisGeneratorApplication {

    public static void main(String[] args) {

       SpringApplication.run(MybatisGeneratorApplication.class, args);
    }

}
