package com.zjmeow.bboard.dao;

import com.zjmeow.bboard.model.po.Billboard;
import com.zjmeow.bboard.model.po.BillboardExample;

import java.util.List;

public interface BillboardMapper {
    long countByExample(BillboardExample example);

    List<Billboard> selectByExample(BillboardExample example);

    Billboard selectByPrimaryKey(Integer id);

}