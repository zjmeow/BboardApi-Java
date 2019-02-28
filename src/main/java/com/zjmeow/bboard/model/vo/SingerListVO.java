package com.zjmeow.bboard.model.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;


@Data
public class SingerListVO {
    private Integer id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String image;
    private String name;
}
