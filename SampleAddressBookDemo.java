package Address_Book;

import java.util.ArrayList;
import java.util.Scanner;

import Address_Book.entity.Contact;
import Address_Book.exception.AddressBookException;

public class SampleAddressBookDemo {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> newContactList = new ArrayList<String>();
		
		System.out.println("Adding a contact");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1 to add contact");
		int num = sc.nextInt();
		
		
		try {
			while(num==1){
				System.out.println("Enter the firstname: ");
				String firstName = sc.next();
				
				for(int i=0;i<newContactList.size();i++) {
					if(newContactList.get(i).equals(firstName)) {
						throw new AddressBookException();
					}
					else
						newContactList.add(firstName);
					
					for(int j=0;j<newContactList.size();j++) {
						System.out.println(newContactList.get(i));
					}
					
				}
				System.out.println("Enter 1 again to add a contact");
				num = sc.nextInt();
			}
		}catch(AddressBookException obj) {
			obj.printStackTrace();
		}
	}
	
}
