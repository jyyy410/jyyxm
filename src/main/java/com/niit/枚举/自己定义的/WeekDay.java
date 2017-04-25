package com.niit.枚举.自己定义的;

public abstract class WeekDay
{
WeekDay sunDay=new WeekDay(){};
WeekDay monday=new WeekDay(){};
private WeekDay() {
    // TODO Auto-generated constructor stub
}
@Override
    public String toString() {
        // TODO Auto-generated method stub
        return sunDay==this?"sunDay":"monday";
    }
}
