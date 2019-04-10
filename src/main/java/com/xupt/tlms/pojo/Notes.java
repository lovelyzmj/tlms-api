package com.xupt.tlms.pojo;

import java.io.Serializable;

public class Notes implements Serializable {
    private static final long serialVersionUID = 1415852192397895853L;

    private int id;//笔记id
    private String content;//笔记内容
    private int userId;//笔记作者id
    private int literatureId;//笔记所属文献id
    private long createTime;//发表时间
    private int status;//笔记状态 （0：公开  1：私有）

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

    public int getLiteratureId() {
        return literatureId;
    }

    public void setLiteratureId(int literatureId) {
        this.literatureId = literatureId;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Notes{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", userId=" + userId +
                ", literatureId=" + literatureId +
                ", createTime=" + createTime +
                ", status=" + status +
                '}';
    }
}
