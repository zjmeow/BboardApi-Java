package com.zjmeow.bboard.service;


import com.zjmeow.bboard.model.vo.ApiResponse;
import com.zjmeow.bboard.model.vo.SingerDetailVO;
import com.zjmeow.bboard.model.vo.SingerListVO;

import java.util.Date;
import java.util.List;

public interface SingerService {
    ApiResponse<List<SingerListVO>> searchSinger(String name);

    ApiResponse<List<SingerListVO>> getSingerByBorn(Date date);

    ApiResponse<SingerDetailVO> getSingerDetail(Integer id);
}
