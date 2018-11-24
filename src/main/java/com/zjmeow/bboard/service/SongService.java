package com.zjmeow.bboard.service;

import com.zjmeow.bboard.model.vo.SongDetailVO;
import com.zjmeow.bboard.model.vo.SongListVO;

import java.util.List;

public interface SongService {
    List<SongListVO> searchSong(String title);

    SongDetailVO getSongDetail(Integer id);
}
