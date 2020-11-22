package com.example.domain.entity;

import java.io.Serializable;

public class MPriority implements Serializable {
    private Integer priorityId;

    private String priorityName;

    private static final long serialVersionUID = 1L;

    public Integer getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(Integer priorityId) {
        this.priorityId = priorityId;
    }

    public String getPriorityName() {
        return priorityName;
    }

    public void setPriorityName(String priorityName) {
        this.priorityName = priorityName == null ? null : priorityName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", priorityId=").append(priorityId);
        sb.append(", priorityName=").append(priorityName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
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
        MPriority other = (MPriority) that;
        return (this.getPriorityId() == null ? other.getPriorityId() == null : this.getPriorityId().equals(other.getPriorityId()))
            && (this.getPriorityName() == null ? other.getPriorityName() == null : this.getPriorityName().equals(other.getPriorityName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPriorityId() == null) ? 0 : getPriorityId().hashCode());
        result = prime * result + ((getPriorityName() == null) ? 0 : getPriorityName().hashCode());
        return result;
    }
}