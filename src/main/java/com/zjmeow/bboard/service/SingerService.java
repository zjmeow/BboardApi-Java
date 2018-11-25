package com.zjmeow.bboard.service;


import com.zjmeow.bboard.model.vo.SingerDetailVO;
import com.zjmeow.bboard.model.vo.SingerListVO;

import java.util.Date;
import java.util.List;

public interface SingerService {
    List<SingerListVO> searchSinger(String name);

    List<SingerListVO> getSinger(Date date);

    SingerDetailVO getSingerDetail(Integer id);
}
