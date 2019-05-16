package cn.ynni.exam.controllar;

import cn.ynni.exam.model.Paper;
import cn.ynni.exam.service.GradeService;
import cn.ynni.exam.service.PaperService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class UpdateTestServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        String score = req.getParameter("score");

        GradeService gradeService = new GradeService();
        gradeService.updateGrade(Integer.parseInt(score));

        PaperService paperService = new PaperService();
        ArrayList<Paper> paperArrayList = paperService.selectPerpar();

        req.setAttribute("paperArrayList", paperArrayList);
        req.getRequestDispatcher("ModifyTest.jsp").forward(req, resp);
    }
}
