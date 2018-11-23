package com.zjmeow.bboard.model.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author
 */
public class Singer implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String image;
    private String name;
    private String area;
    private String type;
    private Date born;
    private String info;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getBorn() {
        return born;
    }

    public void setBorn(Date born) {
        this.born = born;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
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
        Singer other = (Singer) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getImage() == null ? other.getImage() == null : this.getImage().equals(other.getImage()))
                && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
                && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
                && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
                && (this.getBorn() == null ? other.getBorn() == null : this.getBorn().equals(other.getBorn()))
                && (this.getInfo() == null ? other.getInfo() == null : this.getInfo().equals(other.getInfo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getImage() == null) ? 0 : getImage().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getBorn() == null) ? 0 : getBorn().hashCode());
        result = prime * result + ((getInfo() == null) ? 0 : getInfo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", image=").append(image);
        sb.append(", name=").append(name);
        sb.append(", area=").append(area);
        sb.append(", type=").append(type);
        sb.append(", born=").append(born);
        sb.append(", info=").append(info);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}