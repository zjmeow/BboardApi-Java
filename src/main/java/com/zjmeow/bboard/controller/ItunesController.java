package com.zjmeow.bboard.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Slf4j
@Controller
public class ItunesController {
    private final StringRedisTemplate stringRedisTemplate;

    @Autowired
    public ItunesController(StringRedisTemplate stringRedisTemplate) {
        this.stringRedisTemplate = stringRedisTemplate;
    }

    // 为了避免重复解析，已经在 redis 中保存好了转成 JSON 的数据，直接返回即可
    @ResponseBody
    @GetMapping("/itunes")
    public String getItunes() {
        String response = stringRedisTemplate.opsForValue().get("itunes");
        return response;
    }


}
