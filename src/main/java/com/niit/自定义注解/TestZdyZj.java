package com.niit.自定义注解;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 *  [一句话功能简述]  自定义注解
 *  [功能详细描述]
 * @作者 jinyy
 * @version [版本号, 2016-9-18]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */

@Target({ElementType.METHOD,ElementType.TYPE})//target是注解的作用域
@Retention(RetentionPolicy.RUNTIME)//生命周期
@Inherited//允许子注解继承
@Documented//生成doc会包含注解的信息
public @interface TestZdyZj
{
    
    String desc();//成员变量以无参数，无异常的方式声明        
    //基本类型，如果只有一个注解，必须是value();注解类可以没有成员，么有成员的注解称作标识注解
int age() default 18;//成员变量以无参数，无异常的方式声明
}
