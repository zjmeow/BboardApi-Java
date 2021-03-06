package com.zjmeow.bboard.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: swagger2 文档配置
 **/
@Configuration
public class ModelMapperConfig {
    @Bean
    ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
