package com.xupt.tlms.pojo;

import java.io.Serializable;

public class KeyWord implements Serializable {
    private static final long serialVersionUID = 1415852192397895853L;

    private int id;//关键字id
    private String name;//关键字名

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

    @Override
    public String toString() {
        return "KeyWord{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
