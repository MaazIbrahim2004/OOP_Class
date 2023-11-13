package Week4;
import java.util.*;
import java.lang.String;

public class EmployeeTest {

	public static void main(String[] args) {
		
		ArrayList<Employee> EmployeeList;

		EmployeeList = new ArrayList<Employee> ();
		Employee emp = new Employee("Jack", 123);
		EmployeeList.add(emp);

		Employee.getInstance_M("John", 456, "123 Main St.");


		MyString name = new MyString("Mr. Smith");
		String fullName = name.insertAt("John ", 4);
		System.out.println(fullName);
		System.out.println(name);
	}

}
