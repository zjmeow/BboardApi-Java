package com.zjmeow.bboard.model.vo;

import lombok.Data;

import java.util.List;

@Data
public class SongListVO {
    private Integer id;
    private String title;
    private List<SingerListVO> singers;
}
