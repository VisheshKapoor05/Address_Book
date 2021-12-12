package Address_Book.Service;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import Address_Book.AddressBookDemo;
import Address_Book.entity.AddressBook;
import Address_Book.entity.Contact;

public class AddressBookService {
	
	public AddressBook newAddressBook;
	ArrayList<Contact> contactsList = new ArrayList<>();
	
	public void addAddressBook(String addressbookName) {
		
		newAddressBook = new AddressBook(addressbookName);
		System.out.println("Welcome to address book");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Press 1 to add a contact, 2 to edit, or 3 to delete it");
		int decision = sc.nextInt();

		ContactService contact = new ContactService();

		int end_edits = 1;
		while (end_edits != 0) {
			if (decision == 1) {
				contact.addContacts(AddressBookDemo.cityDictionary,AddressBookDemo.stateDictionary, newAddressBook.contactsSet, contactsList);
			} else if (decision == 2) {
				contact.editContact(newAddressBook.contactsSet);
			} else if (decision == 3) {
				contact.deleteContact(newAddressBook.contactsSet);
			}

			System.out.println("Press 1 to add a contact, 2 to edit, 3 to delete it, or 0 to finish the address book");
			end_edits = sc.nextInt();
			decision = end_edits;
		}
	}
	
	
	public void searchContact(String place) {
		boolean placeFound = false;
		boolean personFound = false;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the person first name you want to search");
		String firstName = sc.next();
		
		for(AddressBook obj : AddressBookDemo.addressBooksSet) 
		{
			for(Contact person : obj.contactsSet) 
			{
				if(person.getCity().equals(place) || person.getState().equals(place)) 
				{
					placeFound = true;
					if(person.getFirstName().equals(firstName)) {
						System.out.println(person);
						personFound = true;
					}
				}
			}
		}
		if(placeFound == false)
			System.out.println("No such city or state exists");
		if(personFound == false)
			System.out.println("No such person exists");
	}
	
	
	
	public void viewContacts(String place, int num) {
		
		if(num==3) { // viewing the city and person Dictionary
			for(Map.Entry<String, ArrayList<Contact>> obj : AddressBookDemo.cityDictionary.entrySet()) {
				if(obj.getKey().equals(place)) {
					System.out.println(obj.getValue());
				}
			}
		}else if(num == 4) { // viewing the state and person Dictionary
			for(Map.Entry<String, ArrayList<Contact>> obj : AddressBookDemo.stateDictionary.entrySet()) {
				if(obj.getKey().equals(place)) {
					System.out.println(obj.getValue());
				}
			}
		}
		
	}	
}
