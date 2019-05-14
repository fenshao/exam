package cn.ynni.exam.service;

import cn.ynni.exam.model.PageUtil;
import cn.ynni.exam.utils.MysqlConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PageServiece {

    /********************************************
     * author: wangziquan
     * @param: 表名
     * 查询总页数
     ********************************************/
    public int getTotalCount(String table) {
        Connection conn = MysqlConnection.getMysqlConnection().getCon();
        PreparedStatement stm = null;
        ResultSet resultSet = null;

        try {
            stm = conn.prepareStatement("SELECT COUNT(*) FROM " + table);

            resultSet = stm.executeQuery();

            while (resultSet.next()) return resultSet.getInt(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }



}
