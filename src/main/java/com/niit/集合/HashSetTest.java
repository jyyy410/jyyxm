package com.niit.集合;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest
{
/**
 * 无序，不重复，不同步  方法和collection接口一样  由哈希表hashcode，和equal判断元素是否相等支持。而arraylist的判断是否包含contions内部用的是equal方法。
 *  [一句话功能简述]
 *  [功能详细描述]    
 * @exception/throws [违例类型] [违例说明]
 * @see [类、类#方法、类#成员]
 */
    public static void run() {
        HashSet hashSet=new HashSet();
        /*hashSet.add("adfa");
        hashSet.add("adfa");
        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");*/
        
        hashSet.add(null);
        hashSet.add(null);
        
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
          String temp=  (String) iterator.next();
          System.out.println(temp);
            
        }
        
        Person person = new Person("a", 1);
        if (person!=null&person.getName()!=null) {
            
        }
        
    }

    public static void main(String[] args) {
        run();
    }
}
