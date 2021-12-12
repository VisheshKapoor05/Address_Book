package Address_Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import Address_Book.Service.AddressBookService;
import Address_Book.entity.AddressBook;
import Address_Book.entity.Contact;

public class AddressBookDemo {
	
	public static Set<AddressBook> addressBooksSet = new HashSet<AddressBook>();
	
	public static HashMap<String, ArrayList<Contact>> cityDictionary = new HashMap<String, ArrayList<Contact>>();
	public static HashMap<String, ArrayList<Contact>> stateDictionary = new HashMap<String, ArrayList<Contact>>();
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to address book");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Press 1 to add an address book");
		int num = sc.nextInt();
		
		AddressBookService addressBookServiceObj = new AddressBookService();
		
		while(num != 0) {
			
			if(num==1) 
			{
				System.out.println("Adding a new address book");
				System.out.println("Enter the name of the address book: ");
				String addressbookName = sc.next();
				 
				addressBookServiceObj.addAddressBook(addressbookName);
				addressBooksSet.add(addressBookServiceObj.newAddressBook);
			}
			else if(num==2) {
				System.out.println("Enter the city or state you want to the person to be searched in");
				String place = sc.next();
				
				addressBookServiceObj.searchContact(place);
			}
			else if(num == 3 || num == 4) {
				if(num == 3) {
					System.out.println("Enter the city you want to view persons of");
					String city = sc.next();
					addressBookServiceObj.viewContacts(city, num);
					
				}
				else{
					System.out.println("Enter the state you want to view persons of");
					String state = sc.next();
					addressBookServiceObj.viewContacts(state, num);
				}
			}
			else
				System.out.println("Please enter 1 or 2");
			
			System.out.println();
			System.out.println("Press 1 again if you want to add another address book");
			System.out.println("or Press 2 to search any person across all the addressBooks");
			System.out.println("or Press 3 to to view persons by city, 4 to view by state");
			System.out.println("or Press 0 to display the AddressBooks and end");
			num = sc.nextInt();
			
			if(num == 0) {
				System.out.println("list of Address book:");
				for(AddressBook addressBookObj : addressBooksSet) {
					System.out.println(addressBookObj);
				}
			}
		}			
	}

}
