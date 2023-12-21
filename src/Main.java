import java.util.ArrayList;
import java.util.List;
public class Main <T>{
    public double sumOfList_v1(List<Number> list) { // means that the list can only contain Number objects
        double sum = 0.0;
        for (Number number : list)
            sum += number.doubleValue();
        return sum;
    }

    public double sumOfList_v2(List<? extends Number> list) { // means that the list can only contain Number objects
        double sum = 0.0;
        for (Number number : list)
            sum += number.doubleValue();
        return sum;
    }
    // the difference between the two methods is that the first one can only take a list of Number objects,
    // while the second one can take a list of any objects that are subclasses of Number.

    public static void main(String[] args) {
        List<Character> list = new ArrayList<Character>();
        list.add('a');
        list.add('b');
        List<Number> list2 = new ArrayList<Number>(); // can use Object because it is a superclass of Character
        list2.add(1); // we can add Integer objects to a list of Number objects because Integer is a subclass of Number
        // not like traditional inheritance, where a subclass cannot be assigned to a superclass, but in generics, a subclass can be assigned to a superclass
        list2.add(2.3);
        Main<Character> main = new Main<Character>();
        double sum = main.sumOfList_v1(list2);
        System.out.println(sum);

        List<Integer> list3 = new ArrayList<Integer>();
        list3.add(1);
        list3.add(2);
    }

}
