package com.zjmeow.bboard.model.vo;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class SingerDetailVO {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String image;
    private String name;
    private String area;
    private String type;
    private Date born;
    private String info;
    private List<SongListVO> songs;


}
