package com.zjmeow.bboard.model.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author
 */
public class Billboard implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private Integer previous;
    private Integer weeks;
    private Integer peak;
    private Integer rank;
    private Date date;
    private Integer songId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrevious() {
        return previous;
    }

    public void setPrevious(Integer previous) {
        this.previous = previous;
    }

    public Integer getWeeks() {
        return weeks;
    }

    public void setWeeks(Integer weeks) {
        this.weeks = weeks;
    }

    public Integer getPeak() {
        return peak;
    }

    public void setPeak(Integer peak) {
        this.peak = peak;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getSongId() {
        return songId;
    }

    public void setSongId(Integer songId) {
        this.songId = songId;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Billboard other = (Billboard) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getPrevious() == null ? other.getPrevious() == null : this.getPrevious().equals(other.getPrevious()))
                && (this.getWeeks() == null ? other.getWeeks() == null : this.getWeeks().equals(other.getWeeks()))
                && (this.getPeak() == null ? other.getPeak() == null : this.getPeak().equals(other.getPeak()))
                && (this.getRank() == null ? other.getRank() == null : this.getRank().equals(other.getRank()))
                && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
                && (this.getSongId() == null ? other.getSongId() == null : this.getSongId().equals(other.getSongId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPrevious() == null) ? 0 : getPrevious().hashCode());
        result = prime * result + ((getWeeks() == null) ? 0 : getWeeks().hashCode());
        result = prime * result + ((getPeak() == null) ? 0 : getPeak().hashCode());
        result = prime * result + ((getRank() == null) ? 0 : getRank().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getSongId() == null) ? 0 : getSongId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", previous=").append(previous);
        sb.append(", weeks=").append(weeks);
        sb.append(", peak=").append(peak);
        sb.append(", rank=").append(rank);
        sb.append(", date=").append(date);
        sb.append(", songId=").append(songId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}