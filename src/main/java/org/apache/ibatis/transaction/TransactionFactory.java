package org.apache.ibatis.transaction;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * 事务工厂 得到连接，提交，回滚事务，关闭连接。 [一句话功能简述] [功能详细描述]
 * 
 * @作者 jinyy
 * @version [版本号, 2016-11-10]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public interface TransactionFactory
{

    /**
     * Retrieve inner database connection
     * 
     * @return DataBase connection
     * @throws SQLException
     */
    Connection getConnection() throws SQLException;

    /**
     * Commit inner database connection.
     * 
     * @throws SQLException
     */
    void commit() throws SQLException;

    /**
     * Rollback inner database connection.
     * 
     * @throws SQLException
     */
    void rollback() throws SQLException;

    /**
     * Close inner database connection.
     * 
     * @throws SQLException
     */
    void close() throws SQLException;
}
