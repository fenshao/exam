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
            stm.setString(4, optionB);
            stm.setString(5,optionC);
            stm.setString(6, optionD);
            stm.setString(7, answer);

            rs = stm.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                MysqlConnection.CloseConn(stm, conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return (rs != 0);
    }

    /**
     * 插入一千条
     *
     * author：lilei
     */

    public boolean insertmoreQuestion( ArrayList<Question> arrayList, int paperId) {
        MysqlConnection mysqlConnection = MysqlConnection.getMysqlConnection();
        Connection conn = mysqlConnection.getCon();
        PreparedStatement stm = null;
        int rs = 0;

        try {
            stm = conn.prepareStatement("INSERT INTO question(title, paper_id, option_a, option_b," +
                    " option_c, option_d, answer) VALUES(?, ?, ?, ?, ?, ?, ?) ");


            for (int i = 0; i < arrayList.size(); i++) {
                Question question = arrayList.get(i);
                stm.setString(1, question.getTitle());
                stm.setInt(2, paperId);
                stm.setString(3, question.getOptionA());
                stm.setString(4, question.getOptionB());
                stm.setString(5,question.getOptionC());
                stm.setString(6, question.getOptionD());
                stm.setString(7, question.getAnswer());
                stm.addBatch();
            }
            stm.executeBatch();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                MysqlConnection.CloseConn(stm, conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
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
    public boolean updateQuestion(String title, int questionId, String optionA, String optionB,
                                  String optionC, String optionD, String answer) {

        MysqlConnection mysqlConnection = MysqlConnection.getMysqlConnection();
        Connection conn = mysqlConnection.getCon();
        PreparedStatement stm = null;
        int rs = 0;

        try {
            stm = conn.prepareStatement("UPDATE question SET title = ?, option_a = ?, option_b = ?," +
                    "option_c = ?, option_d = ?, answer = ? WHERE question_id = ?");

            stm.setString(1, title);
            stm.setString(2, optionA);
            stm.setString(3, optionB);
            stm.setString(4, optionC);
            stm.setString(5, optionD);
            stm.setString(6, answer);
            stm.setInt(7, questionId);

            rs = stm.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                MysqlConnection.CloseConn(stm, conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return (rs != 0);
    }

    /********************************************
     * author: wangziquan
     * @param: title
     * 删除试题 根据title删除
     ********************************************/
    public boolean deleteQuestion(int qid) {
        MysqlConnection mysqlConnection = MysqlConnection.getMysqlConnection();
        Connection conn = mysqlConnection.getCon();
        PreparedStatement stm = null;
        int rs = 0;

        try {
            stm = conn.prepareStatement("DELETE FROM question WHERE question_id = ?");

            stm.setInt(1, qid);
            rs = stm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                MysqlConnection.CloseConn(stm, conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
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
                question.setQuestionId(resultSet.getInt(1));
                question.setTitle(resultSet.getString(2));
                question.setPaperId(resultSet.getInt(3));
                question.setOptionA(resultSet.getString(4));
                question.setOptionB(resultSet.getString(5));
                question.setOptionC(resultSet.getString(6));
                question.setOptionD(resultSet.getString(7));
                question.setAnswer(resultSet.getString(8));

                questionArrayList.add(question);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                MysqlConnection.CloseConn(resultSet, stm, conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return questionArrayList;
    }

    /********************************************
     * author: wangziquan
     * @param: paperId
     * 查询试题 根据paperId查询一道试题
     ********************************************/
    public Question selectQuestionone(int questionId) {
        Question question = new Question();

        MysqlConnection mysqlConnection = MysqlConnection.getMysqlConnection();
        Connection conn = mysqlConnection.getCon();
        PreparedStatement stm = null;
        ResultSet resultSet = null;

        try {
            stm = conn.prepareStatement("SELECT * FROM question WHERE question_id  = ?");

            stm.setInt(1, questionId);

            resultSet = stm.executeQuery();

            while (resultSet.next()) {
                question.setTitle(resultSet.getString(2));
                question.setPaperId(resultSet.getInt(3));
                question.setOptionA(resultSet.getString(4));
                question.setOptionB(resultSet.getString(5));
                question.setOptionC(resultSet.getString(6));
                question.setOptionD(resultSet.getString(7));
                question.setAnswer(resultSet.getString(8));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                MysqlConnection.CloseConn(resultSet, stm, conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return question;
    }

    /********************************************
     * author: wangziquan
     * @param: 表名
     * 获取分页信息
     ********************************************/
    public ArrayList<Question> findPageBean(int start, int currentCount) {
        ArrayList<Question> arrayList = new ArrayList();
        Connection conn = MysqlConnection.getMysqlConnection().getCon();
        PreparedStatement stm = null;
        ResultSet resultSet = null;

        try {
            stm = conn.prepareStatement("SELECT * FROM question limit ?, ?");

            stm.setInt(1, start);
            stm.setInt(2, currentCount);

            resultSet = stm.executeQuery();

            while (resultSet.next()) {
                Question question = new Question();

                question.setQuestionId(resultSet.getInt(1));
                question.setTitle(resultSet.getString(2));
                question.setPaperId(resultSet.getInt(3));
                question.setOptionA(resultSet.getString(4));
                question.setOptionB(resultSet.getString(5));
                question.setOptionC(resultSet.getString(6));
                question.setOptionD(resultSet.getString(7));
                question.setAnswer(resultSet.getString(8));

                arrayList.add(question);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                MysqlConnection.CloseConn(resultSet, stm, conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        return arrayList;
    }

    /********************************************
     * author: wangziquan
     * @param: 表名
     * 查询总页数
     ********************************************/
    public int getTotalCount() {
        Connection conn = MysqlConnection.getMysqlConnection().getCon();
        PreparedStatement stm = null;
        ResultSet resultSet = null;

        try {
            stm = conn.prepareStatement("SELECT COUNT(*) FROM question");

            resultSet = stm.executeQuery();

            while (resultSet.next()) return resultSet.getInt(1);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                MysqlConnection.CloseConn(resultSet, stm, conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return 0;
    }
}
