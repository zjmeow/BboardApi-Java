package com.zjmeow.bboard.dao;

import com.zjmeow.bboard.model.po.Song;
import com.zjmeow.bboard.model.po.SongExample;

import java.util.List;

public interface SongMapper {
    long countByExample(SongExample example);

    List<Song> selectByExample(SongExample example);

    Song selectByPrimaryKey(Integer id);


}