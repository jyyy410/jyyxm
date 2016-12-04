package com.niit.动态代理.aopFrame;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BeanFactory
{
    
    Properties properties = new Properties();
    
    
public BeanFactory(InputStream inputStream) {
    
   
    try {
        properties.load(inputStream);
    }
    catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
      
    }

   public Object getBean (String key) {
       String classname = properties.getProperty(key);
       try {
        Class  class1 =Class.forName(classname);
        try {
            return   class1.newInstance();
        }
        catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    catch (ClassNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
       
      
}
}
