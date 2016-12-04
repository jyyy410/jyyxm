package org.apache.ibatis.reflection.factory;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.apache.ibatis.reflection.ReflectionException;
/**
 * 才创建接口的对象。
 *  [一句话功能简述]
 *  [功能详细描述]
 * @作者 jinyy
 * @version [版本号, 2016-11-13]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class DefaultObjectFactory implements ObjectFactory
{

    @Override
    public void setProperties(Properties properties) {
        // no props for default

    }

    @Override
    public <T> T create(Class<T> type) {
        return create(type, null, null);
    }

    @Override
    public <T> T create(Class<T> type, List<Class<?>> constructorArgTypes, List<Object> constructorArgs) {
        //根据接口创建具体的类
        //1.解析接口
        Class<?> classToCreate = resolveInterface(type);
        // we know types are assignable
        //2.实例化类
        return (T) instantiateClass(classToCreate, constructorArgTypes, constructorArgs);
    }
/**
 * 关于获取类的字段有两种方式：getFields()和getDeclaredFields()。我们先来看看这两者的区别吧：

getFields()：获得某个类的所有的公共（public）的字段，包括父类中的字段。
getDeclaredFields()：获得某个类的所有声明的字段，即包括public、private和proteced，但是不包括父类的申明字段。

同样类似的还有getConstructors()和getDeclaredConstructors()、getMethods()和getDeclaredMethods()，这两者分别表示获取某个类的方法、构造函数。


AccessibleObject 类是 Field、Method 和 Constructor 对象的基类。它提供了将反射的对象标记为在使用时取消默认 Java 语言访问控制检查的能力。对于公共成员、默认（打包）访问成员、受保护成员和私有成员，在分别使用 Field、Method 或 Constructor 对象来设置或获得字段、调用方法，或者创建和初始化类的新实例的时候，会执行访问检查。

在反射对象中设置 accessible 标志允许具有足够特权的复杂应用程序（比如 Java Object Serialization 或其他持久性机制）以某种通常禁止使用的方式来操作对象。

 *  [一句话功能简述]
 *  [功能详细描述]
 *  @param type
 *  @param constructorArgTypes
 *  @param constructorArgs
 *  @return    
 * @exception/throws [违例类型] [违例说明]
 * @see [类、类#方法、类#成员]
 */
    private <T> T instantiateClass(Class<T> type, List<Class<?>> constructorArgTypes, List<Object> constructorArgs) {
        try {
            Constructor<T> constructor;
            //如果没有传入constructor，调用空构造函数，核心是调用Constructor.newInstance
            if (constructorArgTypes == null || constructorArgs == null) {
              constructor = type.getDeclaredConstructor();//得到所有的构造函数。所有的。
              if (!constructor.isAccessible()) {//由于JDK的安全检查耗时较多.所以通过setAccessible(true)的方式关闭安全检查就可以达到提升反射速度的目的
                constructor.setAccessible(true);
              }
              return constructor.newInstance();
            }
            //如果传入constructor，调用传入的构造函数，核心是调用Constructor.newInstance
            constructor = type.getDeclaredConstructor(constructorArgTypes.toArray(new Class[constructorArgTypes.size()]));
            if (!constructor.isAccessible()) {
              constructor.setAccessible(true);
            }
            return constructor.newInstance(constructorArgs.toArray(new Object[constructorArgs.size()]));
          } catch (Exception e) {
              //如果出错，包装一下，重新抛出自己的异常
            StringBuilder argTypes = new StringBuilder();
            if (constructorArgTypes != null) {
              for (Class<?> argType : constructorArgTypes) {
                argTypes.append(argType.getSimpleName());
                argTypes.append(",");
              }
            }
            StringBuilder argValues = new StringBuilder();
            if (constructorArgs != null) {
              for (Object argValue : constructorArgs) {
                argValues.append(String.valueOf(argValue));
                argValues.append(",");
              }
            }
            throw new ReflectionException("Error instantiating " + type + " with invalid types (" + argTypes + ") or values (" + argValues + "). Cause: " + e, e);
          }
        }

       
    @Override
    public <T> boolean isCollection(Class<T> type) {
        //是否是Collection的子类
        return Collection.class.isAssignableFrom(type);
    }
    
    protected Class<?> resolveInterface (Class<?> type) {
        Class<?> classToCreate;
        if (type == List.class || type == Collection.class || type == Iterable.class) {
            //List|Collection|Iterable-->ArrayList
          classToCreate = ArrayList.class;
        } else if (type == Map.class) {
            //Map->HashMap
          classToCreate = HashMap.class;
        } else if (type == SortedSet.class) { // issue #510 Collections Support
            //SortedSet->TreeSet
          classToCreate = TreeSet.class;
        } else if (type == Set.class) {
            //Set->HashSet
          classToCreate = HashSet.class;
        } else {
            //除此以外，就用原来的类型
          classToCreate = type;
        }
        return classToCreate;
        
    }

}
