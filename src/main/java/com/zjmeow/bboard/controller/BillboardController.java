package com.zjmeow.bboard.controller;

import com.zjmeow.bboard.model.vo.ApiResponse;
import com.zjmeow.bboard.model.vo.BillboardListVO;
import com.zjmeow.bboard.service.BillboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BillboardController {
    private final BillboardService billboardService;

    @Autowired
    public BillboardController(BillboardService billboardService) {
        this.billboardService = billboardService;
    }

    @GetMapping("/billboards")
    ApiResponse<List<BillboardListVO>> getRank() {
        return billboardService.getBillboard();
    }

    @GetMapping("/billboards/{date}")
    ApiResponse<List<BillboardListVO>> getRankByDate(@PathVariable(value = "date") String date) {
        return billboardService.getBillboardByDate(date);
    }

}
