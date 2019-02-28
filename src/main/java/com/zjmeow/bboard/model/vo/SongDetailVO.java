package com.zjmeow.bboard.model.vo;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class SongDetailVO {
    private List<SingerListVO> singers;
    private List<BillboardVO> billboards;
    private Integer id;
    private String title;

    @Data
    public static class BillboardVO {
        private Integer rank;
        private Date date;
    }
}
