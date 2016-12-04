package com.niit.集合;

public class Person
{
    /**
     * 面向对象，变量私有化封装
     */

    private String name;

    private int age;

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
