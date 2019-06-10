package org.btf.pojo;

import java.io.Serializable;

public class Clazz implements Serializable{
    private String clazzId;
    private String clazzName;
    private int count;

    public void setClazzId(String clazzId) {
        this.clazzId = clazzId;
    }

    public String getClazzId() {
        return clazzId;
    }

    public void setClazzName(String clazzName) {
        this.clazzName = clazzName;
    }

    public String getClazzName() {
        return clazzName;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public Clazz(String clazzId, String clazzName, int count) {
        this.clazzId = clazzId;
        this.clazzName = clazzName;
        this.count = count;
    }

    public Clazz() {
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "clazzId='" + clazzId + '\'' +
                ", clazzName='" + clazzName + '\'' +
                ", count=" + count +
                '}';
    }
}
