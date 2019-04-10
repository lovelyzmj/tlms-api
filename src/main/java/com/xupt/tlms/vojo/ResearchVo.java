package com.xupt.tlms.vojo;

import java.io.Serializable;

public class ResearchVo implements Serializable {
    private static final long serialVersionUID = 1415852192397895853L;
    private int id;//研究方向id
    private String name;//研究方向名称
    private String brief;//研究方向简述
    private String teamName;//所属创建团队名称
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

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public String toString() {
        return "ReaserchVo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brief='" + brief + '\'' +
                ", teamName='" + teamName + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
