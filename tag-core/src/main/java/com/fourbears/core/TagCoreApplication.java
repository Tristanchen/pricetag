package com.fourbears.core;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan({"com.fourbears.core.mapper", "com.fourbears.core.dao"})
@EnableTransactionManagement
public class TagCoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(TagCoreApplication.class, args);
    }
}
