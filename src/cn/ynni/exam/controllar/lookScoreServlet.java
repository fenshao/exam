package cn.ynni.exam.controllar;

import cn.ynni.exam.model.ScoreInfo;
import cn.ynni.exam.service.ScoreService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class lookScoreServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //查看所有考试
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        //查询所有考生的考试信息
        String username = (String)req.getSession().getAttribute("username");

        System.out.println(username);

        //查询该用户信息
        ScoreService scoreService = new ScoreService();
        ArrayList<ScoreInfo> infoArrayList = scoreService.selectInfo(username);

        req.setAttribute("infoArrayList", infoArrayList);

        req.getRequestDispatcher("StudentScore.jsp").forward(req, resp);
    }
}
