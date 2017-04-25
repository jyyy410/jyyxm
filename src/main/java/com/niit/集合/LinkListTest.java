package com.niit.集合;

import java.util.LinkedList;

public class LinkListTest
{

    /**
     *  [一句话功能简述]
     *  [功能详细描述]
     *  @param args    
     * @exception/throws [违例类型] [违例说明]
     * @see [类、类#方法、类#成员]
     */
    public static void main(String[] args) {
        LinkedList<String> aLinkedList=new LinkedList<String>();
        aLinkedList.add("a");
        aLinkedList.add("b");
        aLinkedList.add("c");
        aLinkedList.add("d");
        aLinkedList.get(0);
        System.out.println(aLinkedList);
        
        System.out.println(aLinkedList.getFirst());
        System.out.println(aLinkedList.getFirst());
        System.out.println(aLinkedList.removeFirst());

    }

}
