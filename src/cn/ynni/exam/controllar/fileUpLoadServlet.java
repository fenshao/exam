package cn.ynni.exam.controllar;

import cn.ynni.exam.model.Question;
import cn.ynni.exam.service.PaperService;
import cn.ynni.exam.service.QuestionService;
import cn.ynni.exam.service.UploadExcel;
import org.apache.commons.fileupload.DiskFileUpload;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class fileUpLoadServlet extends HttpServlet {
    public fileUpLoadServlet() {
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();

        String upLoadDir = this.getServletContext().getRealPath("/WEB-INF/upload");
        new File(upLoadDir);
        System.out.println("123");
        DiskFileUpload fu = new DiskFileUpload();
        fu.setSizeMax(524288000L);
        fu.setSizeThreshold(1048576);
        fu.setHeaderEncoding("utf-8");
        List fileItem = null;

        try {
            fileItem = fu.parseRequest(req);
        } catch (FileUploadException var21) {
            var21.printStackTrace();
        }

        Iterator it = fileItem.iterator();

        String path = null;
        while(it.hasNext()) {
            FileItem fitem = (FileItem)it.next();
            if (!fitem.isFormField()) {
                String pathSrc = fitem.getName();
                if (!pathSrc.trim().equals("")) {
                    int start = pathSrc.lastIndexOf(92);
                    String fileName = pathSrc.substring(start + 1);
                    path = fileName;
                    File pathDest = new File(upLoadDir, fileName);

                    try {
                        fitem.write(pathDest);
                    } catch (Exception var19) {
                        var19.printStackTrace();
                    } finally {
                        fitem.delete();
                    }
                }
            }
        }

        //文件处理
        ArrayList< Question > questionArrayList = UploadExcel.excel(upLoadDir + "\\" + path);
        PaperService paperService = new PaperService();
        int paperId = paperService.getMaxpaperId();

        path = path.substring(0, path.indexOf('.'));

        //插入试题名称
        paperService.addPaper(paperId + 1, path);

        //更改答案存储方式
        QuestionService questionService = new QuestionService();

        for (int i = 0; i < questionArrayList.size(); i++) {
            Question question = questionArrayList.get(i);
            questionArrayList.get(i).setAnswer(getString(question.getAnswer()));
        }
        questionService.insertmoreQuestion(questionArrayList, paperId + 1);

        req.setAttribute("str", "true");
        req.getRequestDispatcher("selectPaper.jsp").forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
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

