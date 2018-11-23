package com.zjmeow.bboard.model.dto;

import java.io.Serializable;

/**
 * @author
 */
public class SongSinger implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer songId;
    private Integer singerId;

    public Integer getSongId() {
        return songId;
    }

    public void setSongId(Integer songId) {
        this.songId = songId;
    }

    public Integer getSingerId() {
        return singerId;
    }

    public void setSingerId(Integer singerId) {
        this.singerId = singerId;
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
        SongSinger other = (SongSinger) that;
        return (this.getSongId() == null ? other.getSongId() == null : this.getSongId().equals(other.getSongId()))
                && (this.getSingerId() == null ? other.getSingerId() == null : this.getSingerId().equals(other.getSingerId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSongId() == null) ? 0 : getSongId().hashCode());
        result = prime * result + ((getSingerId() == null) ? 0 : getSingerId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", songId=").append(songId);
        sb.append(", singerId=").append(singerId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}