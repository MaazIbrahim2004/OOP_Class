package Quiz5;

public class Question {
    String question;
    String solution;
    String[] rubric;

    public Question(String quest, String sol, String[] rubric) {
        this.question = quest;
        this.solution = sol;
        this.rubric = new String[rubric.length];
        for (int i = 0; i < rubric.length; i++) {
            this.rubric[i] = rubric[i];
        }
    }

    public Question(Question quest) {
        question = quest.question;
        solution = quest.solution;
        rubric = new String[quest.rubric.length];
        for (int i = 0; i < quest.rubric.length; i++) {
            this.rubric[i] = quest.rubric[i];
        }
    }
}
