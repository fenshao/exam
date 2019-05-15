/**
 * @Description: 判断Excel类型
 * @author: 杨得轩  201613446207
 * @date: 2018年4月11日 下午4:57:21
 */
package cn.ynni.exam.service;

import cn.ynni.exam.model.Question;

import java.util.ArrayList;

public class UploadExcel {
    public UploadExcel(){

    }
    public static ArrayList<Question> excel(String path) {
        //String path = "C:\\Users\\y8501\\Desktop\\111.xlsx";
        //String path = "C:\\Users\\y8501\\Desktop\\222.xls";
        System.out.println(path.endsWith(".xlsx"));
        ArrayList<Question> a = null;
        if (path.endsWith(".xls")) {
            Excel03 e = new Excel03();
            a = e.getExcel(path);
        } else if (path.endsWith(".xlsx")) {
            Excel07 e = new Excel07();
            a = e.getExcel(path);
        }
        else {
            System.out.println("请上传Excel文件！");
        }
        return a;
    }

//    public static void main(String[] args) {
////        //String path = "C:\\Users\\y8501\\Desktop\\111.xlsx";
////        String path = "C:\\Users\\小勇勇\\Desktop\\新建文件夹222.xls";
////        ArrayList<Question> a = excel(path);
////        for (int i = 0; i < 195; i++) {
////            System.out.print(a.get(i).getTitle());
////            System.out.print(" A:" + a.get(i).getOptionA());
////            System.out.print(" B:" + a.get(i).getOptionB());
////            System.out.print(" C:" + a.get(i).getOptionC());
////            System.out.print(" D:" + a.get(i).getOptionD());
////            System.out.println(" 答案: " + a.get(i).getAnswer());
////        }
////    }
}
