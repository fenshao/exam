package cn.ynni.exam.service;

import cn.ynni.exam.model.Grade;
import cn.ynni.exam.utils.MysqlConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GradeService {
    //修改时间
    public void updateGrade(int score) {
        Connection conn = MysqlConnection.getMysqlConnection().getCon();
        PreparedStatement stm = null;

        try {
            stm = conn.prepareStatement("UPDATE grade SET score = ?");

            stm.setInt(1, score);
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
    public Grade selectGrade() {
        Connection conn = MysqlConnection.getMysqlConnection().getCon();
        PreparedStatement stm = null;
        ResultSet resultSet = null;
        Grade grade = new Grade();

        try {
            stm = conn.prepareStatement("SELECT * FROM grade");

            resultSet = stm.executeQuery();

            while (resultSet.next())grade.setScore(resultSet.getInt(1));

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                MysqlConnection.CloseConn(stm, conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return grade;
    }
}
