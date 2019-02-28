package com.zjmeow.bboard.service;

import com.zjmeow.bboard.model.vo.ApiResponse;
import com.zjmeow.bboard.model.vo.BillboardListVO;

import java.util.List;

public interface BillboardService {
    ApiResponse<List<BillboardListVO>> getBillboard();

    ApiResponse<List<BillboardListVO>> getBillboardByDate(String date);
}
