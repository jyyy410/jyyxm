package org.apache.ibatis.session;

public interface ResultHandler
{

    //jyy 处理结果，给一个结果上下文 上下文怎么获取，和配置类什么关系。
    void handleResult(ResultContext context);
}
