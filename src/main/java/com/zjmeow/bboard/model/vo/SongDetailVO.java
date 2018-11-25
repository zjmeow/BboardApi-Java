package com.zjmeow.bboard.model.vo;

import lombok.Data;

import java.util.List;

@Data
public class SongDetailVO {
    private List<SingerListVO> singers;
    private List<BillboardListVO> billboardListVOS;
    private Integer id;
    private String title;

}
