package com.zjmeow.bboard.model.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author
 */
@Data
public class Billboard implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private Integer previous;
    private Integer weeks;
    private Integer peak;
    private Integer rank;
    private Date date;
    private Integer songId;
    private String title;

}