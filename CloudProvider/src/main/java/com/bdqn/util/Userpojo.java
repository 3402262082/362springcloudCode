package com.bdqn.util;

public class Userpojo {

    private int id;
    private String name;
    private String mark;

    public Userpojo() {
    }

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

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Userpojo(int id, String name, String mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }
}
