package Quiz5;

import java.util.ArrayList;

public class Worksheets_3 {
    ArrayList<Question> questions;

    public Worksheets_3() {
        this.questions = new ArrayList<Question>();
    }

    public Worksheets_3(ArrayList<Question> quest) {
        this.questions = new ArrayList<Question>(quest.size());
        for (Question obj : quest) {
            Question newObj = new Question(obj.question, obj.solution, obj.rubric);
            this.questions.add(newObj);
        }
    }

    public Worksheets_3(Worksheets_3 ws5) {
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

