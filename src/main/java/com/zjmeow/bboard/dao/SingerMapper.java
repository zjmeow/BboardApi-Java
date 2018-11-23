package com.zjmeow.bboard.dao;

import com.zjmeow.bboard.model.dto.Singer;
import com.zjmeow.bboard.model.dto.SingerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SingerMapper {
    long countByExample(SingerExample example);

    int deleteByExample(SingerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Singer record);

    int insertSelective(Singer record);

    List<Singer> selectByExampleWithBLOBs(SingerExample example);

    List<Singer> selectByExample(SingerExample example);

    Singer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Singer record, @Param("example") SingerExample example);

    int updateByExampleWithBLOBs(@Param("record") Singer record, @Param("example") SingerExample example);

    int updateByExample(@Param("record") Singer record, @Param("example") SingerExample example);

    int updateByPrimaryKeySelective(Singer record);

    int updateByPrimaryKeyWithBLOBs(Singer record);

    int updateByPrimaryKey(Singer record);
}