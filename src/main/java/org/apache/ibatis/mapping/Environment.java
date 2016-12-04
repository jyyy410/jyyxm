package org.apache.ibatis.mapping;

import javax.sql.DataSource;

import org.apache.ibatis.transaction.TransactionFactory;

public final class Environment
{
    // 环境id
    private final String id;
    // 事务工厂
    private final TransactionFactory transactionFactory;
    // 数据源
    private final DataSource dataSource;

    public Environment(String id, TransactionFactory transactionFactory, DataSource dataSource) {
        if (id == null) {
            throw new IllegalArgumentException("Parameter 'id' must not be null");
        }
        if (transactionFactory == null) {
            throw new IllegalArgumentException("Parameter 'transactionFactory' must not be null");
        }
        this.id = id;
        if (dataSource == null) {
            throw new IllegalArgumentException("Parameter 'dataSource' must not be null");
        }
        this.transactionFactory = transactionFactory;
        this.dataSource = dataSource;
    }

    public String getId() {
        return id;
    }

    public TransactionFactory getTransactionFactory() {
        return transactionFactory;
    }

    public DataSource getDataSource() {
        return dataSource;
    }
//就想在new 对象的时候，就初始化属性，想随意变换属性的个数，就用建造者模式。不需要在不用的参数new null对象。不对外提供set方法，只能在构造函数使用属性赋值。
    //一个静态内部类Builder
    //建造模式
    //用法应该是new Environment.Builder(id).transactionFactory(xx).dataSource(xx).build();
    public static class Builder {
        private String id;
        private TransactionFactory transactionFactory;
        private DataSource dataSource;

      public Builder(String id) {
        this.id = id;
      }

      public Builder transactionFactory(TransactionFactory transactionFactory) {
        this.transactionFactory = transactionFactory;
        return this;
      }

      public Builder dataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        return this;
      }

      public String id() {
        return this.id;
      }

      public Environment build() {
        return new Environment(this.id, this.transactionFactory, this.dataSource);
      }

    }
    
    //内部类结束
}
