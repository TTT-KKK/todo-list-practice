package com.example.domain.entity;

import java.io.Serializable;
import java.util.Date;

public class Task implements Serializable {
    private Long taskId;

    private String taskName;

    private Date taskEndAt;

    private String taskMemo;

    private Integer priorityId;

    private Date createdAt;

    private String createdBy;

    private Date updatedAt;

    private String updatedBy;

    private Long userId;

    private Byte isDone;

    private static final long serialVersionUID = 1L;

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    public Date getTaskEndAt() {
        return taskEndAt;
    }

    public void setTaskEndAt(Date taskEndAt) {
        this.taskEndAt = taskEndAt;
    }

    public String getTaskMemo() {
        return taskMemo;
    }

    public void setTaskMemo(String taskMemo) {
        this.taskMemo = taskMemo == null ? null : taskMemo.trim();
    }

    public Integer getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(Integer priorityId) {
        this.priorityId = priorityId;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Byte getIsDone() {
        return isDone;
    }

    public void setIsDone(Byte isDone) {
        this.isDone = isDone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", taskId=").append(taskId);
        sb.append(", taskName=").append(taskName);
        sb.append(", taskEndAt=").append(taskEndAt);
        sb.append(", taskMemo=").append(taskMemo);
        sb.append(", priorityId=").append(priorityId);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", updatedBy=").append(updatedBy);
        sb.append(", userId=").append(userId);
        sb.append(", isDone=").append(isDone);
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
        Task other = (Task) that;
        return (this.getTaskId() == null ? other.getTaskId() == null : this.getTaskId().equals(other.getTaskId()))
            && (this.getTaskName() == null ? other.getTaskName() == null : this.getTaskName().equals(other.getTaskName()))
            && (this.getTaskEndAt() == null ? other.getTaskEndAt() == null : this.getTaskEndAt().equals(other.getTaskEndAt()))
            && (this.getTaskMemo() == null ? other.getTaskMemo() == null : this.getTaskMemo().equals(other.getTaskMemo()))
            && (this.getPriorityId() == null ? other.getPriorityId() == null : this.getPriorityId().equals(other.getPriorityId()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getCreatedBy() == null ? other.getCreatedBy() == null : this.getCreatedBy().equals(other.getCreatedBy()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()))
            && (this.getUpdatedBy() == null ? other.getUpdatedBy() == null : this.getUpdatedBy().equals(other.getUpdatedBy()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getIsDone() == null ? other.getIsDone() == null : this.getIsDone().equals(other.getIsDone()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        result = prime * result + ((getTaskName() == null) ? 0 : getTaskName().hashCode());
        result = prime * result + ((getTaskEndAt() == null) ? 0 : getTaskEndAt().hashCode());
        result = prime * result + ((getTaskMemo() == null) ? 0 : getTaskMemo().hashCode());
        result = prime * result + ((getPriorityId() == null) ? 0 : getPriorityId().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        result = prime * result + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        result = prime * result + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        result = prime * result + ((getUpdatedBy() == null) ? 0 : getUpdatedBy().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getIsDone() == null) ? 0 : getIsDone().hashCode());
        return result;
    }
}