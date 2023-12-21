package Week10;
import java.util.ArrayList;

public class StackTester {
	public static void main(String [] arg) {
		// an integer stack
		IntegerStack  intStack = new IntegerStack();
		for (int i = 0; i < 10; i++)
			intStack.push(i);
		System.out.println(intStack.pop());
		System.out.println(intStack.top());
		System.out.println("______________________");
		
		// a string stack
		StringStack  stStack = new StringStack();
		char ch = 'A';
		for (int i = 0; i < 10; i++)
			stStack.push(new String(Character.toString((char) (i + ch))));
		System.out.println(stStack.pop());
		System.out.println(stStack.top());
		System.out.println("______________________");

		// Using the generic stack as an integer stack 
		
		int n = 10; 
		Stack<Integer>  integerStack = new Stack<Integer>();
		for (int i = 0; i < n; i++)
			integerStack.push(i);
		
		System.out.println(integerStack.pop());
		System.out.println(integerStack.top());
		System.out.println("______________________");

		// Using the generic stack as a string stack 
		Stack<String>  stringStack = new Stack<String>();
		ch = 'A';
		for (int i = 0; i < 10; i++)
			stringStack.push(new String(Character.toString((char) (i + ch))));
		System.out.println(stringStack.pop());
		System.out.println(stringStack.top());
		System.out.println("______________________");

	}

}

class IntegerStack{
	ArrayList<Integer> stack; 
	public IntegerStack() {
		stack = new ArrayList<Integer>();
	}
	/**
	 * 
	 * @param element is an integer number that is added to the stack
	 * @inv top of the stack is at index zero
	 */
	public void push (int element) {
		stack.add(0, element);
	}
	/**
	 * 
	 * @return the top of the stack
	 * @inv top of the stack is at index zero
	 */
	public int pop () {
		return stack.remove(0);
	}
	/**
	 * 
	 * @return true if the stack is empty
	 */
	public boolean isEmpty() {
		return (stack.size() == 0);
	}
	/**
	 * The top of the stack is removed, without removing the element
	 * @return the top of the stack.
	 */
	public  int top () {
		return stack.get(0);
	}
}


class StringStack{
	ArrayList<String> stack; 
	public StringStack() {
		stack = new ArrayList<String>();
	}
	/**
	 * 
	 * @param element is a string that is added to the stack
	 * @inv top of the stack is at index zero
	 */
	public void push (String element) {
		stack.add(0, element);
	}
	/**
	 * 
	 * @return returns the top of the stack
	 * @inv top of the stack is at index zero
	 */
	public String pop () {
		return stack.remove(0);
	}
	/**
	 * 
	 * @return true if the stack is empty
	 */
	public boolean isEmpty() {
		return (stack.size() == 0);
	}
	/**
	 * The top of the stack is removed, without removing the element
	 * @return the top of the stack.
	 */
	public  String top () {
		return stack.get(0);
	}
}

class Stack <E>{
	ArrayList<E> stack; 
	public Stack() {
		stack = new ArrayList<E>(); // when we create an object of the stack class, we create an array list of type E thats is basically inside the stack class
	} // stack class is a special type of array list
	/**
	 * 
	 * @param element is a genric type that is added to the stack
	 * @inv top of the stack is at index zero
	 */
	public void push (E element) {
		stack.add(0, element);
	}
	/**
	 * 
	 * @return returns the top of the stack
	 * @inv top of the stack is at index zero
	 */
	public E pop () {
		return stack.remove(0);
	}
	/**
	 * 
	 * @return true if the stack is empty
	 */
	public boolean isEmpty() {
		return (stack.size() == 0);
	}
	/**
	 * The top of the stack is removed, without removing the element
	 * @return the top of the stack.
	 */
	public  E top () {
		return stack.get(0);
	}
}
