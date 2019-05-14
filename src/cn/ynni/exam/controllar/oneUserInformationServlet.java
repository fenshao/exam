package cn.ynni.exam.controllar;

import cn.ynni.exam.model.Student;
import cn.ynni.exam.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class oneUserInformationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        //获取用户ID
        String stuId = req.getParameter("stuId");

        //通过用户ID查询信息
        StudentService student = new StudentService();
        Student oneStudent = student.queryStudent(stuId);

        req.setAttribute("oneStudent", oneStudent);


    }
}
