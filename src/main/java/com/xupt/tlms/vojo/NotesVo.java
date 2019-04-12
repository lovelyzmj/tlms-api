package com.xupt.tlms.vojo;

import java.io.Serializable;

public class NotesVo implements Serializable {
    private int id;//笔记id
    private String content;//笔记内容
    private int userId;//作者id
    private String nickName;//笔记作者昵称
    private long createTime;//发表时间
    private int literatureId;//所属文献Id
    private String literatureName;//所属文献名称
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

    public String getLiteratureName() {
        return literatureName;
    }

    public void setLiteratureName(String literatureName) {
        this.literatureName = literatureName;
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

    @Override
    public String toString() {
        return "NotesVo{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", userId=" + userId +
                ", nickName='" + nickName + '\'' +
                ", createTime=" + createTime +
                ", literatureId=" + literatureId +
                ", literatureName='" + literatureName + '\'' +
                ", status=" + status +
                '}';
    }
}
