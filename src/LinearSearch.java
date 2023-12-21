import java.util.*;
public class LinearSearch { // don't need to put <T> here because it is not a generic class
    public static <T> int linearSearch(List<T> list, T key) { // List<T> means that the list can only contain T objects, and T key means that the key can only be a T object
        for (int i = 0; i < list.size(); i++) {
            if (key.equals(list.get(i))) {
                return i;
            }
        }
        return -1;
    }
        public static int linearSearchQ(List<?> list, Object key) { // List<?> means that the list can contain any type of objects, and Object key means that the key can be any type of object
            for (int i = 0; i < list.size(); i++) {
                if (key.equals(list.get(i))) {
                    return i;
                }
            }
            return -1;
        }
        // the difference between the two methods is that the first one can only take a list of T objects, while the second one can take a list of any type of objects

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        System.out.println(linearSearch(list, 3));
        List<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        System.out.println(linearSearch(list2, "b"));
        List<Double> list3 = new ArrayList<>();
        list3.add(1.2);
        list3.add(3.4);
        System.out.println(linearSearch(list3, 3.4));
        List<Character> list4 = new ArrayList<>();
        list4.add('a');
        list4.add('b');
        System.out.println(linearSearch(list4, 'b'));
        List<Object> list5 = new ArrayList<>();
        list5.add(1);
        list5.add(3.4);
        list5.add('a');
        list5.add("b");
        System.out.println(linearSearchQ(list5, 3.4));
    }
}
