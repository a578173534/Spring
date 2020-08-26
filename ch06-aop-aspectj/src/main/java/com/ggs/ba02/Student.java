package com.ggs.ba02;

public class Student {

    private String name;
    private int age;

    public Student() {
        System.out.println("spring会调用类的无参数构造方法创建对象");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setEmail(String email) {
        System.out.println("setEmail=" + email);
    }

    public String getName() {
        return name;
    }

    /*
         需要有set方法，没有set方法是报错的。
         Bean property 'name' is not writable or has an invalid setter method
    */
    public void setName(String name) {
        System.out.println("setName:" + name);
        this.name = name.toUpperCase();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setAge:" + age);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
