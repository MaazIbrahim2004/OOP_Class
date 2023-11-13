package Week4;
/**
 * This class represent an Employee with a name, ID, mailing address and home address
 * @author May Haidar
 * @version 1
 */
public class Employee {
	String name; 
	int id; 
	String mailingAdr; 
	String homeAdr;
	static int count = 0;
 	/**
	 * This is a private constructor that can only be accessed inside this class. 
	 * @param name represents the name of the employee
	 * @param id represents the employee ID
	 */
	
	public Employee(String name, int id) {
		this.name = name; 
		this.id = id;
		mailingAdr = "";
		homeAdr = "";
		count++;
	}
	
	/**
	 * 
	 * @param name represents the name of the employee
	 * @param id represents the employee ID
	 * @param mailing represents the mailing address of the employee
	 * @return It returns a reference to an employee object
	 */
	
	public static Employee getInstance_M(String name, int id, String mailing) {
		Employee e = new Employee(name, id);
		e.mailingAdr = mailing;
		return e;
	}
	
	/**
	 * 
	 * @param name represents the name of the employee
	 * @param id represents the employee ID
	 * @param home represents the home address of the employee
	 * @return It returns a reference to an employee object
	 */

	public static Employee getInstance_H(String name, int id, String home) {
		Employee e = new Employee(name, id);
		e.homeAdr = home;
		return e;
	}
	
	/**
	 * This method is a static method, in order to enable us to use the static variable count.
	 * @return It returns the value of count, which is a static instance variable.
	 */
	public static int getCount () {
		return count;
	}
	
	/**
	 * This method creates a string out of the information of the current object.
	 * @return It return a string that contains the information of this object.
	 */
	
	public String toString() {
		return  "Name: " + this.name + "\nID: " + this.id+ "\nMailing Address: " + 
							  this.mailingAdr + "\nHome Address: " + this.homeAdr;
		
	}

}

/* The following codes cannot be used as you cannot have two constructors that accept 
 * the same number and type of parameters. With this you will confuse java as java doesn't 
 * know which constructor to use when you create an object. 
 */
  	/**
	 * 
	 * @param name represents the name of the employee
	 * @param ID represents the employee ID
	 * @param mailing is the employee mailing address
	 */
//	public Employee(String name, int id, String mailing) {
//		this.name = name;
//		this.id = id;
//		mailingAdr = mailing;
//		count++;
//	}
//	public  Employee (String name, int id, String home) {
//		this.name = name;
//		this.id = id;
//		homeAdr = home;
//		count++;
//	}
//	public static Employee getInstance(String name, int id, String home, String address) {
//		return new Employee(name, id, home, address);
//	}



