package com.niit.字符串;

public class Test
{
public static void main(String[] args) {
    String x="a"+"b";
    System.out.println(x);
    isSame();
}
//一个英文双引号包括的字符串序列是一个字符串常亮，是对象，可以赋值给一个字符串变量，字符序列完全相同的两个对象是同一个对象，而通过构造方法创建的对象是新建的不同对象。
public static void isSame() {
    String s="abc";//一个对象在常量池里
    String s2=new String("abc");//两个对象，一个在堆内存里，一个在常量池里
    System.out.println(s==s2);
    
}
}
