package cn.ynni.exam.controllar;

import cn.ynni.exam.service.StudentService;
import cn.ynni.exam.service.TeacherService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class loginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        //获取账号密码
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String optionID = req.getParameter("option");
        boolean result = false;

        System.out.println(username + " " + password);


        if (optionID.equals("0")) { //学生
            //判断密码是否正确
            StudentService studentService = new StudentService();
            result = studentService.loginSystem(username, password);
        } else { //教师
            TeacherService teacherService = new TeacherService();
            result = teacherService.loginSystem(username, password);
        }

        if (result) {
            //设置session
            req.getSession().setAttribute("username", username);
            req.getSession().setMaxInactiveInterval(6000);

            if (optionID.equals("0")) resp.sendRedirect("studentcontent.jsp");
            else resp.sendRedirect("teachercontent.jsp");
        }
        else {
            req.setAttribute("message", "用户名或密码错误");
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }
    }
}
