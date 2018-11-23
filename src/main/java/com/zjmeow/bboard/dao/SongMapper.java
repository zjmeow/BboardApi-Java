package com.zjmeow.bboard.dao;

import com.zjmeow.bboard.model.dto.Song;
import com.zjmeow.bboard.model.dto.SongExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SongMapper {
    long countByExample(SongExample example);

    int deleteByExample(SongExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Song record);

    int insertSelective(Song record);

    List<Song> selectByExample(SongExample example);

    Song selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Song record, @Param("example") SongExample example);

    int updateByExample(@Param("record") Song record, @Param("example") SongExample example);

    int updateByPrimaryKeySelective(Song record);

    int updateByPrimaryKey(Song record);
}