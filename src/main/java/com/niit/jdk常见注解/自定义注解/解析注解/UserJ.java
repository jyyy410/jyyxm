package com.niit.jdk常见注解.自定义注解.解析注解;
@Table2("cms_user")
public class UserJ
{@Column2("username")
    private String username;
    private String age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
