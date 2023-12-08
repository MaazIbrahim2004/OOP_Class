import java.util.*;

public class GenericsAndInheritance {

	public static void main(String[] args) {
		
		String str = "a string";
		Object obj = str;
		
		List<String> stringList = new ArrayList<String>(); 
		stringList.add("some strings");
		List<Object> objectList = new ArrayList<Object>(); 
		objectList.add(new Object()); 
		// the following two lines is not correct, as a supertype cannot be assigned to a subtype.
//		List<Object> objectList = stringList; 
//		String s = objectList.get(0); 

		//********** Examples of how arrays are covariant ***************/
		
		String name = "John";
		Object object = name;
		
		String [] names = { "John", "Jane"};
		Object [] objects = names;
		
		Number [] numbers = new Number[3];
		numbers[0] = Integer.valueOf(1);
		numbers[1] = Double.valueOf(3.14);
		byte b = 32;
		numbers[2] = Byte.valueOf(b);
		
		// the following line is not accepted. why? 
		//GenericsExample<Number> example = new GenericsExample<Integer>();
		
		GenericsExample<Number> example = new GenericsExample<Number>(numbers);
		
		// Genrics Methods Example
		
		Integer[] arr1 = { 1 , 2, 3};  //note the type is Integer, not int
		Double [] arr2 = {3.2, 4.3, 1.6, 2.2}; 
		GenericUtilities gu = new GenericUtilities();
		gu.printLast(arr1);
		gu.printLast(arr2);
		System.out.println(gu.getLast(arr1));
		System.out.println(gu.getLast(arr2));
		


		List<String> namess = new ArrayList<String>();
		List<Integer> ages = new ArrayList<Integer>();
		List<Double> heights = new ArrayList<Double>();
		
		//This code will not compile. Generics are invariants and cannot be cast
//		namess = (List<String>)SortArray (namess);
//		ages = (List<Integer>) SortArray (ages);
//		heights = (List<Double>) SortArray (heights);
		

//		Integer intObject = Integer.valueOf(3);
//		Double doubleObject = Double.valueOf(3.14);
//		Character charObject = Character.valueOf('A');
//		Boolean boolObject = Boolean.valueOf(true);
//		Number arr3[] = {intObject, doubleObject};
//		System.out.println(gu.getLast(arr3));
		
	}
	public static List<Object> SortArray(List<Object> arr) {
		List<Object> newarr = new ArrayList<Object>();
		//sorting code
		newarr = arr;
		return newarr;
	}
}

/**
 * This is an example of how a class can be parameterized.
 *
 * @param <E> There is no limitation on the type of this class.
 */
class GenericsExample<E>{
	E[] array;
	final int ARRAY_SIZE = 10;
	public GenericsExample() {
		array = (E[])  new Object[ARRAY_SIZE];
	}
	public GenericsExample(E[] input) {
		array = (E[]) new Object[input.length];
		for (int i = 0; i < input.length; i++)
			array[i] = input[i];
	}
}

class GenericUtilities {
	public <E> void printLast(E[] array){
		System.out.println("Middle elemnet = " + array[array.length - 1]);
	}
	
	public <E> E getLast(E[] array){
		return array[array.length - 1];
	}	
	//This method generates compiler errors. Find out why?
//	public <E> void sum (E[] array) {
//		E sum = 0.0; 
//		for (int i= 0; i < array.length; i++)
//			sum += array[i];
//		System.out.println("Sum = " + sum);
//	}
}

/**
 * This example shows how a class can have more than one parameter.
 *
 * @param <K> The first type parameter, which is intended to be either an Integer or a String
 * @param <V> The second type parameter, which can be anything depending on your design.
 */
class Employee <K , V>{
	K employeeId;
	V employeeRecord;
}

/**
 * This class is not parameterized, however its method is. It should be 
 * noted that the scope of the parameters are limited to the method only.
 * 
 *
 */
/**
 * This is an example to show the type of the class is not necessarily the same as the type of the method
 *
 * @param <K> The first parameter used in the class. The scope is the whole class
 * @param <V> The first parameter used in the class. The scope is the whole class
 */

class MultiType <K, V> {
	K key; 
	V vlaue;
	public <S , T> void ParameterizedMethod (K k, V v, S s, T t) {
		S var1; 
		T var2; 
		K var3; 
		V var4;
	}
}




