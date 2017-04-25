package com.niit.集合;

import java.util.LinkedList;

/**
 * 
 * [一句话功能简述] [offerFirst在列表的开头插入   peek获取第一个元素但是不移除（get）  poll获取并移除第一个元素（remove）  如果集合为空不抛出异常  ，返回null
 * 
 * removeFirst 如果集合为空抛出异常 NoSuchElemntException
 * 
 * @作者 jinyy
 * @version [版本号, 2016-11-6]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class DuiLieTest
{
    //队列，先进先出   相反的方法是队列     相同的方法是堆栈  试管
    private LinkedList<Object> linkedList;

    public DuiLieTest() {
        linkedList = new LinkedList<Object>();
    }

    public void add(Object object) {
        linkedList.addLast(object);

    }

    public Object getItem() {
        return linkedList.removeFirst();
    }
    
    public boolean isNull() {
        return linkedList.isEmpty();
        
    }

}
