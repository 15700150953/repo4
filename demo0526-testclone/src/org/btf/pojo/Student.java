package org.btf.pojo;

import java.io.Serializable;

public class Student implements Cloneable ,Serializable{
    private String id;
    private String name;
    private String sex;
    private Clazz clazz;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public Student(String id, String name, String sex, Clazz clazz) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.clazz = clazz;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", clazz=" + clazz +
                '}';
    }
}
