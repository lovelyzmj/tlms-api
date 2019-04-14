package com.xupt.tlms.vojo;

import java.io.Serializable;

public class CommentVo implements Serializable {
    private int id;//评论id
    private String content;//评论内容
    private int userId;//评论用户id
    private String nickName;//评论用户昵称
    private long createTime;//评论时间
    private int notesId;//评论笔记id
    private String notesContent;//笔记内容
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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
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

    public String getNotesContent() {
        return notesContent;
    }

    public void setNotesContent(String notesContent) {
        this.notesContent = notesContent;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CommentVo{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", userId=" + userId +
                ", nickName='" + nickName + '\'' +
                ", createTime=" + createTime +
                ", notesId=" + notesId +
                ", notesContent='" + notesContent + '\'' +
                ", status=" + status +
                '}';
    }
}
