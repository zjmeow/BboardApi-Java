package com.zjmeow.bboard.dao;

import com.zjmeow.bboard.model.po.Singer;

import java.util.List;

public interface SingerMapper {

    Singer selectByPrimaryKey(Integer id);

    List<Singer> selectSingerBySongId(Integer songId);

    List<Singer> selectSingerByName(String name);

    List<Singer> selectSingerByBorn(String born);
}