package cn.ynni.exam.controllar;

import cn.ynni.exam.model.Student;
import cn.ynni.exam.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class SelectStudentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        String name = req.getParameter("name");

        StudentService studentService = new StudentService();
        ArrayList<Student> allStudent;

        if (name != "") allStudent = studentService.queryStudent(name);
        else allStudent = studentService.queryAllStudent();

       req.setAttribute("allStudent", allStudent);
       req.getRequestDispatcher("StudentManage.jsp").forward(req, resp);
    }
}
