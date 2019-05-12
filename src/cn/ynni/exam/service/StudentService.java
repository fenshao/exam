package cn.ynni.exam.service;


import cn.ynni.exam.model.Student;
import cn.ynni.exam.utils.MysqlConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * author：lilei
 * fun: 有关学生账号的连接数据库操作，增删改查
 */

public class StudentService {
    /**
     * fun: 插入一个学生
     * @param stuId
     * @param stuPassword
     * @param stuName
     * @param stuSex
     * @return void
     */
    public boolean insertStudent(String stuId, String stuPassword, String stuName, String stuSex) {
        // 取得数据库连接
        MysqlConnection mysqlConnection = MysqlConnection.getMysqlConnection();
        Connection conn = mysqlConnection.getCon();
        String sql = "insert into student (stu_id, stu_password, stu_name, stu_sex) values(?, ?, ?, ?)";
        int rs = 0;

        PreparedStatement stm = null;
        try {

            stm = conn.prepareStatement(sql);
            stm.setString(1, stuId);
            stm.setString(2, stuPassword);
            stm.setString(3, stuName);
            stm.setString(4, stuSex);
            rs = stm.executeUpdate();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return (rs != 0);
    }

    /**
     * fun: 删除一个学生
     * @param stuId
     * @return void
     */
    public void deleteStudent(String stuId) {
        // TODO Auto-generated method stub
        MysqlConnection mysqlConnection = MysqlConnection.getMysqlConnection();
        Connection conn = mysqlConnection.getCon();
        String sql = "delete from student where stu_id = ?";
        PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement(sql);
            stm.setString(1,stuId);
            stm.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * fun: 修改一个学生的信息
     * @param stuId
     * @param stuPassword
     * @param stuName
     * @param stuSex
     * @return void
     */
    public void updateStudent(String stuId, String stuPassword, String stuName, String stuSex){
        MysqlConnection mysqlConnection = MysqlConnection.getMysqlConnection();
        Connection conn = mysqlConnection.getCon();
        String sql = "updata student set stu_password = ?, stu_name = ?, stu_sex = ? where stu_id = ?";
        PreparedStatement stm = null;

        try {
            stm = conn.prepareStatement(sql);
            stm.setString(4,stuId);
            stm.setString(1,stuPassword);
            stm.setString(2,stuName);
            stm.setString(3,stuSex);
            stm.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * fun: 通过stuId查询一个学生的所有信息
     * @param stuId
     * @return Student
     */
    public Student queryStudent(String stuId){
        Student student = new Student();
        MysqlConnection mysqlConnection = MysqlConnection.getMysqlConnection();
        Connection conn = mysqlConnection.getCon();
        String sql = "select * from student where stu_id="+stuId;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            stm = conn.prepareStatement(sql);
            rs = stm.executeQuery();
            if(rs.next()){
                student.setStuId(rs.getString("stu_Id"));
                student.setStuName(rs.getString("stu_name"));
                student.setStuPassword(rs.getString("stu_password"));
                student.setStuSex(rs.getString("stu_sex"));

            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            mysqlConnection.closeResuletSet(rs);
        }
        return student;
    }

    /**
     * fun: 查询所有读者的所有信息
     * @return ArrayList<Student>
     */
    public ArrayList<Student> queryAllStudent(){
        ArrayList<Student> students_Array = new ArrayList<Student>();
        MysqlConnection mysqlConnection = MysqlConnection.getMysqlConnection();
        Connection conn = mysqlConnection.getCon();
        String sql = "select * from admin where status=1";
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            stm = conn.prepareStatement(sql);
            rs = stm.executeQuery();
            while(rs.next()){
                Student student = new Student();
                student.setStuId(rs.getString("stu_Id"));
                student.setStuName(rs.getString("stu_name"));
                student.setStuPassword(rs.getString("stu_password"));
                student.setStuSex(rs.getString("stu_sex"));
                students_Array.add(student);
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            mysqlConnection.closeResuletSet(rs);
        }
        return students_Array;
    }

    /********************************************
     * author: wangziquan
     * @param: username
     * @param: password
     * 学生登录
     ********************************************/
    public boolean loginSystem(String username, String password) {
        Connection conn = MysqlConnection.getMysqlConnection().getCon();
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            pst = conn.prepareStatement("SELECT * FROM student WHERE stu_id = ? AND stu_password = ?");
            pst.setString(1, username);
            pst.setString(2, password);
            rs = pst.executeQuery();

            if (rs != null) return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

}








