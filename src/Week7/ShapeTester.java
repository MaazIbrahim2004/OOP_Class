

public class ShapeTester {

	public static void main(String[] args) {
		
		Shape aShape = new Shape(); 
		Shape firstShape = new Circle(4, 100, 100);
		Shape secondShape = new Rectangle(4, 2, 100, 100);

		firstShape.draw();
		secondShape.draw();
		
		//late binding between draw() definition and invocation
		firstShape.moveToCenter();
		secondShape.moveToCenter();
		
		// early binding between clearSCr() definition and invocation
		aShape.clearScr(); 
		firstShape.clearScr();
		secondShape.clearScr();

	}

}


