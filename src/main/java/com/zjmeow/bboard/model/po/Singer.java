package com.zjmeow.bboard.model.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author
 */
@Data
public class Singer implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String image;
    private String name;
    private String area;
    private String type;
    private Date born;
    private String info;
    private List<Song> songs;
}