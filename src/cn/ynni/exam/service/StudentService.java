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
    public boolean deleteStudent(String stuId) {
        // TODO Auto-generated method stub
        MysqlConnection mysqlConnection = MysqlConnection.getMysqlConnection();
        Connection conn = mysqlConnection.getCon();
        String sql = "delete from student where stu_id = ?";
        PreparedStatement stm = null;
        int rs = 0;
        try {
            stm = conn.prepareStatement(sql);
            stm.setString(1,stuId);
            rs = stm.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return rs != 0;
    }

    /**
     * fun: 修改一个学生的信息
     * @param stuId
     * @param stuPassword
     * @param stuName
     * @param stuSex
     * @return void
     */
    public boolean updateStudent(String stuId, String stuPassword, String stuName, String stuSex){
        MysqlConnection mysqlConnection = MysqlConnection.getMysqlConnection();
        Connection conn = mysqlConnection.getCon();
        String sql = "update student set stu_password = ?, stu_name = ?, stu_sex = ? where stu_id = ?";
        PreparedStatement stm = null;
        int rs = 0;

        try {
            stm = conn.prepareStatement(sql);
            stm.setString(1,stuPassword);
            stm.setString(2,stuName);
            stm.setString(3,stuSex);
            stm.setString(4,stuId);
            rs = stm.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rs != 0;
    }

    /**
     *修改密码
     * @param stuId
     * @param newPsw
     * @return
     */
    public Boolean updatePassword(String stuId, String newPsw){
        MysqlConnection mysqlConnection = MysqlConnection.getMysqlConnection();
        Connection conn = mysqlConnection.getCon();
        String sql = "update student set stu_password = ? where stu_id = ?;";
        PreparedStatement stm = null;

        try {
            stm = conn.prepareStatement(sql);
            stm.setString(1,newPsw);
            stm.setString(2,stuId);
            stm.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return true;
    }

    /**
     * 更新名字和性别
     * @param stuId
     * @param stuName
     * @param stuSex
     * @return
     */
    public Boolean  updateNameAndSex(String stuId,String stuName,String stuSex){
        MysqlConnection mysqlConnection = MysqlConnection.getMysqlConnection();
        Connection conn = mysqlConnection.getCon();

        String sql = "update student set stu_name = ?,stu_sex = ? where stu_id = ?;";
        PreparedStatement stm = null;

        try {
            stm = conn.prepareStatement(sql);
            stm.setString(1,stuName);
            stm.setString(2,stuSex);
            stm.setString(3,stuId);
            stm.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return true;
    }
    /**
     * fun: 通过stuId查询一个学生的所有信息
     * @param name
     * @return Student
     */
    public ArrayList<Student> queryStudent(String names){
        ArrayList<Student> arrayList = new ArrayList<Student>();
        MysqlConnection mysqlConnection = MysqlConnection.getMysqlConnection();
        Connection conn = mysqlConnection.getCon();
        String sql = "select * from student where stu_name LIKE '%" + names + "%' ";
        System.out.println(sql);
        PreparedStatement stm = null;
        ResultSet rs = null;

        try {
            stm = conn.prepareStatement(sql);
            rs = stm.executeQuery();
            if(rs.next()){
                Student student = new Student();
                student.setStuId(rs.getString("stu_Id"));
                student.setStuName(rs.getString("stu_name"));
                student.setStuPassword(rs.getString("stu_password"));
                student.setStuSex(rs.getString("stu_sex"));

                arrayList.add(student);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            mysqlConnection.closeResuletSet(rs);
        }
        return arrayList;
    }

    /**
     * fun: 查询所有读者的所有信息
     * @return ArrayList<Student>
     */
    public ArrayList<Student> queryAllStudent(){
        ArrayList<Student> students_Array = new ArrayList<Student>();
        MysqlConnection mysqlConnection = MysqlConnection.getMysqlConnection();
        Connection conn = mysqlConnection.getCon();
        String sql = "select * from student";
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
    public Student loginSystem(String username, String password) {
        Student student = new Student();
        Connection conn = MysqlConnection.getMysqlConnection().getCon();
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            pst = conn.prepareStatement("SELECT * FROM student WHERE stu_id = ? AND stu_password = ?");
            pst.setString(1, username);
            pst.setString(2, password);
            rs = pst.executeQuery();

            while (rs.next()) {
                student.setStuId(rs.getString(1));
                student.setStuPassword(rs.getString(2));
                student.setStuName(rs.getString(3));
                student.setStuSex(rs.getString(4));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return student;
    }

}








