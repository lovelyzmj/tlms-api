package com.xupt.tlms.pojo;

import java.io.Serializable;

public class Research implements Serializable {

    private static final long serialVersionUID = 1415852192397895853L;

    private int id;//研究方向id
    private String name;//研究方向名称
    private String brief;//研究方向简述
    private int teamId;//所属团队id
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

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Research{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brief='" + brief + '\'' +
                ", teamId=" + teamId +
                ", createTime=" + createTime +
                '}';
    }
}
