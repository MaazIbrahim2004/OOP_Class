package Quiz5;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Question> questions = new ArrayList<>();
        questions.add(new Question("Sample question", "Sample answer", new String[] {"Criteria1", "Criteria2"}));

        // Define newQuestion
        Question newQuestion = new Question("Another question", "Another answer", new String[] {"CriteriaA", "CriteriaB"});

        Worksheets_1 obj1 = new Worksheets_1(questions);
        Worksheets_1 obj2 = new Worksheets_1(obj1);
        System.out.println("Same Worksheet objects ? " + (obj1 == obj2));

        System.out.println("Same instance variable ? " + (obj1.getList() == obj2.getList()));

        System.out.println("Same instance variable's component? " + (obj1.getQuestion(0) == obj2.getQuestion(0)));

        obj1.setQuestion(0, newQuestion);
        System.out.println("Same instance variable's component? " + (obj1.getQuestion(0) == obj2.getQuestion(0)));

        obj1.Nullify();
        System.out.println("Both are null? " + (obj1.getList() == obj2.getList()));

        Worksheets_2 obj3 = new Worksheets_2(questions);
        Worksheets_2 obj4 = new Worksheets_2(obj3);
        System.out.println("Same Worksheet objects ? " + (obj3 == obj4));

        System.out.println("Same instance variable ? " + (obj3.getList() == obj4.getList()));

        System.out.println("Same instance variable's component? " + (obj3.getQuestion(0) == obj4.getQuestion(0)));

        obj3.setQuestion(0, newQuestion);
        System.out.println("Same instance variable's component? " + (obj3.getQuestion(0) == obj4.getQuestion(0)));

        obj3.Nullify();
        System.out.println("Both are null? " + (obj3.getList() == obj4.getList()));

        Worksheets_3 obj5 = new Worksheets_3(questions);
        Worksheets_3 obj6 = new Worksheets_3(obj5);
        System.out.println("Same Worksheet objects ? " + (obj5 == obj6));

        System.out.println("Same instance variable ? " + (obj5.getList() == obj6.getList()));

        System.out.println("Same instance variable's component? " + (obj5.getQuestion(0) == obj6.getQuestion(0)));

        obj5.setQuestion(0, newQuestion);
        System.out.println("Same instance variable's component? " + (obj5.getQuestion(0) == obj6.getQuestion(0)));

        obj5.Nullify();
        System.out.println("Both are null? " + (obj5.getList() == obj6.getList()));

    }
}
