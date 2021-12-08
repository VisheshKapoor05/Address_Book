package Address_Book;

import java.util.ArrayList;
import java.util.Scanner;

import Address_Book.Service.AddressBookService;
import Address_Book.entity.AddressBook;

public class AddressBookDemo {
	
	static ArrayList<AddressBook> addressBooksList = new ArrayList<AddressBook>();
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to address book");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Press 1 to add an address book");
		int addressbookNum = sc.nextInt();
		
		int end_addressbooks = 1 ;
		while(end_addressbooks != 0) {
			if(addressbookNum==1) 
			{
				System.out.println("Adding a new address book");
				System.out.println("Enter the name of the address book: ");
				String addressbookName = sc.next();
				
				AddressBookService addressBookServiceObj = new AddressBookService(); 
				addressBookServiceObj.addAddressBook(addressbookName);
				addressBooksList.add(addressBookServiceObj.newAddressBook);
			}
			else
				System.out.println("Please enter 1 to add an address book");
			
			System.out.println("list of Address book");
			for(int i=0; i<addressBooksList.size(); i++) {
				System.out.println(addressBooksList.get(i));
			}
			
			System.out.println("Press 1 again if you want to add another address book");
			end_addressbooks = sc.nextInt();
		
		}
		
	}
}
