package com.zjmeow.bboard.service;

import com.zjmeow.bboard.model.vo.BillboardListVO;

import java.util.List;

public interface BillboardService {
    List<BillboardListVO> getBillboard();
}
