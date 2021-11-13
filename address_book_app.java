package Address_Book;

import java.util.ArrayList;
import java.util.Scanner;

public class address_book_app {

	public static void main(String[] args) {
		
		System.out.println("Welcome to address book");
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Press 1 to add a contact");
		int decision = sc.nextInt();
		
		if(decision == 1)
		{
			addContacts added_contact = new addContacts();
		}
		
		
	}
}
