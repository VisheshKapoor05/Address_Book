package Address_Book;

import java.util.ArrayList;
import java.util.Scanner;

public class addContacts {
	
	addContacts(){

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the firstname: ");
		String firstName = sc.next();
	
		System.out.println("Enter the lastname: ");
		String lastName = sc.next();
	
		System.out.println("Enter the Address: ");
		String Address = sc.next();
	
		System.out.println("Enter the City: ");
		String City = sc.next();
	
		System.out.println("Enter the State: ");
		String State = sc.next();
	
		System.out.println("Enter the email: ");
		String email = sc.next();
	
		System.out.println("Enter the zip: ");
		int zip = sc.nextInt();
	
		System.out.println("Enter the phoneNumber: ");
		long phoneNumber = sc.nextLong();
	
	
		Contacts contact1 = new Contacts(firstName, lastName, Address, City, State, email, zip, phoneNumber);
		System.out.println(contact1);
	
		ArrayList<Contacts> addressbook = new ArrayList<Contacts>();
		addressbook.add(contact1);
	}
}