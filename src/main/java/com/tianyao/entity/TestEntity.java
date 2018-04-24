package com.tianyao.entity;

public class TestEntity {
    private Integer sid;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "TestEntity{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                '}';
    }
}
