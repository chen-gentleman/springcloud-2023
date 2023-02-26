package com.chen.serverprovider017003.bean;

/**
 * @author @Chenxc
 * @date 2023年02月25日 23:02
 */
public class User {

    private String name;
    private int age;
    private double height;

    public User(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
