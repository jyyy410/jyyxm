package com.niit.mybatis多个数据源代码;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.util.IOUtils;

/** 
 * 根据mybatis.xml中配置的不同的environment创建对应的SqlSessionFactory 
 * @author boyce 
 * @version 2014-3-27 
 */ 
public final class DataSourceSqlSessionFactory {  
    private static final String CONFIGURATION_PATH = "mybatis/mybatis.xml";  
       
    private static final Map<DataSourceEnvironment, SqlSessionFactory> SQLSESSIONFACTORYS   
        = new HashMap<DataSourceEnvironment, SqlSessionFactory>();  
       
    /** 
     * 根据指定的DataSourceEnvironment获取对应的SqlSessionFactory 
     * @param environment 数据源environment 
     * @return SqlSessionFactory 
     */ 
    public static SqlSessionFactory getSqlSessionFactory(DataSourceEnvironment environment) {  
           
        SqlSessionFactory sqlSessionFactory = SQLSESSIONFACTORYS.get(environment);  
        if (ObjectUtils.isNotNull(sqlSessionFactory))  
            return sqlSessionFactory;  
        else {  
            InputStream inputStream = null;  
            try {  
                inputStream = Resources.getResourceAsStream(CONFIGURATION_PATH);  
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream, environment.name());  
                   
                logger.info("Get {} SqlSessionFactory successfully.", environment.name());  
            } catch (IOException e) {  
                logger.warn("Get {} SqlSessionFactory error.", environment.name());  
                logger.error(e.getMessage(), e);  
            }  
            finally {  
                IOUtils.closeQuietly(inputStream);  
            }  
               
            SQLSESSIONFACTORYS.put(environment, sqlSessionFactory);  
            return sqlSessionFactory;  
        }  
    }  
       
    /** 
     * 配置到Configuration.xml文件中的数据源的environment的枚举描述 
     * @author boyce 
     * @version 2014-3-27 
     */ 
    public static enum DataSourceEnvironment {  
        HD,  
        HO;  
    }  
}