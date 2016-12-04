package com.niit.集合;

import java.util.LinkedList;

/**
 * 
 * [一句话功能简述] [功能详细描述]
 * 
 * @作者 jinyy
 * @version [版本号, 2016-11-6]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class DuiLieTest
{
    //队列，先进先出
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
