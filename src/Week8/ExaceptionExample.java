

public class ExaceptionExample {
	
	public void methodA(int x) {
		try {
			if (x == 3) throw new ExceptionA_3();
			if (x == 2) throw new ExceptionA_2();
			if (x == 1) throw new ExceptionA_1();
			if (x == 0) throw new ExceptionA();
			if (x < 0 ) throw new Exception();
		}
		catch (ExceptionA_1 e) {
			System.out.println("Exception A_1, X=1");
		}
		catch (ExceptionA_3 e) {
			System.out.println("Exception A_2, X=3");
		}
		catch (ExceptionA_2 e) {
			System.out.println("Exception A_2, X=2");
		}
		catch (ExceptionA e) {
			System.out.println("Exception A, X=0");
		}
		catch (Exception e) {
			System.out.println("Exception");
		}
	}
}


class ExceptionA extends Exception{
	public ExceptionA (){
		super();
	}
	public ExceptionA(String message){
		super(message);
	}

}

class ExceptionA_1 extends Exception{
	public ExceptionA_1 (){
		super();
	}
	public ExceptionA_1(String message){
		super(message);
	}

}
class ExceptionA_2 extends Exception{
	public ExceptionA_2 (){
		super();
	}
	public ExceptionA_2(String message){
		super(message);
	}

}
class ExceptionA_3 extends Exception{
	public ExceptionA_3 (){
		super();
	}
	public ExceptionA_3(String message){
		super(message);
	}

}