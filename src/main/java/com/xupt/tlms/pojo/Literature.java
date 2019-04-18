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
    private String publish;//出版社
    private String publishTime;//出版时间
    private String remarks; //科技文献摘要
    private int userId;//上传者ID
    private int status;//共享状态  0：不共享  1：共享

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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
                ", publish='" + publish + '\'' +
                ", publishTime='" + publishTime + '\'' +
                ", remarks='" + remarks + '\'' +
                ", userId=" + userId +
                ", status=" + status +
                '}';
    }
}
