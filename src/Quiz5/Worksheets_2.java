package Quiz5;

import java.util.ArrayList;

public class Worksheets_2 {
    ArrayList<Question> questions;

    public Worksheets_2() {
        this.questions = new ArrayList<Question>();
    }

    public Worksheets_2(ArrayList<Question> quest) {
        this.questions = new ArrayList<Question>(quest);
    }

    public Worksheets_2(Worksheets_2 ws5) {
        this(ws5.questions);
    }


    public ArrayList<Question> getList() {
        return this.questions;
    }

    public Question getQuestion(int index) {
        return this.questions.get(index);
    }

    public void setQuestion(int index, Question question) {
        this.questions.set(index, question);
    }

    public void Nullify() {
        this.questions = null;
    }
}

