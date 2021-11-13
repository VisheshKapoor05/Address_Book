package Address_Book;

import java.util.ArrayList;

public class address_book_app {

	public static void main(String[] args) {
		
		System.out.println("Welcome to address book");
		String firstName = "Vishesh";
		String lastName = null;
		String Address = null;
		String City = null;
		String State = null;
		String email = null;
		int zip = 0;
		long phoneNumber = 0;
		Contacts contact1 = new Contacts(firstName, lastName, Address, City, State, email, zip, phoneNumber);
		System.out.println(contact1);
		
		ArrayList<Contacts> addressbook = new ArrayList<Contacts>();
		addressbook.add(contact1);
		
		//System.out.println(addressbook.get(0));
	}
}
