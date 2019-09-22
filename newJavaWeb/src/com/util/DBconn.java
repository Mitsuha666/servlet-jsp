package com.util;

import java.sql.*;

public class DBconn {
    static String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8";
    static String username = "root";
    static String password = "admin";
    static Connection conn = null;
    static ResultSet rs = null;
    static PreparedStatement ps =null;
    public static void init(){
        try {
            Class.forName("com.mysql.jdbc.Driver");  //加载jdbc驱动程序
            conn = DriverManager.getConnection(url,username,password);  //连接数据库
        } catch (Exception e) {
            System.out.println("init [SQL驱动程序初始化失败！]");
            e.printStackTrace();
        }
    }
    public static int addUpdDel(String sql){   //增删改
        int i = 0;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            i = ps.executeUpdate();  //返回影响数据库中记录个数
        } catch (SQLException e) {
            System.out.println("sql数据库增删改异常");
            e.printStackTrace();
        }
        return i;
    }
    public static ResultSet selectSql(String sql){  //查询
        try {
            ps = conn.prepareStatement(sql);   //创建语句对象ps
            rs = ps.executeQuery(sql);    //返回ResultSet对象
        } catch (SQLException e) {
            System.out.println("sql数据库查询异常");
            e.printStackTrace();
        }
        return rs;
    }
    public static void closeConn(){
        try{
            conn.close();
        } catch (SQLException e) {
            System.out.println("sql数据库关闭异常");
            e.printStackTrace();
        }
    }
}
