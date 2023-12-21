package Lab5;
import java.util.*;

public class SchoolManager {
	private MyList overtimeList;
	private MySet seminarRegistrationList;

	public SchoolManager() {
		overtimeList = new MyList();
		seminarRegistrationList = new MySet();
	}

	public void addToOvertimeList(Employee employee) {
		overtimeList.add(employee);
	}

	public void addToSeminarRegistrationList(Employee employee) {
		seminarRegistrationList.add(employee);
	}

	public int getOvertimeEmployeeCount() {
		return overtimeList.getSize();
	}

	public int getSeminarRegistrationsCount() {
		return seminarRegistrationList.getSize();
	}

	public String displayOvertimeList() {
		return overtimeList.toString();
	}

	public String displaySeminarRegistrationList() {
		return seminarRegistrationList.toString();
	}
}

class Employee {
	private String name;
	private int age;
	private String employeeId;

	public Employee(String name, int age, String employeeId) {
		this.name = name;
		this.age = age;
		this.employeeId = employeeId;
	}

	// Getters
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	// Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return "{" + this.name + " (ID: " + this.employeeId + "), Age: " + this.age + "}";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age, employeeId);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Employee employee = (Employee) o;
		return age == employee.age &&
				Objects.equals(name, employee.name) &&
				Objects.equals(employeeId, employee.employeeId);
	}
}

abstract class Container {
	protected final int INITIAL_SIZE = 10;
	protected Object[] list;
	protected int size;

	public Container() {
		list = new Object[INITIAL_SIZE];
		size = 0;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int getSize() {
		return size;
	}

	public Object get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
		return list[index];
	}

	protected void grow() {
		Object[] newList = new Object[list.length * 2];
		System.arraycopy(list, 0, newList, 0, list.length);
		list = newList;
	}

	public abstract boolean add(Object element);
	public abstract boolean remove(Object element);

	// Using the toString method to iterate over the elements
	// and concatenate their string representation
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			sb.append(list[i].toString()).append("\n");
		}
		return sb.toString();
	}
}

class MyList extends Container {

	public MyList() {
		super();
	}

	@Override
	public boolean add(Object element) {
		if (size == list.length) {
			grow();
		}
		list[size] = element;
		size++;
		return true;
	}

	@Override
	public boolean remove(Object element) {
		for (int i = 0; i < size; i++) {
			if (list[i].equals(element)) {
				int numMoved = size - i - 1;
				if (numMoved > 0) {
					System.arraycopy(list, i + 1, list, i, numMoved);
				}
				list[--size] = null;
				return true;
			}
		}
		return false;
	}
}

class MySet extends Container {

	public MySet() {
		super();
	}

	@Override
	public boolean add(Object element) {
		if (!this.contains(element)) {
			if (size == list.length) {
				grow();
			}
			list[size++] = element;
			return true;
		}
		return false;
	}

	@Override
	public boolean remove(Object element) {
		for (int i = 0; i < size; i++) {
			if (list[i].equals(element)) {
				int numMoved = size - i - 1;
				if (numMoved > 0) {
					System.arraycopy(list, i + 1, list, i, numMoved);
				}
				list[--size] = null;
				return true;
			}
		}
		return false;
	}

	// Override the contains method to check for the presence of an element
	public boolean contains(Object element) {
		for (int i = 0; i < size; i++) {
			if (element.equals(list[i])) {
				return true;
			}
		}
		return false;
	}
}
