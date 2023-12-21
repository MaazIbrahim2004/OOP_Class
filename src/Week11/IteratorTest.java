
import java.util.*;

public class IteratorTest {

	public static void main(String[] args) {
		
		List<String> aList = new ArrayList<String>();
		
		aList.add("John");
		aList.add(0, "Jane");
		
		String obj = aList.get(0);
		
		int  index = aList.indexOf("Jane");
		index = aList.lastIndexOf("Jane");
		boolean found = aList.contains("Jane");
		
		aList.remove("John");
		aList.remove(0);
		
		/********** Set Example ********************/
		// declaration
		Set<String> aSet = new HashSet<String>();
		Set<String> tempSet = new HashSet<String>();
		// insertion 
		aSet.add("Jane");
		aSet.add("John");
		tempSet.add("Alice");
		tempSet.add("Bob");
		tempSet.add("John");
		
		// Union operator
		
		aSet.addAll(tempSet);
		
		
		// access the set: No sequential access is available.
		// Note that "John" has been added only once as duplicate data is not inserted.
		
		Iterator<String> setIterator = aSet.iterator();
		while (setIterator.hasNext()) {
			System.out.println(setIterator.next());
		}
		System.out.println("____________________");
		
		// search
		
		boolean isFound = aSet.contains("John");
		isFound = aSet.containsAll(tempSet);
		
		System.out.println(isFound);
		System.out.println("____________________");

		// intersection
		aSet.retainAll(tempSet);

		setIterator = aSet.iterator();
		while (setIterator.hasNext()) {
			System.out.println(setIterator.next());
		}
		System.out.println("____________________");
	
		// remove
		aSet.remove("John");
		
		setIterator = aSet.iterator();
		while (setIterator.hasNext()) {
			System.out.println(setIterator.next());
		}
		System.out.println("____________________");
		
		//set difference
		tempSet.removeAll(aSet); // tempSet - aSet
		
		setIterator = tempSet.iterator();
		while (setIterator.hasNext()) {
			System.out.println(setIterator.next());
		}
		System.out.println("____________________");
		
	}
	

}


