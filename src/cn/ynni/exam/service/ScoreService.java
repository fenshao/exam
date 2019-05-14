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
import java.util.ArrayList;

import cn.ynni.exam.model.Score;
import cn.ynni.exam.model.ScoreInfo;
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
		return rs != 0;
	}

	/********************************************
	 * author: wangziquan
	 * @param: stuId
	 * 查询信息该学生的考试信息
	 ********************************************/
	public ArrayList<ScoreInfo> selectInfo(String stuID) {
		ArrayList<ScoreInfo> arrayList = new ArrayList<ScoreInfo>();
		Connection conn = MysqlConnection.getMysqlConnection().getCon();
		PreparedStatement stm = null;
		ResultSet resultSet = null;
		String sql = "SELECT  R1.stu_name\n" +
				"\t, R1.paper_id\n" +
				"\t, paper.title\n" +
				"\t, R1.score\n" +
				"FROM(\n" +
				"\tSELECT R.stu_id\n" +
				"\t\t, R.stu_name\n" +
				"\t\t,score.score\n" +
				"\t\t,score.paper_id\n" +
				"\t\tFROM(\n" +
				"\t\t\t\tSELECT student.stu_id\n" +
				"\t\t\t\t, student.stu_name\n" +
				"\t\t\t\tFROM student \n" +
				"\t\t\t\tWHERE student.stu_id = ? \n" +
				"\t\t) AS R JOIN score ON score.stu_id = R.stu_id\n" +
				") AS R1 JOIN paper ON R1.paper_id = paper.paper_id";

		try {
			stm = conn.prepareStatement(sql);
			stm.setString(1, stuID);
			resultSet = stm.executeQuery();

			while (resultSet.next()) {
				ScoreInfo info = new ScoreInfo();

				info.setStuName(resultSet.getString(1));
				info.setPaperId(resultSet.getInt(2));
				info.setTitle(resultSet.getString(3));
				info.setScore(resultSet.getInt(4));

				arrayList.add(info);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return arrayList;
	}

	public ArrayList<ScoreInfo> selectInfo2() {
		ArrayList<ScoreInfo> arrayList = new ArrayList<ScoreInfo>();
		Connection conn = MysqlConnection.getMysqlConnection().getCon();
		PreparedStatement stm = null;
		ResultSet resultSet = null;
		String sql = "SELECT paper.paper_id\n" +
				"\t, paper.title\n" +
				"\t, R.stu_name\n" +
				"\t, R.score\n" +
				"\tFROM (\n" +
				"\t\tSELECT score.paper_id\n" +
				"\t\t, score.score\n" +
				"\t\t, student.stu_name\n" +
				"\t\tFROM score JOIN student on  = student.stu_id\n" +
				"\t) AS R JOIN paper on R.paper_id = paper.paper_id";

		try {
			stm = conn.prepareStatement(sql);
			resultSet = stm.executeQuery();

			while (resultSet.next()) {
				ScoreInfo info = new ScoreInfo();

				info.setPaperId(resultSet.getInt(1));
				info.setTitle(resultSet.getString(2));
				info.setStuName(resultSet.getString(3));
				info.setScore(resultSet.getInt(4));

				arrayList.add(info);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return arrayList;
	}
}
