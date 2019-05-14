package cn.ynni.exam.controllar;
import cn.ynni.exam.model.Student;
import cn.ynni.exam.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


public class uPasswordServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
    protected void doPost(HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        //获取 新旧密码 以及用户账号
        HttpSession session = req.getSession(true);
        String oldPass = req.getParameter("password");
        String newPass = req.getParameter("password2");
        String getId = (String) session.getAttribute("username");

        //判断密码是否正确
        StudentService studentService = new StudentService();
        Student student = studentService.loginSystem(getId, oldPass);

        PrintWriter pw = resp.getWriter();
        if (student.getStuId() != null){
            //修改密码
            Boolean result = studentService.updatePassword(getId,newPass);
            if(!result){
                pw.println("<script language='javascript'>alert('修改失败')</script>");
                pw.println("<script>window.history.go(-1)</script>");
            }else {
                pw.println("<script language='javascript'>alert('修改成功')</script>");
                pw.println("<script>window.history.go(-1)</script>");
            }

        }else {
            pw.println("<script language='javascript'>alert('修改失败')</script>");
            pw.println("<script>window.history.go(-1)</script>");
        }
    }
}

