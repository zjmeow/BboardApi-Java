package com.zjmeow.bboard.service.impl;


import com.zjmeow.bboard.dao.SingerMapper;
import com.zjmeow.bboard.dao.SongMapper;
import com.zjmeow.bboard.exception.ResourceNotFoundException;
import com.zjmeow.bboard.model.po.Singer;
import com.zjmeow.bboard.model.po.Song;
import com.zjmeow.bboard.model.vo.ApiResponse;
import com.zjmeow.bboard.model.vo.SingerDetailVO;
import com.zjmeow.bboard.model.vo.SingerListVO;
import com.zjmeow.bboard.model.vo.SongListVO;
import com.zjmeow.bboard.service.SingerService;
import com.zjmeow.bboard.util.RestResultGenerator;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class SingerServiceImpl implements SingerService {
    private final SingerMapper singerMapper;
    private final SongMapper songMapper;
    private final ModelMapper modelMapper;

    @Autowired
    public SingerServiceImpl(SingerMapper singerMapper, ModelMapper modelMapper, SongMapper songMapper) {
        this.modelMapper = modelMapper;
        this.singerMapper = singerMapper;
        this.songMapper = songMapper;
    }

    @Override
    public ApiResponse<List<SingerListVO>> searchSinger(String name) {
        List<Singer> singers = singerMapper.selectSingerByName(name + "%");
        if (singers == null) {
            throw new ResourceNotFoundException();
        }
        List<SingerListVO> singerListVOS = modelMapper.map(singers, new TypeToken<List<SingerListVO>>() {
        }.getType());
        return RestResultGenerator.genResult(singerListVOS, "OK");
    }

    @Override
    public ApiResponse<List<SingerListVO>> getSingerByBorn(Date date) {

        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
        String born = sdf.format(date);
        List<Singer> singers = singerMapper.selectSingerByBorn("%" + born + "%");
        List<SingerListVO> singerListVOS = modelMapper.map(singers, new TypeToken<List<SingerListVO>>() {
        }.getType());
        return RestResultGenerator.genResult(singerListVOS, "OK");
    }

    @Override
    public ApiResponse<SingerDetailVO> getSingerDetail(Integer id) {
        Singer singer = singerMapper.selectByPrimaryKey(id);
        if (singer == null) {
            throw new ResourceNotFoundException();
        }

        SingerDetailVO singerDetailVO = modelMapper.map(singer, SingerDetailVO.class);
        List<Song> songs = songMapper.selectSongBySingerId(id);
        List<SongListVO> songListVOS = modelMapper.map(songs, new TypeToken<List<SongListVO>>() {
        }.getType());
        singerDetailVO.setSongs(songListVOS);
        return RestResultGenerator.genResult(singerDetailVO, "OK");
    }
}
