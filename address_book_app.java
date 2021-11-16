package Address_Book;

import java.util.ArrayList;
import java.util.Scanner;

public class address_book_app {
	
	static ArrayList<AddressBookManagement> list_of_addressbooks = new ArrayList<AddressBookManagement>();
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
				
				AddressBookManagement new_addressBook = new AddressBookManagement(addressbookName); 
				list_of_addressbooks.add(new_addressBook);
				new_addressBook.NewAddressBook();
			}
			else
				System.out.println("Please enter 1 to add an address book");
			
			System.out.println("list of Address book");
			for(int i=0; i<list_of_addressbooks.size(); i++) {
				System.out.println(list_of_addressbooks.get(i));
			}
			
			System.out.println("Press 1 again if you want to add another address book");
			end_addressbooks = sc.nextInt();
		
		}
		
	}
}
