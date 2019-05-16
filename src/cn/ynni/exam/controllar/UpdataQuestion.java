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

public class UpdataQuestion extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        //title, optionA, optionB, optionC, optionD, answer
        String title = req.getParameter("title");
        String questionId = req.getParameter("paperId");
        String optionA = req.getParameter("optionA");
        String optionB = req.getParameter("optionB");
        String optionC = req.getParameter("optionC");
        String optionD = req.getParameter("optionD");
        String answer = req.getParameter("answer");

        QuestionService questionService = new QuestionService();
        questionService.updateQuestion(title, Integer.parseInt(questionId), optionA, optionB, optionC, optionD, answer);
        Question question = questionService.selectQuestionone(Integer.parseInt(questionId));

        ArrayList<Question> questionArrayList = questionService.selectQuestion(question.getPaperId());

        PaperService paperService = new PaperService();
        ArrayList<Paper> paperArrayList = paperService.selectPerpar();

        req.setAttribute("paperArrayList", paperArrayList);
        req.setAttribute("questionArrayList", questionArrayList);

        req.getRequestDispatcher("ModifyTest.jsp").forward(req, resp);

    }

    public String getString(String str) {
        String result = "";

        if (str == null) return "5";

        for (int i = 0; i < str.length(); i++) {
            result += (str.charAt(i) - 64) + ((i + 1) == str.length() ? "" : ":");
        }

        return result;
    }
}
