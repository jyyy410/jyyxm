package com.niit.自动拆箱和装箱;

public class Test
{

    /**
     *  [一句话功能简述]
     *  [功能详细描述]
     *  @param args    
     * @exception/throws [违例类型] [违例说明]
     * @see [类、类#方法、类#成员]
     */
    public static void main(String[] args) {
       Integer a= 1;//自动装箱
       Integer b=1;
       System.out.println(a+1);//自动拆箱
       System.out.println(a==b);
       
       Integer x= 128;
       Integer y=128;
       System.out.println(x==y);//不是从常量池拿对象，所以不相同
       
       Integer xx= 1; //-128-127是从常量池拿装好箱的对象所以相同    装箱后在范围内 的会缓存包装的对象，下次再装箱，返回已经有的对象。小的对象装箱都是同一个
       Integer yy=1; //valueof(和上面类似)
       System.out.println(xx==yy);

    }

}
