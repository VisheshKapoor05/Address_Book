package Address_Book;

import java.util.Scanner;

public class address_book_app {

	public static void main(String[] args) {
		
		System.out.println("Welcome to address book");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Press 1 to add a contact, 2 to edit, or 3 to delete it");
		int decision = sc.nextInt();
		
		edit_addressBook contact = new edit_addressBook();
		if(decision == 1)
		{
			contact.add_Contacts();
		}
		else if(decision == 2)
		{
			contact.edit_contact();
		}
		else if(decision == 3)
		{
			contact.delete_contact();
		}
		
	}
}
