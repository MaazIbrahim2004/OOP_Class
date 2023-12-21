package Week10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BoundedExample {

	public static void main(String[] args) {
		BoundedExample obj1 = new BoundedExample();
	
		//List<Number> list1 = new ArrayList<Integer>(); //Recall why this statement does not work. 
		
		List<Number> list1 = new ArrayList<Number>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Double> list3 = new ArrayList<Double>();
		List<String> list4 = new ArrayList<String>();
		list4.add("A");
	 	for (int i= 0; i < 10; i++) {
			list1.add(i);
			list2.add(i);
			list3.add(i*1.0);
		}
	 	
		// the following line does not work, because ArrayList<Integer> is not a subtype of ArrayList<Number>
		//System.out.println("Sum = " + obj1.sumOfList_v1(list2));
		
		// we use sumOfList_v2, that relaxes the restriction
//		System.out.println("Sum = " + obj1.sumOfList_v2(list2));
//		System.out.println("Sum = " + obj1.sumOfList_v2(list3));

//		// use of upper bound wildcards		
//		System.out.println(obj1.find(list1, 5));
		System.out.println(obj1.find(list2, 5)); // since T can be any type, we must rely on the compiler to infer the type
//		System.out.println(obj1.find(list3, 5.0));
//		System.out.println(obj1.find(list4, "A"));
//		// use of generic upper bound
//		System.out.println(obj1.search(list1, 1));
//		System.out.println(obj1.search(list2, 1));
//		System.out.println(obj1.search(list3, 1.0));
//		System.out.println(obj1.search(list4, "A"));

		// use of lower bound wildcards
		List<Integer> list5 = new ArrayList<Integer>();
		List<Number> list6 = new ArrayList<Number>();
		List<Object> list7 = new ArrayList<Object>();
		List<Double> list8 = new ArrayList<Double>();
		List<String> list9 = new ArrayList<String>();
		obj1.addNumbers(list5);
		obj1.addNumbers(list6);
		obj1.addNumbers(list7);
		//why do you think the following two lines are not correct?
		//obj1.addNumbers(list8);
		//obj1.addNumbers(list9);
		
		// use of unbounded wildcards
//		System.out.println(equals(list2, list3));
//		System.out.println(equals(list5, list6));
//		System.out.println(equals(list8, list9));
		
	}
		
	public static <T extends Comparable> int countGreaterThan(T[] array, T element) {
	    int count = 0;
	    for (T e : array)
	        if (e.compareTo(element) > 0)  
	            count++;
	    return count;
	}
	public static int countsmallerThan(List<? extends Integer> list, Integer element) {
		int count = 0;
		for (int i = 1; i <= 10; i++) 
	        if (list.get(i).intValue() < element.intValue())
	        		count++;
	    return count;
	}
	
	
	public double sumOfList_v1(List<Number> list) {
	    double sum = 0.0;
	    for (Number number : list)
	        sum += number.doubleValue();
	    return sum;
	}
	
	public double sumOfList_v2(List<? extends Number> list) {
	    double sum = 0.0;
	    for (Number number : list)
	        sum += number.doubleValue();
	    return sum;
	}

	public <T> boolean find(List<? extends T> list, T element) {
		boolean found = false;
	    for (T elem : list)
	    	if (elem.equals(element)) {
	    		found = true; 
	    		break;
	    	}
	    return found;
	}

	public <T> boolean search(List<? extends T> list, T element) { // doing List<T> list will not work as T is not defined
		// we do extends T, because we want to use the equals method, which is defined in the Object class
		boolean found = false;
	    for (int i = 0; i < list.size(); i++)
	    	if (list.get(i).equals(element)) {
	    		found = true; 
	    		break;
	    	}
	    return found;
	}
	
	public void addNumbers(List<? super Integer> list) {
	    for (int i = 1; i <= 10; i++) {
	        list.add(Integer.valueOf(i));
	    }
	}
	
	public static void printList(List<?> list) {
	    for (Object element: list)
	        System.out.print(element + "\t");
	    System.out.println();
	}
	/**
	 * A method that is independent of the type of the List
	 * @param list1
	 * @param list2
	 * @return
	 */
	public static boolean equals(List<?> list1, List<?> list2) {
		boolean equal = true;
		if (list1.size() != list2.size()) equal = false;
		else if (list1.getClass() != list2.getClass()) equal = false;
		else if (list1 == null || list2 == null) equal = false;
		else 
			for (int i = 0; i < list1.size(); i++)
				if (!(list1.get(i).equals(list2.get(i)))) {
					equal = false;
					break;
				}
	    return equal;
	}
	}





