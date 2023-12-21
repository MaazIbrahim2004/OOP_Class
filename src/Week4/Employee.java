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
		return e; // returns a reference to an employee object. This means that the method returns the address of the object
	}
	// now, depending on if the user wants to create an employee with a mailing address or a home address, they can use the getInstance_M or getInstance_H methods
	// and assign the returned object to a variable of type Employee
	// ex: Employee emp = Employee.getInstance_M("May", 123, "123 Main St"); this creates an employee with a mailing address
	// basically Employee emp = e; Where e is the object that is returned by the getInstance_M method
	// emp just holds the address of the object e, so emp and e are pointing to the same object
	// we can do this as e is a reference variable of Employee objects, and the method getInstance_M returns a reference to an Employee object
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
//		homeAdr = home;package Week4;
///**
// * This class represent an Employee with a name, ID, mailing address and home address
// * @author May Haidar
// * @version 1
// */
//public class Employee {
//	String name;
//	int id;
//	String mailingAdr;
//	String homeAdr;
//	static int count = 0;
// 	/**
//	 * This is a private constructor that can only be accessed inside this class.
//	 * @param name represents the name of the employee
//	 * @param id represents the employee ID
//	 */
//
//	public Employee(String name, int id) {
//		this.name = name;
//		this.id = id;
//		mailingAdr = "";
//		homeAdr = "";
//		count++;
//	}
//
//	/**
//	 *
//	 * @param name represents the name of the employee
//	 * @param id represents the employee ID
//	 * @param mailing represents the mailing address of the employee
//	 * @return It returns a reference to an employee object
//	 */
//
//	public static Employee getInstance_M(String name, int id, String mailing) {
//		Employee e = new Employee(name, id);
//		e.mailingAdr = mailing;
//		return e;
//	}
//
//	/**
//	 *
//	 * @param name represents the name of the employee
//	 * @param id represents the employee ID
//	 * @param home represents the home address of the employee
//	 * @return It returns a reference to an employee object
//	 */
//
//	public static Employee getInstance_H(String name, int id, String home) {
//		Employee e = new Employee(name, id);
//		e.homeAdr = home;
//		return e;
//	}
//
//	/**
//	 * This method is a static method, in order to enable us to use the static variable count.
//	 * @return It returns the value of count, which is a static instance variable.
//	 */
//	public static int getCount () {
//		return count;
//	}
//
//	/**
//	 * This method creates a string out of the information of the current object.
//	 * @return It return a string that contains the information of this object.
//	 */
//
//	public String toString() {
//		return  "Name: " + this.name + "\nID: " + this.id+ "\nMailing Address: " +
//							  this.mailingAdr + "\nHome Address: " + this.homeAdr;
//
//	}
//
//}
//
///* The following codes cannot be used as you cannot have two constructors that accept
// * the same number and type of parameters. With this you will confuse java as java doesn't
// * know which constructor to use when you create an object.
// */
//  	/**
//	 *
//	 * @param name represents the name of the employee
//	 * @param ID represents the employee ID
//	 * @param mailing is the employee mailing address
//	 */
////	public Employee(String name, int id, String mailing) {
////		this.name = name;
////		this.id = id;
////		mailingAdr = mailing;
////		count++;
////	}
////	public  Employee (String name, int id, String home) {
////		this.name = name;
////		this.id = id;
////		homeAdr = home;
////		count++;
////	}
////	public static Employee getInstance(String name, int id, String home, String address) {
////		return new Employee(name, id, home, address);
////	}
//		count++;
//	}
//	public static Employee getInstance(String name, int id, String home, String address) {
//		return new Employee(name, id, home, address);
//	}



