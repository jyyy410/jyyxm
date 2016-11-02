package com.niit.jdk常见注解;
/**
 * 慕课网java注解
 *  [一句话功能简述]
 *  [功能详细描述]
 * @作者 jinyy
 * @version [版本号, 2016-9-17]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public interface IPersion
{
   public String name();
   
   public int age() ;
   @Deprecated
   public void sing() ;
   
}
