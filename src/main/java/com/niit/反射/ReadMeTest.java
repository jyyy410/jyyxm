package com.niit.反射;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * 反射  Class是类在虚拟机中的字节码。
 * 
 * class.forname
 * 返回字节码
 * 1 虚拟界已经有的话直接返回
 * 2虚拟机没有的话加载源码到内存，返回字节码
 * 
 * 三种得到Class类的方式。  不管用哪种方式得到Class，三个对象都相等a==b==c
 * p1.getClass.   
 * List.Class    
 * Class.getName("com.javalang.String")  得到存在的字节码  ，如果不存在，加载类，得到字节码
 * 
 * 
 * 
 * 8种基本数据类型和   void都可以用一个 Class表示。void.Class'
 * 
 * 
 * 
 * 
 * 
 * 9种预定义class对象  Boolean.type char byte short int long float double void
 * 
 * 反射就是把java种的各种成分映射成java类 例如包，属性，方法，
 * 
 * 实例化一个对象，Class.newInstance    Class构造方法.newINstance   构造方法类通过
 * 
 * int.Class.isPareint==true
 * 
 * 数组也是一种类型，int [] .Class.isArrar==true
 * 
 * 
 * getfiled得到属性，私有的得不到，私有的用getDeatlaDFiledl
 * 
 * 
 *  fieldX.setAccessible(true);暴力反射获取私有变量的饿值，要不然知道有变量，但是拿不到值。
 *  
 *  
 *  用类加载器加载配置文件，Class.getClassLoad.getResourcesAsStream   从classpath/目录下找
 *  Test.Class从相对路径找，加/从绝对路径classpath下找
 *  [一句话功能简述]
 *  [功能详细描述]
 * @作者 jinyy
 * @version [版本号, 2016-11-14]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class ReadMeTest
{
 // TODO Auto-generated method stub
    String str1 = "abc";
    Class cls1 = str1.getClass();
    Class cls2 = String.class;
    Class cls3 = Class.forName("java.lang.String");
   // System.out.println(cls1 == cls2);
   // System.out.println(cls1 == cls3);
    
   // System.out.println(cls1.isPrimitive());
    System.out.println(int.class.isPrimitive());
    System.out.println(int.class == Integer.class);
    System.out.println(int.class == Integer.TYPE);
    System.out.println(int[].class.isPrimitive());
    System.out.println(int[].class.isArray());      
    
    //new String(new StringBuffer("abc"));
    Constructor constructor1 = String.class.getConstructor(StringBuffer.class);
    String str2 = (String)constructor1.newInstance(/*"abc"*/new StringBuffer("abc"));
    System.out.println(str2.charAt(2));
    
    ReflectPoint pt1 = new ReflectPoint(3,5);
    Field fieldY = pt1.getClass().getField("y");
    //fieldY的值是多少？是5,错！fieldY不是对象身上的变量，而是类上，要用它去取某个对象上对应的值
    System.out.println(fieldY.get(pt1));
    Field fieldX = pt1.getClass().getDeclaredField("x");
    fieldX.setAccessible(true);
    System.out.println(fieldX.get(pt1));    
    
    changeStringValue(pt1);
    System.out.println(pt1);
    
    Method methodCharAt = String.class.getMethod("charAt", int.class);
    System.out.println(methodCharAt.invoke(str1, 1));
    System.out.println(methodCharAt.invoke(str1, new Object[]{2}));
    
    //TestArguments.main(new String[]{"111","222","333"});
    String startingClassName = args[0];
    Method mainMethod = Class.forName(startingClassName).getMethod("main", String[].class);
    //mainMethod.invoke(null, new Object[]{new String[]{"111","222","333"}});
    mainMethod.invoke(null, (Object)new String[]{"111","222","333"});
    
    int [] a1 = new int[]{1,2,3};
    int [] a2 = new int[4];
    int[][] a3 = new int[2][3];
    String [] a4 = new String[]{"a","b","c"};
    System.out.println(a1.getClass() == a2.getClass());
    System.out.println(a1.getClass() == a4.getClass());
    System.out.println(a1.getClass() == a3.getClass());
    System.out.println(a1.getClass().getName());
    System.out.println(a1.getClass().getSuperclass().getName());
    System.out.println(a4.getClass().getSuperclass().getName());
    
    Object aObj1 = a1;
    Object aObj2 = a4;
    //Object[] aObj3 = a1;
    Object[] aObj4 = a3;
    Object[] aObj5 = a4;
    
    System.out.println(a1);
    System.out.println(a4);
    System.out.println(Arrays.asList(a1));
    System.out.println(Arrays.asList(a4));  
    
    printObject(a4);
    
    printObject("xyz");
}

private static void printObject(Object obj) {
    Class clazz = obj.getClass();
    if(clazz.isArray()){
        int len = Array.getLength(obj);
        for(int i=0;i<len;i++){
            System.out.println(Array.get(obj, i));
        }
    }else{
        System.out.println(obj);
    }
    
}

private static void changeStringValue(Object obj) throws Exception {
    Field[] fields = obj.getClass().getFields();
    for(Field field : fields){
        //if(field.getType().equals(String.class)){
        if(field.getType() == String.class){
            String oldValue = (String)field.get(obj);
            String newValue = oldValue.replace('b', 'a');
            field.set(obj, newValue);
        }
    }
    
}

}


class TestArguments{
public static void main(String[] args){
    for(String arg : args){
        System.out.println(arg);
    }
}
}
