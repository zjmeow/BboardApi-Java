package com.zjmeow.bboard.service.impl;


import com.zjmeow.bboard.model.vo.SingerDetailVO;
import com.zjmeow.bboard.model.vo.SingerListVO;
import com.zjmeow.bboard.service.SingerService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SingerServiceImpl implements SingerService {
    @Override
    public List<SingerListVO> searchSinger(String name) {
        return null;
    }

    @Override
    public List<SingerListVO> getSinger(Date date) {
        return null;
    }

    @Override
    public SingerDetailVO getSingerDetail(Long id) {
        return null;
    }
}
