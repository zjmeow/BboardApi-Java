package com.zjmeow.bboard.model.vo;

import lombok.Data;

import java.util.Date;

@Data
public class BillboardListVO {
    private Integer id;
    private Integer previous;
    private Integer weeks;
    private Integer peak;
    private Integer rank;
    private Date date;
    private Integer songId;
    private String title;
}
