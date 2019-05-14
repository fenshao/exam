package cn.ynni.exam.controllar;

import cn.ynni.exam.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class registerServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        //获取参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String name = req.getParameter("number");
        String sex = req.getParameter("sex");

        System.out.println(name);

        StudentService studentService = new StudentService();
        boolean result = studentService.insertStudent(username, password, name, sex);

       if (result) {
            resp.sendRedirect("index.jsp");
       }
       else {
           req.setAttribute("message", "注册失败");
           req.getRequestDispatcher("index.jsp").forward(req, resp);
       }

    }
}
