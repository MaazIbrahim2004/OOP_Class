package Week4;

import java.util.*;
/**
 * This class represent an string implemented as an arraylis of character.
 * It is used to show how string immutability is achieved.
 * @author May Haidar
 * @version 1
 */
public class MyString {
	ArrayList<Character> str;
	
	public MyString(String str) {
		this.str = new ArrayList();
		for (int i=0; i < str.length(); i++)
			this.str.add(str.charAt(i));
	}
	
/**
 * This method creates a new string by inserting the given string in the arraylist at the given index.
 * @param s is the string to insert in the current string.
 * @param position is the index at which the given string is inserted
 * @return returns a string value containing the given string
 * @exception IllegalArgumentException
 * @pre position >= 0
 * @inv </code> str </code> should remain unchanged. The value of the instance variable is 
 * immutable at the exit of the method (i.e., remains the same as it was at the entry of the method)
 */
	public String insertAt(String s, int position) {
		String result="";
		for (int i = 0; i < position; i++)
			result = result + str.get(i);
		
		result = result + s;
		
		for (int i = position; i < str.size(); i++)
			result = result + str.get(i);
		
		return result;
	}
	public String toString() {
		String result = "";
		for (int i=0; i < str.size(); i++)
			result = result + str.get(i);
		return result;
	}
}
