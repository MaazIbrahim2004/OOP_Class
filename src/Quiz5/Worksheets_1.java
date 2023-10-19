package Quiz5;

import java.util.ArrayList;

public class Worksheets_1 {
    ArrayList<Question> questions;

    public Worksheets_1() {
        this.questions = new ArrayList<Question>();
    }

    public Worksheets_1(ArrayList<Question> quest) {
        this.questions = quest;
    }

    public Worksheets_1(Worksheets_1 ws5) {
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

