
import java.util.*;



public class AbstractExample {

	public static void main(String[] args) {
		// The following code is not possible, because Shape is abstract
		// Shape theShape = new Shape();  
		
//		Circle c1 = new Circle(4, 10, 10);
//		c1.moveToCenter();
		
		FacultyMember grader = new FacultyMember();
		List<Double> grades = new ArrayList<Double>();
		grader.m2();
	}

}

abstract class Shape {
	int centerX;
	int centerY;
	/**
	 * This method clears the screen.
	 * It sets the (centerX, centerY) to the center of the screen.
	 */

	public final void clearScr() {
		System.out.println("Clear screen is in process....");
		centerX = 0;
		centerY = 0;
		
	}
	/**
	 * this method is here for the sake of inheritance. 
	 * drawing a shape does not make sense unless
	 * we know exactly which shape we are going to draw
	 */
	public abstract void draw();
	/**
	 * this method is here for the sake of inheritance. 
	 * Each shape has its own way of computing the area.
	 */
	public abstract double area();
	/**
	 * this method is here for the sake of inheritance. 
	 * Each shape has its own way of computing the perimeter.
	 */
	public abstract double perimeter();
	
	/**
	 * This method moves the shape to the center of the page
	 * by first clearing the screen and then redrawing the shape
	 */
	public void moveToCenter() {
		clearScr();
		this.draw();
	}
	
	
}

class Circle extends Shape{
	double radius;
	public Circle(double r, int x, int y) {
		radius = r;
		centerX = x;
		centerY = y;
	}
	/**
	 * This method computes the area of a circle
	 * @return the area of this circle
	 */
	public double area() {
		return Math.PI * radius * radius;
	}
	
	/**
	 * This method computes the perimeter of this circle
	 * @return Returns the perimeter of this circle
	 */
	public double perimeter() {
		return 2 * Math.PI * radius;
		
	}
	
	/**
	 * this method draws a circle using the radius of this object, where
	 * the center of the circle is at (centerX, centerY) of the page.
	 */
	public void draw() {
		System.out.println("a circle is drawn by this method");
	}
}

class Rectangle extends Shape{
	double height;
	double width;
	public Rectangle(double h, double w, int x, int y) {
		height = h;
		width = w;
		centerX = x;
		centerY = y;
	}
	/**
	 * This method computes the area of the rectangle
	 * @return the area of this rectangle
	 */
	public double area() {
		return height * width;
	}
	
	/**
	 * This method computes the perimeter of this rectangle
	 * @return Returns the perimeter of this rectangle
	 */
	public double perimeter() {
		return 2 * (height + width) ;
		
	}

	/**
	 * this method draws a rectangle using the width and height of his object, where
	 * the center of the rectangle is at (centerX, centerY) of the page.
	 */
	public void draw() {
		System.out.println("a rectangle is drawn by this method");
		
	}
}

abstract class Employee{
	private String name; 
	public Employee(String name) {
		this.name = name;
	}
	public Employee() {
		this.name = "";
	}
	
	public abstract double getPay();
	
	public boolean samePay (Employee other) {
		return this.getPay() == other.getPay();
	}
}



class SalariedEmployee extends Employee{
	private double salary;	
	public SalariedEmployee() {
		salary = 0;
	}
	public SalariedEmployee(String name, double salary) {
		super(name);
		this.salary = salary;
	}
	public double getPay() {
		return salary;
	}
}
class HourlyEmployee extends Employee {
	private double hourlyWage; 
	private int hour; 
	public HourlyEmployee() {
		hourlyWage = 0;
		hour = 0;
	}
	public HourlyEmployee(String name, double hourlyWage, int hour) {
		super(name);
		this.hourlyWage = hourlyWage;
		this.hour = hour;
	}
	public double getPay() {
		return hour * hourlyWage;
	}
}
//#######################################################################################//

interface Grader{
	
	void gradeStudent();
	static void m1() {
		System.out.println("Interface");
	}
	default void m2() {
		System.out.println("Interface");
	}
		
}

class UniversityMember{
	String name; 
	public String toString() {
		return "A University Member";
	}
}


class Student extends UniversityMember{	
	public String toString() {
		return "A Student";
	}
}
class Contractor extends UniversityMember{	
	public String toString() {
		return "A Contractor";
	}
}
class Administrative extends UniversityMember{	
	public String toString() {
		return "An Adiministrative";
	}
}


class FacultyMember extends UniversityMember implements Grader {
	public String toString() {
		return "A Faculty Member";
	}
	public void gradeStudent() {
		System.out.println("Students are graded by their prof.");
	}
	
	@Override
	public void m2() {
		System.out.println("Faculty");
	}
}

class TeachingAssistant implements Grader{
	public String toString() {
		return "A TeachingAssistant";
	}
	public void gradeStudent() {
		System.out.println("Students are graded by their TAs");
	}
	
}
