package Guyu.cn.tedu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Drop Demo
 */
public class Demo02 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb3?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true",
                        "root","root");
        Statement s = conn.createStatement();
        String sql = "drop table jdbct1";
        s.execute(sql);

        conn.close();
        System.out.println("执行完成");
    }
}
