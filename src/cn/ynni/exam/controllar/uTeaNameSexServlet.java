package cn.ynni.exam.controllar;

import cn.ynni.exam.service.StudentService;
import cn.ynni.exam.service.TeacherService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class uTeaNameSexServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
    protected void doPost(HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        String getName = req.getParameter("name");
        HttpSession session = req.getSession(true);
        String getId = (String) session.getAttribute("username");

        TeacherService teacherService = new TeacherService();
        PrintWriter pw = resp.getWriter();

        Boolean result = teacherService.updateNameAndSex(getId,getName);
        if(!result){
                pw.println("<script language='javascript'>alert('修改失败')</script>");
                pw.println("<script>window.history.go(-1)</script>");
        }else {
            pw.println("<script language='javascript'>alert('修改成功')</script>");
            pw.println("<script>window.history.go(-1)</script>");
        }

    }
}
