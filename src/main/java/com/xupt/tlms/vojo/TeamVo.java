package com.xupt.tlms.vojo;

import java.io.Serializable;
import java.util.Date;

public class TeamVo implements Serializable {

    private static final long serialVersionUID = 1415852192397895853L;

    private int id;//团队id
    private String name;//团队名称
    private String brief;//团队简介
    private String createrName;//创建者姓名
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

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public String getCreaterName() {
        return createrName;
    }

    public void setCreaterName(String createrName) {
        this.createrName = createrName;
    }

    @Override
    public String toString() {
        return "TeamVo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brief='" + brief + '\'' +
                ", createrName=" + createrName +
                ", createTime=" + createTime +
                '}';
    }
}
