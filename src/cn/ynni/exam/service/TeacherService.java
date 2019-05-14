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

import cn.ynni.exam.model.Student;
import cn.ynni.exam.model.Teacher;
import cn.ynni.exam.utils.MysqlConnection;

/**
 * @author y8501
 *
 */
public class TeacherService {

	/********************************************
	 * author: wangziquan
	 * @param: username
	 * @param: password
	 * 教师登录
	 ********************************************/
	public Teacher loginSystem(String username, String password) {
		Teacher teacher = new Teacher();
		Connection conn = MysqlConnection.getMysqlConnection().getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;

		try {
			pst = conn.prepareStatement("SELECT * FROM teacher WHERE tea_id = ? AND tea_password = ?");
			pst.setString(1, username);
			pst.setString(2, password);
			rs = pst.executeQuery();

			while (rs.next()) {
				teacher.setTeaId(rs.getString(1));
				teacher.setTeaPassword(rs.getString(2));
				teacher.setTeaName(rs.getString(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return teacher;
	}

	public boolean insertTeacher(String teaId, String teaPassword, String teaName) {
		Connection conn = MysqlConnection.getMysqlConnection().getCon();
		String sql = "insert into teacher values(?, ?, ?)";
		int rs = 0;
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, teaId);
			ps.setString(2, teaPassword);
			ps.setString(3, teaName);
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
	
	public boolean deleteTeacher(String teaId) {
		Connection conn = MysqlConnection.getMysqlConnection().getCon();
		String sql = "delete from teacher where tea_id = ?";
		int rs = 0;
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, teaId);
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
	
	public boolean updteTeacher(String teaId, String teaPassword, String teaName) {
		Connection conn = MysqlConnection.getMysqlConnection().getCon();
		String sql = "update teacher set tea_password = ?, tea_name = ? where tea_id = ?";
		int rs = 0;
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, teaPassword);
			ps.setString(2, teaName);
			ps.setString(3, teaId);
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
	
	public ResultSet selectTeacher(String teaId) {
		Connection conn = MysqlConnection.getMysqlConnection().getCon();
		String sql = "select * teacher where tea_id = ?";
		ResultSet rs = null;
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, teaId);
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
