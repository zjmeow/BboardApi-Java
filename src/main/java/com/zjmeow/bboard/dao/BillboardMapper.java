package com.zjmeow.bboard.dao;

import com.zjmeow.bboard.model.dto.Billboard;
import com.zjmeow.bboard.model.dto.BillboardExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BillboardMapper {
    long countByExample(BillboardExample example);

    int deleteByExample(BillboardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Billboard record);

    int insertSelective(Billboard record);

    List<Billboard> selectByExample(BillboardExample example);

    Billboard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Billboard record, @Param("example") BillboardExample example);

    int updateByExample(@Param("record") Billboard record, @Param("example") BillboardExample example);

    int updateByPrimaryKeySelective(Billboard record);

    int updateByPrimaryKey(Billboard record);
}