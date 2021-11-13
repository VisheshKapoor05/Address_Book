package Address_Book;

import java.util.ArrayList;
import java.util.Scanner;

public class edit_addressBook {
	
	ArrayList<Contacts> addressbook = new ArrayList<Contacts>();
	
	public void add_Contacts(){ //adding contacts

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
	
	
		Contacts contact1 = new Contacts(firstName, lastName, Address, City, State, email, zip, phoneNumber);
		System.out.println(contact1);
		contact1.getFirstName();
			
		addressbook.add(contact1);
	}
	
	
	public void edit_contact() { //editing contacts
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the firstname of the contact you want to edit: ");
		String fName = sc.next();
		
		for(Contacts edit_this_contact : addressbook)
		{
			if(fName == edit_this_contact.getFirstName()) {
				System.out.println("What do you want to edit?");
				System.out.println("Enter a number to edit value: ");
				System.out.println("1: firstName, "
								+ "2: lastName, "
								+ "3: Address, "
								+ "4: City, "
								+ "5: State, "
								+ "6: email, "
								+ "7: zip, "
								+ "8: phoneNumber");
				int num = sc.nextInt();
				switch(num) {
				case 1:
					System.out.println("Enter the value: ");
					String fname = sc.next();
					edit_this_contact.setFirstName(fname);
					break;
				case 2:
					System.out.println("Enter the value: ");
					String lname = sc.next();
					edit_this_contact.setLastName(lname);
					break;
				case 3:
					System.out.println("Enter the value: ");
					String Address = sc.next();
					edit_this_contact.setAddress(Address);
					break;
				case 4:
					System.out.println("Enter the value: ");
					String City = sc.next();
					edit_this_contact.setCity(City);
					break;
				case 5:
					System.out.println("Enter the value: ");
					String State = sc.next();
					edit_this_contact.setState(State);
					break;
				case 6:
					System.out.println("Enter the value: ");
					String email = sc.next();
					edit_this_contact.firstName = email ;
					break;
				case 7:
					System.out.println("Enter the value: ");
					int zip = sc.nextInt();
					edit_this_contact.setZip(zip);
					break;
				case 8:
					System.out.println("Enter the value: ");
					int phoneNumber = sc.nextInt();
					edit_this_contact.setPhoneNumber(phoneNumber);
					break;
				default:
					System.out.println("Please enter a valid number");	
				}
			}
		}
	}
	
}