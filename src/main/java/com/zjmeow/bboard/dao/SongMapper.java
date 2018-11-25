package com.zjmeow.bboard.dao;

import com.zjmeow.bboard.model.po.Song;

import java.util.List;

public interface SongMapper {
    List<Song> selectSongByTitle(String title);

    Song selectSongBySingerId(Integer id);

    Song selectSongById(Integer id);
}