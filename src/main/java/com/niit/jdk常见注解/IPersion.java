package com.niit.jdk常见注解;
/**
 * 慕课网java注解
 *  [什么是注解？java提供了源程序中关联任何信息和任何元注解的途径和方法。
 *  为什么使用注解？可以让程序更加简洁，代码更加清晰，能读懂别人的代码特别是框架的代码。
 *  jdk自带的注解 override deprecated @SuppressWarnings
 *  
 *  spring注解 autowire service respository
 *  mybatis注解 
 *  
 *  
 *  ]
 * @作者 jinyy
 * @version [版本号, 2016-9-17]
 * 
 */
public interface IPersion
{
   public String name();
   
   public int age() ;
   @Deprecated
   public void sing() ;//过时的注解
   
}
