package cn.ynni.exam.controllar;

import cn.ynni.exam.model.Student;
import cn.ynni.exam.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class AddStudentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        String username = req.getParameter("username");
        String name = req.getParameter("names");
        String password = req.getParameter("password");
        String sex = req.getParameter("sex");

        StudentService studentService = new StudentService();
        boolean flag = studentService.insertStudent(username, password, name, sex);

        ArrayList<Student> allStudent = studentService.queryAllStudent();
        req.setAttribute("allStudent", allStudent);

        if (flag) req.setAttribute("str", "true");
        else req.setAttribute("str", "false");

        req.getRequestDispatcher("StudentManage.jsp").forward(req, resp);

    }
}
