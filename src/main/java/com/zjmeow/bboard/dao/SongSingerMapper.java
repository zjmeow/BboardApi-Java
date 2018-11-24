package com.zjmeow.bboard.dao;

import com.zjmeow.bboard.model.dto.SongSinger;
import com.zjmeow.bboard.model.dto.SongSingerExample;

import java.util.List;

public interface SongSingerMapper {
    long countByExample(SongSingerExample example);

    List<SongSinger> selectByExample(SongSingerExample example);

}