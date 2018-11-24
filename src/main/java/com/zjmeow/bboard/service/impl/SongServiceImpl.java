package com.zjmeow.bboard.service.impl;

import com.zjmeow.bboard.model.vo.SongDetailVO;
import com.zjmeow.bboard.model.vo.SongListVO;
import com.zjmeow.bboard.service.SongService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService {
    @Override
    public List<SongListVO> searchSong(String title) {
        return null;
    }

    @Override
    public SongDetailVO getSongDetail(Integer id) {
        return null;
    }
}
