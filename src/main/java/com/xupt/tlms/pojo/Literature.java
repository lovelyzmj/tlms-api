package com.xupt.tlms.pojo;

import java.io.Serializable;

public class Literature implements Serializable {
    private static final long serialVersionUID = 1415852192397895853L;

    private int id;//科技文献id
    private String name;//科技文献名称
    private String year;//科技文献年份
    private String author;//科技文献作者
    private long time;//入库时间
    private String path;// 科技文献路径
    private String remarks; //科技文献摘要

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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Literature{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", author='" + author + '\'' +
                ", time=" + time +
                ", path='" + path + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
