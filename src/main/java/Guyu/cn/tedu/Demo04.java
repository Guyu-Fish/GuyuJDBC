package Guyu.cn.tedu;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo04 {
    public static void main(String[] args) {
        //获取连接
        try(Connection conn = DBUtils.getConn())
        {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("select ename from emp");
            while (rs.next()){
                String name = rs.getString("ename");
                double sal = rs.getDouble(1);
                System.out.println(name+":"+sal);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
