/**   
 * @Title: MaxSubsectionSum.java
 * @Description: TODO
 * @author: 杨得轩  201613446207  
 * @date: 2018年4月11日 下午4:57:21
 */
package cn.ynni.exam.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.ynni.exam.utils.MysqlConnection;

/**
 * @author y8501
 *
 */
public class ScoreService {
	public boolean insertScore(String stuId, int paperId, int score) {
		Connection conn = MysqlConnection.getMysqlConnection().getCon();
		String sql = "insert into score(stu_id, paper_id, score) values(?, ?, ?)";
		int rs = 0;
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, stuId);
			ps.setInt(2, paperId);
			ps.setInt(3, score);
			rs = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//关闭连接
			if (ps != null) {
				try {
					ps.close();
					if (conn != null) {
						conn.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		if (rs != 0) {
			return true;
		}
		return false;
	}
	
	public ResultSet selectScore(int scoreId) {
		Connection conn = MysqlConnection.getMysqlConnection().getCon();
		String sql = "select * teacher where score_id = ?";
		ResultSet rs = null;
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, scoreId);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//关闭连接
			if (ps != null) {
				try {
					/*
					if (rs != null) {
						rs.close();
					}
					*/
					ps.close();
					if (conn != null) {
						conn.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return rs;
	}
}
