package com.example.domain.entity;

import java.io.Serializable;
import java.util.Date;

public class TaskDetails implements Serializable {
    private Long taskDetailId;

    private Long taskId;

    private String taskContent;

    private Integer taskPriority;

    private Date createdAt;

    private String createdBy;

    private Date updatedAt;

    private String updatedBy;

    private static final long serialVersionUID = 1L;

    public Long getTaskDetailId() {
        return taskDetailId;
    }

    public void setTaskDetailId(Long taskDetailId) {
        this.taskDetailId = taskDetailId;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getTaskContent() {
        return taskContent;
    }

    public void setTaskContent(String taskContent) {
        this.taskContent = taskContent == null ? null : taskContent.trim();
    }

    public Integer getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(Integer taskPriority) {
        this.taskPriority = taskPriority;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", taskDetailId=").append(taskDetailId);
        sb.append(", taskId=").append(taskId);
        sb.append(", taskContent=").append(taskContent);
        sb.append(", taskPriority=").append(taskPriority);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", updatedBy=").append(updatedBy);
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
        TaskDetails other = (TaskDetails) that;
        return (this.getTaskDetailId() == null ? other.getTaskDetailId() == null : this.getTaskDetailId().equals(other.getTaskDetailId()))
            && (this.getTaskId() == null ? other.getTaskId() == null : this.getTaskId().equals(other.getTaskId()))
            && (this.getTaskContent() == null ? other.getTaskContent() == null : this.getTaskContent().equals(other.getTaskContent()))
            && (this.getTaskPriority() == null ? other.getTaskPriority() == null : this.getTaskPriority().equals(other.getTaskPriority()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getCreatedBy() == null ? other.getCreatedBy() == null : this.getCreatedBy().equals(other.getCreatedBy()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()))
            && (this.getUpdatedBy() == null ? other.getUpdatedBy() == null : this.getUpdatedBy().equals(other.getUpdatedBy()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTaskDetailId() == null) ? 0 : getTaskDetailId().hashCode());
        result = prime * result + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        result = prime * result + ((getTaskContent() == null) ? 0 : getTaskContent().hashCode());
        result = prime * result + ((getTaskPriority() == null) ? 0 : getTaskPriority().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        result = prime * result + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        result = prime * result + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        result = prime * result + ((getUpdatedBy() == null) ? 0 : getUpdatedBy().hashCode());
        return result;
    }
}