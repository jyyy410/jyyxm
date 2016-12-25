package com.niit.jdk常见注解.自定义注解.解析注解;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import com.niit.jdk常见注解.自定义注解.ZdyZj;

public class ParseTest
{
public static void main(String[] args) {
    try {
      Class testClass =  Class.forName("com.niit.自定义注解.ChildClient");
      
      boolean ishas = testClass.isAnnotationPresent(ZdyZj.class);//类上面的注解

      if (ishas) {
          ZdyZj zj = (ZdyZj) testClass.getAnnotation(ZdyZj.class);//拿到注解实例。
          System.out.println(zj.age());
      }
      
      
      Method [] methods =testClass.getMethods();
            for (Method method : methods) {
                boolean ishas2 = method.isAnnotationPresent(ZdyZj.class);//方法上的注解

                if (ishas2) {
                    ZdyZj zj = (ZdyZj) method.getAnnotation(ZdyZj.class);//拿到方法上的注解
                    System.out.println(zj.age());
                }
            }
   
      //如果指定类型的注释存在于此元素上，则返回 true，否则返回 false。
            
            //换一种方式
            
            for (Method method : methods) {
                Annotation [] anns = method.getAnnotations();
                for (Annotation annotation : anns) {
                    if (annotation instanceof ZdyZj) {
                        ZdyZj zdyZj=(ZdyZj) annotation;
                        System.out.println(zdyZj.age());
                    }
                }
            }
   
    }
    catch (ClassNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}
}
