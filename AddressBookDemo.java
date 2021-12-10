package Address_Book;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import Address_Book.Service.AddressBookService;
import Address_Book.entity.AddressBook;
import Address_Book.entity.Contact;

public class AddressBookDemo {
	
	public static Set<AddressBook> addressBooksSet = new HashSet<AddressBook>();
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to address book");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Press 1 to add an address book");
		int addressbookNum = sc.nextInt();
		
		AddressBookService addressBookServiceObj = new AddressBookService();
		
		while(addressbookNum != 0) {
			
			if(addressbookNum==1) 
			{
				System.out.println("Adding a new address book");
				System.out.println("Enter the name of the address book: ");
				String addressbookName = sc.next();
				 
				addressBookServiceObj.addAddressBook(addressbookName);
				addressBooksSet.add(addressBookServiceObj.newAddressBook);
			}
			else if(addressbookNum==2) {
				System.out.println("Enter the city or state you want to the person to be searched in");
				String place = sc.next();
				
				addressBookServiceObj.searchContact(place);
			}
			else
				System.out.println("Please enter 1 or 2");
			
			System.out.println();
			System.out.println("Press 1 again if you want to add another address book");
			System.out.println("or Press 2 to search any person across all the addressBooks");
			System.out.println("or Press 0 to display the AddressBooks and end");
			addressbookNum = sc.nextInt();
			
			if(addressbookNum == 0) {
				System.out.println("list of Address book:");
				for(AddressBook addressBookObj : addressBooksSet) {
					System.out.println(addressBookObj);
				}
			}
		}			
	}
}
