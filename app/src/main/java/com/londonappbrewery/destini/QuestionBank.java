package com.londonappbrewery.destini;

public class QuestionBank {
    public int getMnextQuestionIndx2() {
        return mnextQuestionIndx2;
    }

    public void setMnextQuestionIndx2(int mnextQuestionIndx2) {
        this.mnextQuestionIndx2 = mnextQuestionIndx2;
    }

    public int getMnextQuestionIndx() {
        return mnextQuestionIndx;
    }

    public void setMnextQuestionIndx(int mnextQuestionIndx) {
        this.mnextQuestionIndx = mnextQuestionIndx;
    }

    public int getMcurrentQuestionIndx() {
        return mcurrentQuestionIndx;
    }

    public void setMcurrentQuestionIndx(int mcurrentQuestionIndx) {
        this.mcurrentQuestionIndx = mcurrentQuestionIndx;
    }

    public int getMcurrentTopIndx() {
        return mcurrentTopIndx;
    }

    public void setMcurrentTopIndx(int mcurrentTopIndx) {
        this.mcurrentTopIndx = mcurrentTopIndx;
    }

    public int getMcurrentButtom() {
        return mcurrentButtom;
    }

    public void setMcurrentButtom(int mcurrentButtom) {
        this.mcurrentButtom = mcurrentButtom;
    }

    int mcurrentQuestionIndx;
    int mcurrentTopIndx;
    int mcurrentButtom;
    int mnextQuestionIndx;
    int mnextQuestionIndx2;
    QuestionBank(int currentQuestionIndx,int currentTopIndx, int currentButtom,int nextQuestionIndx,int nextQuestionIndx2)
    {
        mcurrentQuestionIndx = currentQuestionIndx;
        mcurrentTopIndx = currentTopIndx;
        mcurrentButtom = currentButtom;
        mnextQuestionIndx = nextQuestionIndx;
        mnextQuestionIndx2 = nextQuestionIndx2;
    }

}
