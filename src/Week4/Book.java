package Week4;

/**
 * This class represent a book. the difference between this version and the previous version is:
 * a) ISBN was removed and ISBN_10 and ISBN_13 was added
 * b) The constructor made private and two staic factory methods were added for object creation.
 * @author Marzieh ahmadzadeh
 * @version 2
 */
public class Book {
	String name; 
	String ISBN_10; 
	String ISBN_13; 
	String[] author;
	static int bookNo = 0;
 	/**
	 * This is a private constructor that can only be accessed inside this class. 
	 * @param name represents the name of the book
	 * @param author is a list of the authors of this book
	 */
	
	private Book(String name, String[] author) {
		this.name = name; 
		this.author = new String[author.length];
		for (int i=0; i< author.length; i++) 
			this.author[i] = author[i];
		bookNo++;
		ISBN_10 = "";
		ISBN_13 = "";
	}
	
	/**
	 * 
	 * @param name name represents the name of the book
	 * @param ISBN_10 represents the ISBN_10 of the book
	 * @param author author is a list of the authors of this book
	 * @return It returns a reference to an object of the Book
	 */
	
	public static Book getInstance_10(String name, String ISBN_10, String[] author) {
		Book bookObject = new Book(name, author);
		bookObject.ISBN_10 = ISBN_10; 
		return bookObject;
	}
	
	/**
	 * 
	 * @param name name represents the name of the book
	 * @param ISBN_13 represents the ISBN_10 of the book
	 * @param author author is a list of the authors of this book
	 * @return It returns a reference to an object of the Book
	 */

	public static Book getInstance_13(String name, String ISBN_13, String[] author) {
		Book bookObject = new Book(name, author);
		bookObject.ISBN_13 = ISBN_13; 
		return bookObject;
	}
	
	/**
	 * This method is a static method, in order to enable us to use the static variable bookNo.
	 * @return It returns the value of bookNo, which is a static instance variable.
	 */
	public static int getBookNo () {
		return bookNo;
	}
	
	/**
	 * This method creates a string out of the information of the current object.
	 * @return It return a string that contains the information of this object.
	 */
	
	public String toString() {
		String theBook = "Title: " + this.name + "\nISBN_10: " + this.ISBN_10+ "\nISBN_13: " + this.ISBN_13;
		String auth = "";
		for (int i = 0; i < this.author.length; i++) {
			auth = this.author[i] + " ";
		}
		theBook = theBook + "\nAuthors: " + auth;
		return theBook;
		
	}

}

/* The following codes cannot be used as you cannot have two constructors that accept the same number and type of parameters. 
 * With this you will confuse java as java doesn;t know which constructor to use when you create an object. 
 */
  	/**
	 * 
	 * @param name represents the name of the book
	 * @param ISBN represents the ISBN_10 of the book
	 * @param author is a list of the authors of this book
	 */
	/*public Book(String name, String ISBN_10, String[] author) {
		this.name = name; 
		this.ISBN_10 = ISBN_10; 
		this.author = new String[author.length];
		for (int i=0; i< author.length; i++) 
			this.author[i] = author[i];
		bookNo++;
	}
	public Book(String name, String ISBN_13, String[] author) {
		this.name = name; 
		this.ISBN_13 = ISBN_13; 
		this.author = new String[author.length];
		for (int i=0; i< author.length; i++) 
			this.author[i] = author[i];
		bookNo++;
	}

 */

