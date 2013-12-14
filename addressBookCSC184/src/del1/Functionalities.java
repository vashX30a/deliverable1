package del1;
import java.io.*;
import java.util.*;

public class Functionalities {
	private String fName, lName, address, city, state, pNumber, zipCode;
	private Contact myContact = new Contact();
	private Scanner cin = new Scanner(System.in);
	
	public Functionalities(){
		
	}
	
	public void addContact(){
		System.out.println("Enter first name of contact: ");
		fName = cin.nextLine();

		System.out.println("Enter last name of contact: ");
		lName = cin.nextLine();
		
		System.out.println("Enter address of contact: ");
		address = cin.nextLine();

		System.out.println("Enter city of contact: ");
		city = cin.nextLine();

		System.out.println("Enter state of contact: ");
		state = cin.nextLine();

		System.out.println("Enter phone number of contact: ");
		pNumber = cin.nextLine();
		
		System.out.println("Enter zipcode of contact: ");
		zipCode = cin.nextLine();
		
		myContact.setAll(fName, lName, address, city, state, pNumber, zipCode);
	}
}
