package Week3;


public class CarTester {
	public static void main(String [] args) {
		Car myCar = new Car();
		myCar.setMake("Toyota");
		char [] pno = {'L','M','N','1','2','3'};
		myCar.setPlate(pno);
		pno[0]='X';
		System.out.println(myCar.getPlate());	
	}
}
