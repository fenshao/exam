package cn.ynni.exam.service;

import cn.ynni.exam.model.Answer;
import cn.ynni.exam.model.Question;

import java.util.ArrayList;
import java.util.Iterator;

public class AnswerService {

    /********************************************
     * author: wangziquan
     * @param: answer
     * @param: score 设置一道题几分
     * 批改试题 根据学生answer批改一套试题
     ********************************************/
    public int judgeScore(Answer answer, int score) {
        int scores = 0;
        //查询正确的答案
        QuestionService questionService = new QuestionService();
        ArrayList<Question> questionArrayList = questionService.selectQuestion(answer.getPaperId());

        //比对答案
        ArrayList<String> result = answer.getOption();
        Iterator it = questionArrayList.iterator();
        Iterator it1 = result.iterator();
        while (it.hasNext()) {
            Question question = (Question) it.next();
            String str = (String) it1.next();
            String[] rightAnswer = question.getAnswer().split(":");
            String[] userAnswer = str.split(":");

            for (int j = 0; j < rightAnswer.length; j++) {
                System.out.print(rightAnswer[j]);
            }

            for (int j = 0; j < userAnswer.length; j++) {
                System.out.print(userAnswer[j]);
            }

            scores += (judge(userAnswer, rightAnswer) == true ? score : 0);
        }

        return scores;
    }

    /********************************************
     * author: wangziquan
     * @param: answer
     * @param: rightAnswer
     * 批改试题 根据学生answer和正确答案批改一道试题
     ********************************************/
    public boolean judge(String[] answer, String[] rightAnswer) {
        if (answer.length != rightAnswer.length) return  false;
        else {
            for (int i = 0; i < answer.length; i++) {
                if (!rightAnswer[i].equals(answer[i])) return false;
            }
        }
        return true;
    }
}
