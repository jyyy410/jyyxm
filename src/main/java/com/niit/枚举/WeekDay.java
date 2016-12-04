package com.niit.枚举;

public enum WeekDay
{
    SUN(11111),MON(),TUE,WED,THI,FRI,SAT;
   private WeekDay() {
        System.out.println("444444444444444444");
    }
    WeekDay(int i) {
        System.out.println("22222222222");
    }
}
