

public class ComparableExample {

	public static void main(String[] args) {
		Point p1 = new Point(2,2);
		Point p2 = new Point(3, 4);
		Point p3 = new Point(3,4);
		System.out.println(p1.compareTo(p2));
		System.out.println(p2.compareTo(p1));
		System.out.println(p3.compareTo(p2));

	}

}

/**
 * This class represent a point by its x and y
 *
 */
class Point implements Comparable <Object>{
	int x; 
	int y;
	/**
	 * This is the default constructor for Point
	 */
	public Point() {
		this.x = 0; 
		this.y = 0;
	}
	/**
	 * This constructor creates a point using the passed coordinates.
	 * @param x represent the x-coordinate of the point
	 * @param y represents the y-coordinate of the point
	 */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/**
	 * The points are compared based on their distance to origin.
	 */
	@Override
	public int compareTo(Object p) {
		Point point = (Point) p;
		double firstDist = Math.sqrt(this.x * this.x + this.y + this.y);
		double secondDist = Math.sqrt(point.x * point.x + point.y * point.y);
		return (int) (firstDist - secondDist);
	}
}
