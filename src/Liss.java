import java.util.*;

public class Liss {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(1);
        Set<Integer> s = new HashSet<>();
        for (Integer integer : l) {
            if (!s.add(integer)) {  // if the element is a duplicate, add() will return false
                System.out.println("Duplicate: " + integer);
            }
            else System.out.println("No duplicates");
        }
    }
}
