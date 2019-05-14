package cn.ynni.exam.controllar;


import cn.ynni.exam.model.Paper;
import cn.ynni.exam.service.PaperService;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;


public class selectPaperServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            req.setCharacterEncoding("UTF-8");
            resp.setContentType("text/html;charset=UTF-8");

            String Id = req.getParameter("paperId");
            PaperService paperService = new PaperService();
            ArrayList<Paper> allPaper = new ArrayList<Paper>();/*误点*/

            //当输入为空时
            if(Id=="")allPaper = paperService.selectPerpar();
            else{
                //输入数字
                allPaper.add(paperService.oneselectInfo(Id));
            }

            req.setAttribute("allPaper", allPaper);
            req.getRequestDispatcher("selectPaper.jsp").forward(req, resp);
    }

}
