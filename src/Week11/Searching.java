
import java.util.*;

public class Searching {

	public static void main(String[] args) {
		List<String> aList = new ArrayList<String> ();
		aList.add("John");
		aList.add("Jane");
		aList.add("Alice");
		aList.add("Bob");
		/*
		for(int i = 0; i < aList.size(); i++)
			System.out.println(aList.get(i));
		*/
		System.out.println(linearSearch(aList, "Jane"));
		System.out.println(linearSearch(aList, "Jack"));
		System.out.println();
		
		
		// sort the list so that you can use the binarySearch algorithm
		selectionSort(aList);
		
		/*for(int i = 0; i < aList.size(); i++)
			System.out.println(aList.get(i));*/
		
		System.out.println(binarySearch(aList, "Jane"));
		System.out.println(binarySearch(aList, "Jack"));
		System.out.println();

		System.out.println(recursiveBinarySearch(aList, "Jane", 0, aList.size() -1 ));
		System.out.println(recursiveBinarySearch(aList, "Jack", 0, aList.size() -1 ));
		System.out.println();

	}
	
	/**
	 * This method searches a list to find the elements that's passed to the method. 
	 * It returns true if the element was found, otherwise false. 
	 * @param list is the list that is searched.
	 * @param element is the element that is looked for. 
	 * @return it returns true if the element is found in the list.
	 */

	public static  boolean linearSearch(List<String> list, String element){
		boolean found = false;
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i)).compareTo(element) == 0) {
				found = true;
				break;	
			}
		}
		return found;	
	}
	public static <T extends Comparable> boolean linearSearch_gen(List<T> list, T element){
		boolean found = false;
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i)).compareTo(element) == 0) {
				found = true;
				break;	
			}
		}
		return found;	
	}

	/**
	 * This method searches a list to find the elements that's passed to the method. 
	 * It returns true if the element was found, otherwise false. this algorithm used
	 * binary search to find the item
	 * @param list is the list that is searched.
	 * @param element is the element that is looked for. 
	 * @return it returns true if the element is found in the list.
	 */
	public static boolean  binarySearch(List<String> list, String element){
		boolean found = false;
		int lh = 0; 
		int rh = list.size() - 1;
		int mid = (lh+ rh)/2;
		while (lh <= rh) {
			if (list.get(mid).compareTo(element) == 0) {
				found = true;
				break;					
			}
			else if (list.get(mid).compareTo(element) > 0) {
				rh = mid - 1;
				mid = (lh+ rh)/2;
			}
			else {
				lh = mid + 1;
				mid = (lh+ rh)/2;				
			}
		}
		return found;
	}
	/**
	 * This method searches a list to find the elements that's passed to the method. 
	 * It returns true if the element was found, otherwise false. this algorithm used
	 * binary search to find the item. The algorithm is a recursive algorithm.
	 * @param list is the list that is searched.
	 * @param element is the element that is looked for. 
	 * @return it returns true if the element is found in the list.
	 */
	public static boolean  recursiveBinarySearch(List<String> list, String element, int lh, int rh){
		int mid = (lh+ rh)/2;
		if (list.get(mid).compareTo(element) == 0) return true;
		if (lh <= rh) {
			if (list.get(mid).compareTo(element) > 0) 
				return recursiveBinarySearch(list, element, lh, mid - 1 );
			return recursiveBinarySearch(list, element, mid + 1, rh );			
		}
		return false;
		
	}
	public static <T extends Comparable> boolean  recursiveBinarySearch_Gen(List<T> list, T element, int lh, int rh){
		int mid = (lh+ rh)/2;
		if (list.get(mid).compareTo(element) == 0) return true;
		if (lh <= rh) {
			if (list.get(mid).compareTo(element) > 0) 
				return recursiveBinarySearch_Gen(list, element, lh, mid - 1 );
			return recursiveBinarySearch_Gen(list, element, mid + 1, rh );			
		}
		return false;
		
	}

	/**
	 * This method gets a list and sort it alphabetically from a-z using selection sort
	 * @param list is a list of String
	 */
	 public static void selectionSort(List<String> list) { 
		 // scan the list to place each item at its right place
		 for(int i = 0; i < list.size() ; i++) {
			 int minIndex = i; 
			 // find the smallest item from i to list.size()
			 for (int j = i+1; j < list.size(); j++) {
				 if(list.get(j).compareTo(list.get(minIndex)) < 0)
					 minIndex = j;
			 }
			 
			 // swap the smallest item with the item at index i
			 String temp = list.get(i);
			 list.set(i, list.get(minIndex));
			 list.set(minIndex, temp);
		 }
	 }
}


