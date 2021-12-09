package Address_Book.Service;

import java.util.Scanner;
import java.util.Set;

import Address_Book.entity.Contact;

public class ContactService {

	public void addContacts(Set<Contact> contactsList) { // adding contacts
		System.out.println("Adding a contact");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the firstname: ");
		String firstName = sc.next();

		System.out.println("Enter the lastname: ");
		String lastName = sc.next();

		System.out.println("Enter the Address: ");
		String Address = sc.next();

		System.out.println("Enter the City: ");
		String City = sc.next();

		System.out.println("Enter the State: ");
		String State = sc.next();

		System.out.println("Enter the email: ");
		String email = sc.next();

		System.out.println("Enter the zip: ");
		int zip = sc.nextInt();

		System.out.println("Enter the phoneNumber: ");
		long phoneNumber = sc.nextLong();

		Contact add_contact = new Contact(firstName, lastName, Address, City, State, email, zip, phoneNumber);
		// System.out.println(add_contact);
		contactsList.add(add_contact);
		System.out.println("contacts of Current Address book");
		
		for(Contact person : contactsList) {
			System.out.println(person);
		}
	}

	public void editContact(Set<Contact> contactsList) { // editing contacts
		System.out.println("Editing a contact");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the firstname of the contact you want to edit: ");
		String fName = sc.next();
		
		for(Contact person : contactsList) 
		{
			if(person.getFirstName().equals(fName)) 
			{				
				System.out.println("What do you want to edit?");
				System.out.println("Enter a number to edit value: ");
				System.out.println("1: firstName, " + "2: lastName, " + "3: Address, " + "4: City, " + "5: State, "
						+ "6: email, " + "7: zip, " + "8: phoneNumber");
				int num = sc.nextInt();
				switch (num) {
				case 1:
					System.out.println("Enter the value: ");
					String fname = sc.next();
					person.setFirstName(fname);
					break;
				case 2:
					System.out.println("Enter the value: ");
					String lname = sc.next();
					person.setLastName(lname);
					break;
				case 3:
					System.out.println("Enter the value: ");
					String Address = sc.next();
					person.setAddress(Address);
					break;
				case 4:
					System.out.println("Enter the value: ");
					String City = sc.next();
					person.setCity(City);
					break;
				case 5:
					System.out.println("Enter the value: ");
					String State = sc.next();
					person.setState(State);
					break;
				case 6:
					System.out.println("Enter the value: ");
					String email = sc.next();
					person.setEmail(email);
					break;
				case 7:
					System.out.println("Enter the value: ");
					int zip = sc.nextInt();
					person.setZip(zip);
					break;
				case 8:
					System.out.println("Enter the value: ");
					int phoneNumber = sc.nextInt();
					person.setPhoneNumber(phoneNumber);
					break;
				default:
					System.out.println("Please enter a valid number");
				}
			} 
		}
		System.out.println("the selected contact edited successfully: ");
	}

	public void deleteContact(Set<Contact> contactsList) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the firstname of the contact you want to delete: ");
		String fName = sc.next();
		
		for(Contact person : contactsList) 
		{
			if(person.getFirstName().equals(fName)) 
			{				
				contactsList.remove(person);
				System.out.println("the selected contact deleted successfully");
			} else {
				System.out.println("No contact matches the first name you gave");
			}
		}
	}

}