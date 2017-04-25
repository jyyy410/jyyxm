package com.niit.泛型;

import java.util.ArrayList;
import java.util.Iterator;

public class FanXingTest
{

    /**
     *  [泛型是jdk1.5出现的安全机制，将运行时期的classCastException问题转到编译时期，避免了强制转换的麻烦。为什么要有泛型：例子如下]
     *  [功能详细描述]
     *  @param args    
     * @exception/throws [违例类型] [违例说明]
     * @see [类、类#方法、类#成员]
     */
    public static void main(String[] args) {
        
        ArrayList arrayList = new ArrayList();
        arrayList.add("a");
        arrayList.add("a");
        arrayList.add(1);
        Iterator iterable = arrayList.iterator();
        
        while (iterable.hasNext()) {
            String item = (String) iterable.next();//java.lang.Integer cannot be cast to java.lang.String
        }
        

    }

}
