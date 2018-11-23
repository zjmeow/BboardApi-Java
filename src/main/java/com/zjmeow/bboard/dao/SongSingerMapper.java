package com.zjmeow.bboard.dao;

import com.zjmeow.bboard.model.dto.SongSinger;
import com.zjmeow.bboard.model.dto.SongSingerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SongSingerMapper {
    long countByExample(SongSingerExample example);

    int deleteByExample(SongSingerExample example);

    int insert(SongSinger record);

    int insertSelective(SongSinger record);

    List<SongSinger> selectByExample(SongSingerExample example);

    int updateByExampleSelective(@Param("record") SongSinger record, @Param("example") SongSingerExample example);

    int updateByExample(@Param("record") SongSinger record, @Param("example") SongSingerExample example);
}