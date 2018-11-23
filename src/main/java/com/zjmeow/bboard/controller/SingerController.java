package com.zjmeow.bboard.controller;

import com.zjmeow.bboard.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SingerController {
    private final SingerService singerService;

    @Autowired
    public SingerController(SingerService singerService) {
        this.singerService = singerService;
    }
}
