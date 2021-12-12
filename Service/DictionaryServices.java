package Address_Book.Service;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import Address_Book.AddressBookDemo;
import Address_Book.entity.AddressBook;
import Address_Book.entity.Contact;

public class DictionaryServices {
	
	
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
	
	
	public int countContacts(String place, int num) {
		
		int count =0;
		
		if(num==5) { // counting the persons in a specific city
			for(Map.Entry<String, ArrayList<Contact>> obj : AddressBookDemo.cityDictionary.entrySet()) {
				if(obj.getKey().equals(place)) {
					for(Contact person : obj.getValue()) 
					{
						count++;
					}
				}
			}
		}else if(num == 6) { // counting the persons in a specific city
			for(Map.Entry<String, ArrayList<Contact>> obj : AddressBookDemo.stateDictionary.entrySet()) {
				if(obj.getKey().equals(place)) {
					for(Contact person : obj.getValue()) 
					{
						count++;
					}
				}
			}
		}
		
		return count;
	}

}
