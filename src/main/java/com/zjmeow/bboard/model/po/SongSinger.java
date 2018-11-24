package com.zjmeow.bboard.model.po;

import lombok.Data;

import java.io.Serializable;

/**
 * @author
 */
@Data
public class SongSinger implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer songId;
    private Integer singerId;
}