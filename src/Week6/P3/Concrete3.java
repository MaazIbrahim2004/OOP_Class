package P3;

import P1.Concrete2;

public class Concrete3 extends Concrete2{
	public void pri( ) { System.out.println("Concrete3.pri()"); }
	public void pac( ) { System.out.println("Concrete3.pac()"); }
	public void pro( ) { System.out.println("Concrete3.pro()"); }
	public void pub( ) { System.out.println("Concrete3.pub()"); }

	public static void main(String[] args) {
		Concrete3 c3 = new Concrete3();
		c3.show();

	}
}
