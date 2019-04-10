package com.xupt.tlms.pojo;

import java.io.Serializable;

public class Reply implements Serializable {
    private static final long serialVersionUID = 1415852192397895853L;

    private int id;//回复id
    private String content;//回复内容
    private long createTime;//回复时间
    private int userId;//回复用户id
    private int commentId;//评论ID
    private int status;//状态（0：已删除 1：存在）

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

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", createTime=" + createTime +
                ", userId=" + userId +
                ", commentId=" + commentId +
                ", status=" + status +
                '}';
    }
}
