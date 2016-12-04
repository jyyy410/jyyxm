package com.niit.枚举;

import junit.framework.TestCase;
/**
 * 枚举是类，每个成员是一个对象。每个枚举有索引，在weekday.mon的时候，所有的对象调用自己的构造函数被实例化，mon(1);构造参数是1
 *  [一句话功能简述]  枚举只有一个成员时，可以作为单利，因为枚举构造函数私有
 *  别人不可以创建对象，只有自己可以创建自己定义的对象。
 *  [功能详细描述]
 * @作者 jinyy
 * @version [版本号, 2016-11-12]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class WeekDayTest extends TestCase
{

public void test() {
    WeekDay item =WeekDay.MON;
    System.out.println("item_-----------"+item);
    System.out.println(item.toString());

    System.out.println(item.name());;
    System.out.println(item.ordinal());
    
    System.out.println(WeekDay.values().length);
    WeekDay[] a =WeekDay.values();
    
    for (int i = 0; i < a.length; i++) {
       // System.out.print(a[i]); 
    }
    System.out.println(WeekDay.valueOf("MON"));
}
}
