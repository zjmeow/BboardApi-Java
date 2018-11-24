package com.zjmeow.bboard.model.po;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author
 */
@Data
public class Song implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String title;
    private List<Singer> singers;
}