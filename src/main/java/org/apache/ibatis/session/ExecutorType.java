package org.apache.ibatis.session;

/**
 * 执行器类型枚举。 [一句话功能简述] [功能详细描述]
 * 
 * @作者 jinyy
 * @version [版本号, 2016-11-12]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public enum ExecutorType
{
    // ExecutorType.SIMPLE
    // 这个执行器类型不做特殊的事情。它为每个语句的执行创建一个新的预处理语句。
    // ExecutorType.REUSE
    // 这个执行器类型会复用预处理语句。
    // ExecutorType.BATCH
    // 这个执行器会批量执行所有更新语句，如果SELECT在它们中间执行还会标定它们是必须的，来保证一个简单并易于理解的行为。
    SIMPLE, REUSE, BATCH
}
