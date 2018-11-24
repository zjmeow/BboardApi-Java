package com.zjmeow.bboard.dao;

import com.zjmeow.bboard.model.dto.Singer;
import com.zjmeow.bboard.model.dto.SingerExample;

import java.util.List;

public interface SingerMapper {
    long countByExample(SingerExample example);

    List<Singer> selectByExampleWithBLOBs(SingerExample example);

    List<Singer> selectByExample(SingerExample example);

    Singer selectByPrimaryKey(Integer id);


}