package cn.ynni.exam.model;

public class Answer {
    private String[] option; //选项 option[0]代表第1道题学生答案
    private String stdId; //学生Id
    private int paperId;

    public String[] getOption() {
        return option;
    }

    public void setOption(String[] option) {
        this.option = option;
    }

    public String getStdId() {
        return stdId;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public int getPaperId() {
        return paperId;
    }

    public void setPaperId(int paperId) {
        this.paperId = paperId;
    }
}
