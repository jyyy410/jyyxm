package com.niit.jdbcTest;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class CallTest
{

    /**
     *  [jdbc调用存储过程]
     */
    public static void main(String[] args) {
        Connection con=null;
        String sql="{callinsert_Student(?,?,?)}";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql:///test","root","root");
            CallableStatement  cstmt=con.prepareCall(sql);
            cstmt.setString(1,"wangwu");
            cstmt.setInt(2, 25);
            cstmt.registerOutParameter(3,Types.INTEGER);//设置第三个参数，输出参数的类型
            cstmt.execute();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

}
