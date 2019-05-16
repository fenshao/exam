package cn.ynni.exam.utils;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class MysqlConnection {
    public final static MysqlConnection dbm = new MysqlConnection();
    static InputStream inputStream = null;
    static Properties properties = null;
    Connection connection = null;

    static {
        try {
            inputStream = MysqlConnection.class.getClassLoader().getResourceAsStream("jdbc.properties");

            //加载配置文件
            properties = new Properties();

            //把输入流加载到对象中
            properties.load(inputStream);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    //单例模式创建对象
    private MysqlConnection() {

    }

    //获取该对象的方法
    public static MysqlConnection getMysqlConnection(){
        return dbm;

    }

    //关闭连接
    public static void CloseConn(ResultSet resultSet, Connection connection) throws SQLException {

        if (resultSet != null) resultSet.close();
        if (connection != null) connection.close();

    }

    public static void  CloseConn(Statement statement, Connection connection) throws SQLException {
        if (statement != null) statement.close();
        if (connection != null) connection.close();
    }


    public static void  CloseConn(Connection connection) throws SQLException {
        if (connection != null) connection.close();
    }

    public static void  CloseConn(ResultSet resultSet, Statement statement, Connection connection) throws SQLException {
        if (statement != null) statement.close();
        if (resultSet != null) resultSet.close();
        if (connection != null) connection.close();
    }

    //返回数据库连接
    public Connection getCon(){

        try {
            Class.forName(properties.getProperty("drivername"));


            try {
                connection = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("username"), properties.getProperty("password"));
                return connection;
            } catch (SQLException e) {

                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }

        return connection;

    }

    //关闭结果集
    public void closeResuletSet(ResultSet rs){
        try {
            rs.close();
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

}
