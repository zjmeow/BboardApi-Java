package com.zjmeow.bboard.service;

import com.zjmeow.bboard.model.vo.ApiResponse;
import com.zjmeow.bboard.model.vo.SongDetailVO;
import com.zjmeow.bboard.model.vo.SongListVO;

import java.util.List;

public interface SongService {
    ApiResponse<List<SongListVO>> searchSong(String title);

    ApiResponse<SongDetailVO> getSongDetail(Integer id);
}
