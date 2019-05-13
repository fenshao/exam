package cn.ynni.exam.controllar;

import cn.ynni.exam.model.Paper;
import cn.ynni.exam.model.Question;
import cn.ynni.exam.service.PaperService;
import cn.ynni.exam.service.QuestionService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class TestServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        String paperId = req.getParameter("paperId");

        //查看试题
        QuestionService questionService = new QuestionService();
        ArrayList<Question> questionArrayList = questionService.selectQuestion(Integer.parseInt(paperId));

        //查看试题名称
        PaperService paperService = new PaperService();
        Paper paper = paperService.oneselectInfo(Integer.parseInt(paperId));

        req.setAttribute("title", paper.getTitle());

        req.setAttribute("questionArrayList", questionArrayList);

        req.getRequestDispatcher("/TestPaper.jsp").forward(req, resp);
    }
}
