package cn.ynni.exam.service;

import cn.ynni.exam.model.Paper;
import cn.ynni.exam.utils.MysqlConnection;

import java.sql.*;
import java.util.ArrayList;

public class PaperService {

    /**
     * 增加题库
     * @param id
     * @param title
     * @return
     */
    public boolean addPaper(int id,String title){
        MysqlConnection mysqlConnection = MysqlConnection.getMysqlConnection();
        Connection conn = mysqlConnection.getCon();
        PreparedStatement pstmt = null;
        String sql = "insert into paper(paper_id, title) values(?, ?)";

        try{
            pstmt = conn.prepareStatement(sql);
            //增加id和title
            pstmt.setInt(1,id);
            pstmt.setString(2,title);
           int rs = pstmt.executeUpdate();//执行update
        }catch (SQLException e){
            e.printStackTrace();
        }
        return true;
    }

    /**
     *查询题库目录
     * @return
     */
    public ArrayList<Paper> selectPerpar(){
        ArrayList<Paper>  sArray = new ArrayList<Paper>();
        MysqlConnection mysqlConnection = MysqlConnection.getMysqlConnection();
        Connection conn = mysqlConnection.getCon();

        String sql = "select * from paper;";

        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try{
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()){
                Paper pa = new Paper();
                pa.setPaperId(rs.getInt("paper_id"));
                pa.setTitle(rs.getString("title"));
                sArray.add(pa);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally{
            mysqlConnection.closeResuletSet(rs);
        }
        return sArray;
    }

    /**
     *删除题库
     * @param id
     * @return
     */
    public boolean  deletePaper(int id){
        MysqlConnection mysqlConnection = MysqlConnection.getMysqlConnection();
        Connection conn = mysqlConnection.getCon();

        PreparedStatement pstmt = null;
        String sql = "delete from paper where paper_id = ?;";

        try{
            pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1,id);
            pstmt.executeUpdate(sql);//执行delete
        }catch (SQLException e){
            e.printStackTrace();
        }

        return true;
    }

    /**
     *修改题库目录
     * @param id
     * @param newTitle
     * @return
     */
    public boolean updatePaper(int id,String newTitle){
        MysqlConnection mysqlConnection = MysqlConnection.getMysqlConnection();
        Connection conn = mysqlConnection.getCon();

        PreparedStatement pstmt = null;
        String sql = "update paper set title = ? where paper_id = ?;";

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(2,id);
            pstmt.setString(1,newTitle);
            pstmt.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }
        return true;
    }


    /********************************************
     * author: wangziquan
     * @param: paperId
     * 查询试题名称 根据paperId查询
     ********************************************/
    public Paper oneselectInfo(String paperId) {
        Connection conn = MysqlConnection.getMysqlConnection().getCon();
        PreparedStatement stm = null;
        ResultSet resultSet = null;
        Paper paper = new Paper();

        try {
            stm = conn.prepareStatement("SELECT * from paper WHERE paper_id = ?");
            int id = Integer.parseInt(paperId);
            stm.setInt(1, id);
            resultSet = stm.executeQuery();

            while (resultSet.next()) {
                paper.setPaperId(resultSet.getInt(1));
                paper.setTitle(resultSet.getString(2));
                System.out.println(resultSet.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return paper;
    }

    public int getMaxpaperId() {
        Connection conn = MysqlConnection.getMysqlConnection().getCon();
        PreparedStatement stm = null;
        ResultSet resultSet = null;

        try {
            stm = conn.prepareStatement("SELECT MAX(paper_id) FROM paper");
            resultSet = stm.executeQuery();

            while (resultSet.next()) {
                return resultSet.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return  0;
    }
}
