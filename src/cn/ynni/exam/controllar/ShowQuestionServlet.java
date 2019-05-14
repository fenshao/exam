package cn.ynni.exam.controllar;

import cn.ynni.exam.model.PageUtil;
import cn.ynni.exam.model.Question;
import cn.ynni.exam.service.PageServiece;
import cn.ynni.exam.service.QuestionService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class ShowQuestionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String p = req.getParameter("page");
        int page;
        try {
            //当前页数
            page = Integer.parseInt(p);
        } catch (NumberFormatException e) {
            page = 1;
        }


        //获取总用户数
        QuestionService questionService = new QuestionService();
        PageServiece pageServiece = new PageServiece();

        PageUtil pageUtil = new PageUtil();

        pageUtil.setTotalUsers(pageServiece.getTotalCount("question"));
        pageUtil.setPage(page);

        ArrayList<Question> questionArrayList =  questionService.findPageBean(pageUtil.getBeginIndex(), pageUtil.getEndIndex(), "question");


        req.setAttribute("questionArrayList", questionArrayList);
        req.getRequestDispatcher("TestPaper.jsp");
    }
}
