package com.ggs.domain;

//默认 通过service 类调用 dao类完成 SysUser插入到数据库的操作
public class SysUser {
    private String name;
    private int age;

    public SysUser() {
    }

    public SysUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
