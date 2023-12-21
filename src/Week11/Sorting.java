
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> aList = new ArrayList<Integer>();
		// generate 15 random numbers between 0-100 and add it to the list.
		Random rand = new Random();
		for (int i=0; i < 15; i++)
			aList.add(rand.nextInt(100));
		// print the content of the list
		for (Integer elem: aList)
			System.out.print(elem + "\t");
		System.out.println();
		// sort the list
		selectionSort(aList);
		// print the content after sorting the list
		for (Integer elem: aList)
			System.out.print(elem + "\t");
		System.out.println();
		
		aList = new ArrayList<Integer>();
		// generate 15 random numbers between 0-100 and add it to the list.
		rand = new Random();
		for (int i=0; i < 15; i++)
			aList.add(rand.nextInt(100));
		for (Integer elem: aList)
			System.out.print(elem + "\t");
		System.out.println();
		aList = mergeSort(aList);
		for (Integer elem: aList)
			System.out.print(elem + "\t");

	}
	
	/**
	 * This method gets a list and sort it by selection sort algorithm 
	 * @param list is a list that contains integer numbers.
	 */
	public static void selectionSort(List<Integer> list) {
		 for(int i = 0; i < list.size() - 1; i++) {
	      		int minPos = i;
			for (int j = i + 1; j < list.size(); j++) 
				if (list.get(j) < list.get(minPos)) 
					minPos = j;

			int temp = list.get(minPos);
			list.set(minPos, list.get(i));
			list.set(i, temp);
		}
	}
	public static <T extends Comparable> void selectionSort_Gen(List<T> list) {
		 for(int i = 0; i < list.size() - 1; i++) {
	      		int minPos = i;
			for (int j = i + 1; j < list.size(); j++) 
				if (list.get(j).compareTo(list.get(minPos)) < 0) 
					minPos = j;

			T temp = list.get(minPos);
			list.set(minPos, list.get(i));
			list.set(i, temp);	
		}
	}

	public static List<Integer> mergeSort(List<Integer> aList) {
		if (aList.size() <= 1) 	return aList;  

		int mid = aList.size() / 2;
		List<Integer> left = new ArrayList<Integer> (aList.subList(0, mid)); 
		List<Integer> right = new ArrayList<Integer> (aList.subList(mid, aList.size())); 

		left = mergeSort(left);
	    right = mergeSort(right);
	    aList = merge(left, right);
	    return aList;
		
	}
	
	
	
	public static List <Integer> merge(List<Integer> leftList, List<Integer> rightList) {
		ArrayList <Integer> aList = new ArrayList<Integer>();
		while (leftList.size() > 0 && rightList.size() > 0) {
			if (leftList.get(0) < rightList.get(0))
				aList.add(leftList.remove(0));
			else
				aList.add(rightList.remove(0));
		}		
		if(!leftList.isEmpty())
				aList.addAll(leftList);
		if(!rightList.isEmpty())
				aList.addAll(rightList);
		return aList;
	}
}

