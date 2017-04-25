package com.niit.集合;

import java.util.Arrays;
import java.util.List;

public class ArraysTest
{

    /**
     * [arrays的方法] [//如果数组中的元素是对象比如string Integer ，list会把数组中的每个对象作为list的元素，如果数组中的是基本数据类型，list存数组的引用]
     * 
     * @param args
     * @exception/throws [违例类型] [违例说明]
     * @see [类、类#方法、类#成员]
     */
    public static void main(String[] args) {
        int arr[] = {1,2 };
       // System.out.println(arr);
        String string = "";
        string.length();

        List strList = Arrays.asList(arr);
        System.out.println(strList);
        //strList.add("b");//数组的长度是固定的，增删改不能用会报错的  unsupporedoperationExction
        
    }

}
