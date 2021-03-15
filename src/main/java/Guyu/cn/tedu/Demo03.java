package Guyu.cn.tedu;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 增删改
 */
public class Demo03 {
    @Test
    public void test01() throws Exception {
        System.out.println("test01");
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb3?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true",
                        "root","root");
        Statement s = conn.createStatement();
        //执行插入SQL语句
        String sql = "insert into emp(empno,ename) values(101,'灭霸')";
        s.executeLargeUpdate(sql);
        conn.close();
        System.out.println("执行完成!");
    }
    @Test
    public void test02() throws Exception {
        System.out.println("test02");
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb3?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true",
                        "root","root");
        Statement s = conn.createStatement();
        String sql="insert into emp(empno,ename) value(102,'超人')";
        s.executeLargeUpdate(sql);
        conn.close();
        System.out.println("执行结束");
    }
    @Test
    public void test03() throws Exception {
        System.out.println("test03");
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb3?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true",
                        "root","root");
        Statement s = conn.createStatement();
        String sql = "delete from emp where empno=102";
        s.executeUpdate(sql);
        conn.close();
        System.out.println("over");
    }
    @Test
    public void test04() throws Exception {
        System.out.println("test03");
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb3?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true",
                        "root","root");
        Statement s = conn.createStatement();
        String sql = "select *from emp";
        ResultSet rs =s.executeQuery(sql);
        //遍历结果集中的数据
        while (rs.next()){
            String name = rs.getString("ename");
            double sal = rs.getDouble("sal");
            System.out.println(name +":"+ sal);
        }
        conn.close();
        System.out.println("over");
    }

}
