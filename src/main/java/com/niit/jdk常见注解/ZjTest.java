package com.niit.jdk常见注解;
/**
 * jdk常用注解
 *  [一句话功能简述]
 *  [功能详细描述]
 * @作者 jinyy
 * @version [版本号, 2016-9-18]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class ZjTest
{
@SuppressWarnings("deprecation")//忽略此注解，用过时的方法，编译时候的注解，在class存在，spring是运行时注解
/**
 * jdk ,第三方，自定义
 *  [一句话功能简述]
 *  [功能详细描述]
 *  @param args    
 * @exception/throws [违例类型] [违例说明]
 * @see [类、类#方法、类#成员]
 */
public static void main(String[] args) {
    IPersion personImpl= new PersonImpl();
    
    personImpl.sing();
}
}
