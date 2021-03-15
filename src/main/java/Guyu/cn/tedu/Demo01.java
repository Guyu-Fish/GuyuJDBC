package Guyu.cn.tedu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * JDBC Demo
 * 1.注册驱动
 * 2.获取连接对象
 * 3.创建执行SQL语句的对象
 * 4.执行SQL语句
 * 5.关闭资源
 */
public class Demo01 {
    public static void main(String[] args) throws Exception {
        //注册驱动 告诉编译器使用的数据库是什么 异常输出
        Class.forName("com.mysql.cj.jdbc.Driver");

        //获取连接对象
        // create database                                                                     批量操作
        Connection conn =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb3?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true",
                        "root","root");
        System.out.println(conn);
        //创建执行SQL语句的对象
        Statement s = conn.createStatement();

        //执行SQL语句
        String sql = "create table jdbct1(id int,name varchar(20))";
        s.execute(sql);
        //关闭资源
        conn.close();
        System.out.println("执行完成!");
    }
}
