package com.zjmeow.bboard.service.impl;

import com.zjmeow.bboard.dao.BillboardMapper;
import com.zjmeow.bboard.model.po.Billboard;
import com.zjmeow.bboard.model.vo.BillboardListVO;
import com.zjmeow.bboard.service.BillboardService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BillboardServiceImpl implements BillboardService {

    private final BillboardMapper billboardMapper;
    private final ModelMapper modelMapper;

    @Autowired
    public BillboardServiceImpl(BillboardMapper billboardMapper, ModelMapper modelMapper) {
        this.billboardMapper = billboardMapper;
        this.modelMapper = modelMapper;
    }


    @Override
    public List<BillboardListVO> getBillboard() {
        List<Billboard> billboards = billboardMapper.selectNewestBillboard();
        List<BillboardListVO> billboardListVOS = modelMapper.map(billboards, new TypeToken<List<BillboardListVO>>() {
        }.getType());
        log.info("getBillboard->" + billboardListVOS);
        return billboardListVOS;
    }
}
