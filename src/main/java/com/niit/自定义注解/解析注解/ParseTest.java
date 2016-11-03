package com.niit.自定义注解.解析注解;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.logging.Logger;

import com.niit.自定义注解.TestZdyZj;

public class ParseTest
{
public static void main(String[] args) {
    try {
      Class testClass =  Class.forName("com.niit.自定义注解.ChildClient");
      
      boolean ishas = testClass.isAnnotationPresent(TestZdyZj.class);

      if (ishas) {
          TestZdyZj zj = (TestZdyZj) testClass.getAnnotation(TestZdyZj.class);
          System.out.println(zj.age());
      }
      
      
      Method [] methods =testClass.getMethods();
            for (Method method : methods) {
                boolean ishas没 = method.isAnnotationPresent(TestZdyZj.class);

                if (ishas没) {
                    TestZdyZj zj = (TestZdyZj) method.getAnnotation(TestZdyZj.class);
                    System.out.println(zj.age());
                }
            }
   
      //如果指定类型的注释存在于此元素上，则返回 true，否则返回 false。
   
    }
    catch (ClassNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}
}
