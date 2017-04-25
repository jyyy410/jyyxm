package com.niit.aoptest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactoryBean
{
    public void getProxyBean () {
        Proxy.newProxyInstance(this.getClass().getClassLoader(), this.getClass(), new InvocationHandler()
        {
            
            
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // TODO Auto-generated method stub
                return null;
            }
        })
    }
}
