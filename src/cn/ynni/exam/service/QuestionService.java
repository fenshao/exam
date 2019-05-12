package cn.ynni.exam.service;

import cn.ynni.exam.model.Question;
import cn.ynni.exam.utils.MysqlConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class QuestionService {

    /********************************************
     * author: wangziquan
     * @param: title
     * @param: paperId
     * @param: optionA
     * @param: optionB
     * @param: optionC
     * @param: optionD
     * @param: answer
     * 添加试题
     ********************************************/
    public boolean insertQuestion(String title, int paperId, String optionA, String optionB,
                                  String optionC, String optionD, String answer) {

        MysqlConnection mysqlConnection = MysqlConnection.getMysqlConnection();
        Connection conn = mysqlConnection.getCon();
        PreparedStatement stm = null;
        int rs = 0;

        try {
            stm = conn.prepareStatement("INSERT INTO question(title, paper_id, option_a, option_b," +
                    " option_c, option_d, answer) VALUES(?, ?, ?, ?, ?, ?, ?) ");

            stm.setString(1, title);
            stm.setInt(2, paperId);
            stm.setString(3, optionA);
            stm.setString(4,optionC);
            stm.setString(5, optionD);
            stm.setString(6, answer);

            rs = stm.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

        }

        return (rs != 0);
    }

    /********************************************
     * author: wangziquan
     * @param: title
     * @param: paperId
     * @param: optionA
     * @param: optionB
     * @param: optionC
     * @param: optionD
     * @param: answer
     * 修改试题 paperId作为条件
     ********************************************/
    public boolean updateQuestion(String title, int paperId, String optionA, String optionB,
                                  String optionC, String optionD, String answer) {

        MysqlConnection mysqlConnection = MysqlConnection.getMysqlConnection();
        Connection conn = mysqlConnection.getCon();
        PreparedStatement stm = null;
        int rs = 0;

        try {
            stm = conn.prepareStatement("UPDATE question SET title = ?, option_a = ?, option_b = ?," +
                    "option_c = ?, option_d = ?, answer = ? WHERE paper_id = ?");

            stm.setString(1, title);
            stm.setInt(2, paperId);
            stm.setString(3, optionA);
            stm.setString(4,optionC);
            stm.setString(5, optionD);
            stm.setString(6, answer);

            rs = stm.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

        }

        return (rs != 0);
    }

    /********************************************
     * author: wangziquan
     * @param: title
     * 删除试题 根据title删除
     ********************************************/
    public boolean deleteQuestion(String title) {
        MysqlConnection mysqlConnection = MysqlConnection.getMysqlConnection();
        Connection conn = mysqlConnection.getCon();
        PreparedStatement stm = null;
        int rs = 0;

        try {
            stm = conn.prepareStatement("DELETE FROM question WHERE title = ?");

            stm.setString(1, title);
            rs = stm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return (rs != 0);
    }

    /********************************************
     * author: wangziquan
     * @param: paperId
     * 查询试题 根据paperId查询一套试题
     ********************************************/
    public ArrayList<Question> selectQuestion(int paperId) {

        ArrayList<Question> questionArrayList = new ArrayList<Question>();

        MysqlConnection mysqlConnection = MysqlConnection.getMysqlConnection();
        Connection conn = mysqlConnection.getCon();
        PreparedStatement stm = null;
        ResultSet resultSet = null;

        try {
            stm = conn.prepareStatement("SELECT * FROM question WHERE paper_id = ?");

            stm.setInt(1, paperId);
            resultSet = stm.executeQuery();

            while (resultSet.next()) {
                Question question = new Question();
                question.setTitle(resultSet.getString(1));
                question.setPaperId(resultSet.getInt(2));
                question.setOptionA(resultSet.getString(3));
                question.setOptionB(resultSet.getString(4));
                question.setOptionC(resultSet.getString(5));
                question.setOptionD(resultSet.getString(6));
                question.setAnswer(resultSet.getString(7));

                questionArrayList.add(question);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return questionArrayList;
    }

    /********************************************
     * author: wangziquan
     * @param: paperId
     * 查询试题 根据paperId查询一道试题
     ********************************************/
    public Question selectQuestionone(String title) {
        Question question = new Question();

        MysqlConnection mysqlConnection = MysqlConnection.getMysqlConnection();
        Connection conn = mysqlConnection.getCon();
        PreparedStatement stm = null;
        ResultSet resultSet = null;

        try {
            stm = conn.prepareStatement("SELECT * FROM question WHERE title = ?");

            stm.setString(1, title);

            resultSet = stm.executeQuery();

            while (resultSet.next()) {
                question.setTitle(resultSet.getString(1));
                question.setPaperId(resultSet.getInt(2));
                question.setOptionA(resultSet.getString(3));
                question.setOptionB(resultSet.getString(4));
                question.setOptionC(resultSet.getString(5));
                question.setOptionD(resultSet.getString(6));
                question.setAnswer(resultSet.getString(7));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return question;
    }

}
