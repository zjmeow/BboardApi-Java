package com.zjmeow.bboard.service.impl;

import com.zjmeow.bboard.dao.BillboardMapper;
import com.zjmeow.bboard.model.vo.BillboardListVO;
import com.zjmeow.bboard.service.BillboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillboardServiceImpl implements BillboardService {

    private final BillboardMapper billboardMapper;

    @Autowired
    public BillboardServiceImpl(BillboardMapper billboardMapper) {
        this.billboardMapper = billboardMapper;
    }


    @Override
    public List<BillboardListVO> getBillboard() {
        System.out.println(billboardMapper.selectNewestBillboard());
        return null;
    }
}
