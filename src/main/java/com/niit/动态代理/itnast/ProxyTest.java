package com.niit.动态代理.itnast;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ProxyTest
{

    /**
     *  [一句话功能简述]
     *  [功能详细描述]
     *  @param args    
     * @throws InvocationTargetException 
     * @throws IllegalAccessException 
     * @throws InstantiationException 
     * @throws IllegalArgumentException 
     * @exception/throws [违例类型] [违例说明]
     * @see [类、类#方法、类#成员]
     */
    public static void main(String[] args) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
        /**虚拟myproxy implement myinterface
         * 
         * 代理类的构造方法是  interface( java.lang.reflect.InvocationHandler)
         * 得到代理类的字节码
         */
       Class   class1 = Proxy.getProxyClass(Collection.class.getClassLoader(), Collection.class);
       Constructor[]  cons= class1.getDeclaredConstructors();
       System.out.println("--------------------------");
       for (Constructor constructor : cons) {
           class MyInvocation implements InvocationHandler{

               @Override
               public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                   // TODO Auto-generated method stub
                   return null;
               }
           
           }
        System.out.println(constructor.getName()+"+++++"+Arrays.toString(constructor.getParameterTypes()));
        Collection collection = (Collection) constructor.newInstance(new MyInvocation());
        collection.clear();
        collection.size();//有返回值的调用报空指针，collection对象可以实例化，但是.toString返回值是空
        System.out.println(">>>>>>>>"+collection);
        /**
         * 方法内匿名内部类实例化
         */
        Collection collection2 = (Collection) constructor.newInstance(new InvocationHandler(){

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {//代理对象，方法，参数
              ArrayList targetObject= new ArrayList();
                return method.invoke(targetObject, args);//目标（自己的实现类在这里）----------------------------------------------------------
            }});
        
    }
       System.out.println("--------------------------");   
       
       Method[] mes =class1.getDeclaredMethods();
       System.out.println("+++++++++++++++++++++++++++");
       for (Method method : mes) {
//method.invoke(obj, args)  //在哪个对象执行方法，方法参数是多少     
        System.out.println(method.getName());
    }
       System.out.println("+++++++++++++++++++++++++++");
       
       /**
        * 用处理器参数，new 一个代理类对象。
        */
//     /  Proxy.newProxyInstance(loader, interfaces, h)//接口加载器，接口，处理器实例化对象   可变参数必须在最后，所以这不能用，只能用数组接口
       
       
       /**
        * invocation原理
        * 
        * 代理类的方法在执行的时候，都调用处理器的invoke方法，返回一个值给代理对象。
        * 
        * 
        */
    }
    
    
   

}
