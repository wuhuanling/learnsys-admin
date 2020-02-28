package com.whl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.baomidou.mybatisplus.samples.quickstart.mapper")
public class LearnsysApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnsysApplication.class, args);
        System.out.println("------------------------SpringApplication启动--------------------");
    }

}
