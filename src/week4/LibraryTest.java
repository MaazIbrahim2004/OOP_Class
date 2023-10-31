package week4;

public class LibraryTest {
	public static void main(String[] args) {
		
		String [] author = {"Kathy Sierra", "Bert Bates"};
		
		Book javaBook = Book.getInstance_13("Head first Java", "978-0596009205", author);
		Employee.getInstance_M("May", 123, "123 Main St");
		System.out.println(Employee.getCount()); // 1 because we only created one employee object
		Employee.getInstance_H("May", 123, "123 Main St");
		System.out.println(Employee.getCount()); // 2 because we created another employee object
		System.out.println(Book.getBookNo());

		author = new String [2];
		author[0] = "Robert Sedgewick";
		author[1] = "Kevin Wayne";
				
		// creating an instance using the static factory method getInstance.
		javaBook = Book.getInstance_10("Computer Science: An Interdisciplinary Approach", "0321498054", author);

		// if the above line works, it should be able to increment the bookNo variable. 
		System.out.println(Book.getBookNo());
		System.out.println(javaBook);
			
		
	}
}
