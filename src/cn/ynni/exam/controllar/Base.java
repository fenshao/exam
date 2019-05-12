package cn.ynni.exam.controllar;

import cn.ynni.exam.utils.MysqlConnection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Base extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        MysqlConnection mysqlConnection = MysqlConnection.getMysqlConnection();

        Connection conn = mysqlConnection.getCon();

        Statement st = null;

        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from student");

            while (rs.next()) {
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
