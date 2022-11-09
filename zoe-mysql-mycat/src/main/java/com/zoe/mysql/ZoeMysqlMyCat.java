package com.zoe.mysql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhaoccf
 * @version 1.0.0
 * @description
 * @date 2022/11/3 15:08
 */
@SpringBootApplication
@MapperScan("com.zoe.mysql.mapper")
public class ZoeMysqlMyCat {
    public static void main(String[] args) {
        SpringApplication.run(ZoeMysqlMyCat.class, args);
    }
}