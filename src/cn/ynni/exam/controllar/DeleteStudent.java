package cn.ynni.exam.controllar;

import cn.ynni.exam.model.Student;
import cn.ynni.exam.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class DeleteStudent extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=utf-8");

        String userName = req.getParameter("userName");

        StudentService studentService = new StudentService();
        boolean flag = studentService.deleteStudent(userName);

        ArrayList<Student> allStudent = studentService.queryAllStudent();

        req.setAttribute("allStudent", allStudent);

        if (flag) req.setAttribute("str", "true");
        else req.setAttribute("str", "false");

        req.getRequestDispatcher("StudentManage.jsp").forward(req, resp);
    }
}
