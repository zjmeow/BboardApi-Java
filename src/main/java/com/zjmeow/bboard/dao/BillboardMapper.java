package com.zjmeow.bboard.dao;

import com.zjmeow.bboard.model.po.Billboard;

import java.util.List;

public interface BillboardMapper {
    List<Billboard> selectNewestBillboard();

    List<Billboard> selectRankBySongId(Integer songId);
}