package com.zjmeow.bboard.controller;

import com.zjmeow.bboard.model.vo.ApiResponse;
import com.zjmeow.bboard.model.vo.SongDetailVO;
import com.zjmeow.bboard.model.vo.SongListVO;
import com.zjmeow.bboard.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SongController {
    private final SongService songService;

    @Autowired
    public SongController(SongService songService) {
        this.songService = songService;
    }


    @GetMapping("/song/{title}")
    public ApiResponse<List<SongListVO>> searchSong(@PathVariable(value = "title") String title) {
        return songService.searchSong(title);
    }

    @GetMapping("/song/detail/{id}")
    public ApiResponse<SongDetailVO> searchSong(@PathVariable(value = "id") Integer id) {
        return songService.getSongDetail(id);
    }
}
