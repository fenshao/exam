package cn.ynni.exam.controllar;

import cn.ynni.exam.model.Answer;
import cn.ynni.exam.model.Grade;
import cn.ynni.exam.model.Paper;
import cn.ynni.exam.model.Question;
import cn.ynni.exam.service.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class AnswerServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=utf-8");

        //获取时间字符串
       //String timer = req.getParameter("time");
        //int time = getSeconds(timer);

        //1、获取试题编号
        String paperId = (String) req.getSession().getAttribute("paperId");

        //2、获取答题答案
        QuestionService questionService = new QuestionService();
        ArrayList<Question> questionArrayList = questionService.selectQuestion(Integer.parseInt(paperId)); //查询所有试题

        //获取考生答案
        ArrayList<String> arrayList = getList(req, questionArrayList);

        //计算分数
        int score = 10;
        Answer answer = new Answer();
        answer.setOption(arrayList);
        answer.setPaperId(Integer.parseInt(paperId));
        answer.setStdId((String) req.getSession().getAttribute("username"));
        AnswerService answerService = new AnswerService();
        GradeService gradeService = new GradeService();
        Grade grade = gradeService.selectGrade();
        int scores = answerService.judgeScore(answer, grade.getScore());

        //插入成绩表
        ScoreService scoreService = new ScoreService();

        boolean flag = scoreService.insertScore((String) req.getSession().getAttribute("username"), Integer.parseInt(paperId), scores);

        //查看所有考试
        PaperService paperService = new PaperService();
        ArrayList<Paper> paperArrayList = paperService.selectPerpar();

        req.setAttribute("paperArrayList", paperArrayList);

        //4、比较剩余时间和是否和
        if (flag) req.setAttribute("str", "true");
        else req.setAttribute("str", "false");

        req.getRequestDispatcher("studentTest.jsp").forward(req,  resp);

    }

    public int getSeconds(String timer) {
        //截取字符串
        int seconds;
        String[] strings = timer.split(" ");

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i] + " " + i);
        }

        return 0;
    }

    public String getString(HttpServletRequest req, int id) {
        String result = "";

        String[] str = req.getParameterValues(Integer.toString(id));

        if (str == null) return "5";

        for (int i = 0; i < str.length; i++) {
            result += str[i] + ((i + 1) == str.length ? "" : ":");
        }

        return result;
    }

    public ArrayList<String> getList(HttpServletRequest req, ArrayList<Question> questions) {
        ArrayList<String> arrayList = new ArrayList<String>();

        Iterator it = questions.iterator();

        while (it.hasNext()) {
            Question question = (Question) it.next();

            arrayList.add(getString(req, question.getQuestionId()));

        }

        return arrayList;
    }
}
