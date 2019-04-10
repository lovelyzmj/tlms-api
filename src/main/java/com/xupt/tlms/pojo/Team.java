package com.xupt.tlms.pojo;

import java.io.Serializable;

public class Team implements Serializable {

    private static final long serialVersionUID = 1415852192397895853L;

    private int id;//团队id
    private String name;//团队名称
    private String brief;//团队简介
    private int createrId;//创建者
    private long createTime;//创建时间

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public int getCreaterId() {
        return createrId;
    }

    public void setCreaterId(int createrId) {
        this.createrId = createrId;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brief='" + brief + '\'' +
                ", createrId=" + createrId +
                ", createTime=" + createTime +
                '}';
    }
}
