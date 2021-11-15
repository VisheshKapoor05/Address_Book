package Address_Book;

import java.util.ArrayList;
import java.util.Scanner;

public class address_book_app {
	
	static ArrayList<Contacts> addressbook = new ArrayList<Contacts>();
	public static void main(String[] args) {
		
		System.out.println("Welcome to address book");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Press 1 to add a contact, 2 to edit, or 3 to delete it");
		int decision = sc.nextInt();
		
		edit_addressBook contact = new edit_addressBook();
		
		int end_edits = 1 ;
		while(end_edits != 0) {
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
			
			System.out.println("Press 1 to add a contact, 2 to edit, 3 to delete it, or 0 to finish the address book");
			end_edits = sc.nextInt();
			decision = end_edits;
		}
		System.out.println("contacts of Current Address book");
		for(int i=0; i<addressbook.size(); i++) {
			System.out.println(addressbook.get(i));
		}
	}
}
