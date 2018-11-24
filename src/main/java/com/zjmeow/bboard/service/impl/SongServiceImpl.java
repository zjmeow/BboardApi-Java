package com.zjmeow.bboard.service.impl;

import com.zjmeow.bboard.dao.SongMapper;
import com.zjmeow.bboard.model.vo.SongDetailVO;
import com.zjmeow.bboard.model.vo.SongListVO;
import com.zjmeow.bboard.service.SongService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService {
    private final SongMapper songMapper;
    private final ModelMapper modelMapper;

    @Autowired
    public SongServiceImpl(SongMapper songMapper, ModelMapper modelMapper) {
        this.songMapper = songMapper;
        this.modelMapper = modelMapper;
    }


    @Override
    public List<SongListVO> searchSong(String title) {
        return null;
    }

    @Override
    public SongDetailVO getSongDetail(Integer id) {
//        return modelMapper.map(songMapper.selectByPrimaryKey(id),SongDetailVO.class);
        return null;
    }

}
