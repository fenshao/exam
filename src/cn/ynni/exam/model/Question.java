package cn.ynni.exam.model;

public class Question {
    private int questionId;
    private String title;
    private  int paperId;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String answer;
    private int index;

    public int getQuestionId() {
        return questionId;
    }

    public String getTitle() {
        return title;
    }

    public int getPaperId() {
        return paperId;
    }

    public String getOptionA() {
        return optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public String getAnswer() {
        return answer;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPaperId(int paperId) {
        this.paperId = paperId;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
