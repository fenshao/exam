package cn.ynni.exam.service;

import cn.ynni.exam.model.Timer;
import cn.ynni.exam.utils.MysqlConnection;
import com.mysql.cj.jdbc.PreparedStatementWrapper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TimerService {

    //修改时间
    public void updateTimer(int time) {
        Connection conn = MysqlConnection.getMysqlConnection().getCon();
        PreparedStatement stm = null;

        try {
            stm = conn.prepareStatement("UPDATE timer SET time = ?");

            stm.setInt(1, time);
            stm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                MysqlConnection.CloseConn(stm, conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //查询时间
    public Timer selectTime() {
        Connection conn = MysqlConnection.getMysqlConnection().getCon();
        PreparedStatement stm = null;
        ResultSet resultSet = null;
        Timer timer = new Timer();

        try {
            stm = conn.prepareStatement("SELECT * FROM timer");

            resultSet = stm.executeQuery();

            while (resultSet.next()) timer.setTime(resultSet.getInt(1));

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                MysqlConnection.CloseConn(stm, conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return timer;
    }
}
