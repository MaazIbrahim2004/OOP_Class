
import java.util.ArrayList;
import java.io.*;

public class ExceptionHandling {
	public static void main(String[] args) throws NegativeNumberException, NumberZeroException {
		ExceptionSamples obj1 = new ExceptionSamples();
		/* expect to see an exception thrown by Java*/
		//obj1.wrongMethod1();
		
		/* comment out the above method to see the execution of the following method. 
		 again an exception should be thrown, but this time you said which type of error should be thrown. */
		//obj1.wrongMethod2();
		
		/* comment out the above method to see the execution of the following method. 
		 again an exception should be thrown, but this time you throw an exception that is made by you. */		
		/*obj1.printMonth(-4);
		obj1.printMonth(0);
		System.out.println("_____________");
		obj1.printMonth2(-4);
		obj1.printMonth2(0);
		System.out.println("_____________");*/

		/*obj1.getMonth(-4);
		System.out.println("_____________");
		obj1.getMonth(0);
		System.out.println("_____________");*/
		
		/*obj1.printMonth2(0);
		obj1.printMonth2(-4);*/
		
		
	}


}

class ExceptionSamples{
	/**
	 * This method is designed to throw an exception
	 */
	public void wrongMethod1 () {
		ArrayList<Integer> arrayObj = new ArrayList<Integer>();
		System.out.println(arrayObj.get(0));
	}
	/**
	 * This method is designed to throw an exception
	 */
	
	public void wrongMethod2() throws IndexOutOfBoundsException{
		ArrayList<Integer> arrayObj = new ArrayList<Integer>();
		System.out.println(arrayObj.get(0));
	}
	

	/**
	 * This method prints the name of a month that associates with the integer input.
	 * This method is not complete as the focus is to show how exceptions will work.
	 * @param month is a number between 1 to 12 that represent a month of the year
	 * @throws NegativeNumberException is thrown if the input is negative
	 * @throws NumberZeroException is thrown if the input is zero
	 */
	
	public void printMonth(int month){
		try {
			if (month < 0 ) throw new NegativeNumberException("a negative number is not accepted as a month!");
			if (month == 0) throw new NumberZeroException("Zero is not accepted as a month!");
			// insert the code here			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	/**
	 * This method prints the name of a month that associates with the integer input.
	 * This method is not complete as the focus is to show how exceptions will work.
	 * @param month is a number between 1 to 12 that represent a month of the year
	 * @throws NegativeNumberException is thrown if the input is negative
	 * @throws NumberZeroException is thrown if the input is zero
	 */
	public void printMonth2 (int month){
		try {
			if (month < 0 ) throw new NegativeNumberException("a negative number is not accepted as month!");
			if (month == 0) throw new NumberZeroException("Zero is not accepted as a month!");
			// insert the code here			
		} catch (NegativeNumberException e) {
			System.out.println(e.getMessage());
		}
		catch (NumberZeroException e) {
			System.out.println(e.getMessage());			
		}
	}

	/**
	 * This method returns the name of a month that associates with the integer input.
	 * This method is not complete as the focus is to show how exceptions will work.
	 * @param month is a number between 1 to 12 that represent a month of the year
	 * @return Returns a string that associates with the integer input value
	 * @throws NegativeNumberException is thrown if the number is negative
	 */
	
	public String getMonth(int month) throws NegativeNumberException, NumberZeroException{
		if (month < 0 ) throw new NegativeNumberException("a negative number is not accepted as month!");
		if (month == 0) throw new NumberZeroException("Zero is not accepted as a month!");
		// insert the code here
		return "";
	}

}

/**
 * This is an exception class that is used when a negative number is not accepted.
 *
 */
class NegativeNumberException extends Exception{
	public NegativeNumberException (){
		super();
	}
	public NegativeNumberException(String message){
		super(message);
	}
}

/**
 * This is an exception class that is used when a number zero is not accepted.
 * @author Marzieh Ahmadzadeh
 *
 */

class NumberZeroException extends Exception{
	public NumberZeroException (){
		super();
	}
	public NumberZeroException(String message){
		super(message);
	}

}
/* the following code has two errors to show how exception handling works
 * when there is an inheritance relationship.

class A { 
	public void method1 () throws NumberZeroException{}
	public void method2 () throws NumberZeroException{}
	public void method3 () {}
	public void method4 () throws Exception{}
	public void method5 () throws NumberZeroException{}
}

class B extends A{
	public void method1 () throws NumberZeroException {}
	public void method2 (){}
	public void method3 () throws NumberZeroException{}	
	public void method4 () throws NumberZeroException{}
	public void method5 () throws Exception{}
}
  */


