

public class Shape {
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
	public void draw() {
		
	}
	
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
	 * this method draws a rectangle using the width and height of his object, where
	 * the center of the rectangle is at (centerX, centerY) of the page.
	 */
	public void draw() {
		System.out.println("a rectangle is drawn by this method");
		
	}
}

