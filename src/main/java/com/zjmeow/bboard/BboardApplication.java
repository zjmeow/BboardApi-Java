package com.zjmeow.bboard;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan("com.zjmeow.bboard.dao") // mybatis扫描路径，针对的是接口Mapper类
public class BboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(BboardApplication.class, args);
    }
}
