package com.xupt.tlms.vojo;

import java.io.Serializable;

public class NotesVo implements Serializable {
    private int id;//笔记id
    private String content;//笔记内容
    private String nickName;//笔记作者昵称
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "NotesVo{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", nickName='" + nickName + '\'' +
                ", createTime=" + createTime +
                ", status=" + status +
                '}';
    }
}
