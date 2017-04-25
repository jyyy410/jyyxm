package com.niit.集合;

public class Person implements Comparable<Person>
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

    @Override
    public int compareTo(Person paramVo) {
        int temp=this.age-paramVo.age;
        return temp==0?this.name.compareTo(paramVo.name):temp;
       
    }
    
    @Override
    public int hashCode() {
        return name.hashCode()+age*37;
    }
    @Override
    public boolean equals(Object obj) {
        if (this==obj) {
            return true;
        }
        Person ojbPerson=(Person) obj;
        if (!(ojbPerson instanceof Person)) {
            throw new ClassCastException("类型异常");
        }
        return this.getName().equals(ojbPerson.getName())&&this.age==ojbPerson.age;
    }
}
