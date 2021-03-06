package com.zjmeow.bboard.controller;

import com.zjmeow.bboard.model.vo.ApiResponse;
import com.zjmeow.bboard.model.vo.SingerDetailVO;
import com.zjmeow.bboard.model.vo.SingerListVO;
import com.zjmeow.bboard.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;


@RestController
public class SingerController {
    private final SingerService singerService;

    @Autowired
    public SingerController(SingerService singerService) {
        this.singerService = singerService;
    }

    @GetMapping("/search/singers/{name}")
    public ApiResponse<List<SingerListVO>> searchSong(@PathVariable(value = "name") String name) {
        return singerService.searchSinger(name);
    }

    @GetMapping("/singers/{id}")
    public ApiResponse<SingerDetailVO> getSingerDetail(@PathVariable(value = "id") Integer id) {
        return singerService.getSingerDetail(id);
    }

    @GetMapping("/today/singers")
    public ApiResponse<List<SingerListVO>> getSingerByBorn() {
        return singerService.getSingerByBorn(new Date());
    }
}
