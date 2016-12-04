package org.apache.ibatis.reflection.wrapper;

public interface ObjectWrapperFactory
{
    //有没有包装器
  boolean hasWrapperFor(Object object);
  
  //得到包装器
  ObjectWrapper getWrapperFor(MetaObject metaObject, Object object);
}
