package Week5;
import java.util.Date;
/**
 * This class represents a bank account
 * @author Marzieh Ahmadzadeh
 *
 */

public class Account {
	char accountType;
	int accountNumber;
	double balance;
	Date dateOpened;
	/**
	 * This the default constructor
	 */
	
	public Account() { // default constructor
		accountType = ' ';
		accountNumber = 0;
		balance = 0;
		dateOpened = new Date();
	}
	/**
	 * This is the overloaded constructor for this class
	 * @param accType represents the type of the account
	 * @param accNumber represent the account number
	 * @param balance represent the balance that is available in this account
	 * @param openedDate represents the data that this account has opened.
	 */
	public Account (char accType, int accNumber, double balance, Date openedDate) {
		this.accountType = accType;
		this.accountNumber = accNumber;
		this.balance = balance;
		this.dateOpened = openedDate; // purposeful aliasing. Because Date what if I want to change the date of opening? Then all i have to do is to change the dateOpened.
	}
	/**
	 * This is the copy constructor
	 * @param acc is an object of Account that is used to create this object.
	 */
	public Account (Account acc) { // copy constructor. We can use this constructor to create a deep copy of an object of Account.
		this (acc.accountType, acc.accountNumber, acc.balance, acc.dateOpened);
	}
}

