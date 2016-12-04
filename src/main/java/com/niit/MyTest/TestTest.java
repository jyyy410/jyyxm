package com.niit.MyTest;

import com.niit.集合.DuiLieTest;
import com.niit.集合.ZhanTest;

import junit.framework.TestCase;

public class TestTest extends TestCase
{
    
public void test() {
    DuiLieTest duiLieTest = new DuiLieTest();
    duiLieTest.add("a");
    duiLieTest.add("b");
    duiLieTest.add("c");
   System.out.println(duiLieTest.getItem());
}

public void test2() {
    ZhanTest duiLieTest = new ZhanTest();
    duiLieTest.add("a");
    duiLieTest.add("b");
    duiLieTest.add("c");
   System.out.println(duiLieTest.getItem());
}
}
