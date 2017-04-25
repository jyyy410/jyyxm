package com.niit.集合;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest
{

    /**
     *  [一句话功能简述]
     *  [功能详细描述]
     *  @param args    
     * @exception/throws [违例类型] [违例说明]
     * @see [类、类#方法、类#成员]
     */
    public static void main(String[] args) {
        
        name();
    

    }
    
    public static void run1() {
        ArrayList<Object> arrayList= new ArrayList<Object>();
        arrayList.add(1);
        arrayList.add("a"); 
        
       Iterator<Object> sIterator = arrayList.iterator();
       while (sIterator.hasNext()) {
          String type = (String) sIterator.next();//输出报错，没有指定泛型，arraylist能装任意类型，interger不能装string   
          System.out.println(type);
          //java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
          
      }
    }
    
    /**
     * 错误的迭代器使用方式
     *  [一句话功能简述]
     *  [功能详细描述]    
     * @exception/throws [违例类型] [违例说明]
     * @see [类、类#方法、类#成员]
     */
    public static void name() {
        ArrayList<Object> arrayList= new ArrayList<Object>();
        arrayList.add(new Person("xiaoming",1));
        arrayList.add(new Person("gege",2));
        arrayList.add(new Person("jiejie",3));
        arrayList.add(new Person("didi",4));
        
        
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            //xiaoming2
            //jiejie4  错误原因是next数组角标移动了

            System.out.println(((Person) iterator.next()).getName()+((Person) iterator.next()).getAge());
            
        }
        //arrayList.add(1)这里是自动装箱   list只能存放集合的引用   引用放站内存对象放在堆内存。
    }

}
