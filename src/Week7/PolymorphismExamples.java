package Week7;
import java.util.*;

public class PolymorphismExamples {

	public static void main(String[] args) {
		// polymorphism in object definition 
		
		List<Integer> vect = new Vector<Integer>();
		Object array = new ArrayList<Integer>();
		// Integer.valueOf() returns an obejct of type Integer
		Object intValue = Integer.valueOf(1);
		
		// which of the following statements is allowed? 
		/*vect.add(0);
		array.add(1);*/
		
		
		System.out.println(vect.toString());
		System.out.println(array.toString());
		System.out.println(intValue.toString());
		
		vect.add((Integer) intValue);
		System.out.println(vect.contains(intValue));
		
		// adding 10 integers to the vector
		for (int i = 0; i < 10; i++)
			vect.add(i);
		
		// subList() method returns a vector but can be assigned to a List
		List<Integer> subList = vect.subList(0, 5);
		for (int i = 0; i < subList.size(); i++)
			System.out.println(subList.get(i));
	}

}

