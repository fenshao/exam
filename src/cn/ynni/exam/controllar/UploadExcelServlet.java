package cn.ynni.exam.controllar;

import cn.ynni.exam.service.UploadExcel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class UploadExcelServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        //获取参数
        String path = request.getParameter("file");
        UploadExcel uploadExcel = new UploadExcel();
        uploadExcel.excel(path);
        PrintWriter pw = response.getWriter();
        pw.println("<script>window.history.go(-1)</script>");

    }
}
