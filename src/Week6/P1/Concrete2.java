package P1;
import P2.Concrete1;
public class Concrete2 extends Concrete1{
	public void pri( ) { System.out.println("Concrete2.pri()"); }
	public void pac( ) { System.out.println("Concrete2.pac()"); }
	public void pro( ) { System.out.println("Concrete2.pro()"); }
	public void pub( ) { System.out.println("Concrete2.pub()"); }

	public static void main(String[] args) {
		Concrete2 c2 = new Concrete2();
		c2.show();

	}
}
