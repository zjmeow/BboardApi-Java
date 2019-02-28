package com.zjmeow.bboard.model.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;
import java.util.List;

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
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<SingerListVO> singers;
}
