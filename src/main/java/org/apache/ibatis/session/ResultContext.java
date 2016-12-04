package org.apache.ibatis.session;
/**
 * 上下文接口
 *  [一句话功能简述]
 *  [功能详细描述]
 * @作者 jinyy
 * @version [版本号, 2016-11-9]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public interface ResultContext
{
    //获取结果
    Object getResultObject();

    //获取记录数
    int getResultCount();
//jyy干嘛用的？
    boolean isStopped();
  //jyy干嘛用的？
    //停止?
    void stop();
}
