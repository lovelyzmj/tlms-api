package com.xupt.tlms.pojo;

import java.io.Serializable;

public class Comment implements Serializable {
    private static final long serialVersionUID = 1415852192397895853L;

    private int id;//评论id
    private String content;//评论内容
    private int userId;//评论用户id
    private long createTime;//评论时间
    private int notesId;//评论笔记id
    private int status;//评论状态（0：删除  1：存在）

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public int getNotesId() {
        return notesId;
    }

    public void setNotesId(int notesId) {
        this.notesId = notesId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", userId=" + userId +
                ", createTime=" + createTime +
                ", notesId=" + notesId +
                ", status=" + status +
                '}';
    }
}
