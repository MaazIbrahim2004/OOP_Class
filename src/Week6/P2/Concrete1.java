package P2;
import P1.Base;
public class Concrete1 extends Base {
	
	public void pri( ) { System.out.println("Concrete1.pri()"); }
	public void pac( ) { System.out.println("Concrete1.pac()"); }
	public void pro( ) { System.out.println("Concrete1.pro()"); }
	public void pub( ) { System.out.println("Concrete1.pub()"); }

	public static void main(String[] args) {
		Concrete1 c1 = new Concrete1();
		c1.show();

	}
}
