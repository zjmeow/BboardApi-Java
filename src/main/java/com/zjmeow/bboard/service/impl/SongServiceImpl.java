package com.zjmeow.bboard.service.impl;

import com.zjmeow.bboard.dao.BillboardMapper;
import com.zjmeow.bboard.dao.SingerMapper;
import com.zjmeow.bboard.dao.SongMapper;
import com.zjmeow.bboard.model.po.Billboard;
import com.zjmeow.bboard.model.po.Singer;
import com.zjmeow.bboard.model.po.Song;
import com.zjmeow.bboard.model.vo.*;
import com.zjmeow.bboard.service.SongService;
import com.zjmeow.bboard.util.RestResultGenerator;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class SongServiceImpl implements SongService {
    private final SongMapper songMapper;
    private final SingerMapper singerMapper;
    private final BillboardMapper billboardMapper;
    private final ModelMapper modelMapper;

    @Autowired
    public SongServiceImpl(SongMapper songMapper, ModelMapper modelMapper, SingerMapper singerMapper, BillboardMapper billboardMapper) {
        this.songMapper = songMapper;
        this.modelMapper = modelMapper;
        this.singerMapper = singerMapper;
        this.billboardMapper = billboardMapper;

    }


    @Override
    public ApiResponse<List<SongListVO>> searchSong(String title) {
        List<Song> songs = songMapper.selectSongByTitle(title + "%");
        List<SongListVO> songListVOS = modelMapper.map(songs, new TypeToken<List<SongListVO>>() {
        }.getType());
        return RestResultGenerator.genResult(songListVOS, "OK");
    }


    @Override
    public ApiResponse<SongDetailVO> getSongDetail(Integer id) {
        List<Singer> singers = singerMapper.selectSingerBySongId(id);
        List<Billboard> billboards = billboardMapper.selectRankBySongId(id);
        List<SingerListVO> singerListVOS = modelMapper.map(singers, new TypeToken<List<SingerListVO>>() {
        }.getType());
        List<BillboardListVO> billboardListVOS = modelMapper.map(billboards, new TypeToken<List<BillboardListVO>>() {
        }.getType());

        Song song = songMapper.selectSongById(id);
        SongDetailVO songDetailVO = modelMapper.map(song, SongDetailVO.class);
        songDetailVO.setSingers(singerListVOS);
        songDetailVO.setBillboardListVOS(billboardListVOS);
        log.info("" + songDetailVO);
        return RestResultGenerator.genResult(songDetailVO, "OK");
    }

}
