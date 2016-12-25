package com.niit.jdk常见注解.自定义注解.解析注解;

import com.niit.jdk常见注解.自定义注解.ZdyZj;

public class MyHibernateFrame
{
 public static void main(String[] args) {
    try {
       Class class1 =Class.forName("");
      boolean isP= class1.isAnnotationPresent(ZdyZj.class);
      if (isP) {
        
    }
    }
    catch (ClassNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}
}
