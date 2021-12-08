package Address_Book;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.Scanner;

public class edit_addressBook {
	
	ArrayList<Contacts> addressbook = new ArrayList<Contacts>();
	public void add_Contacts(){ //adding contacts
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
	
	
		Contacts add_contact = new Contacts(firstName, lastName, Address, City, State, email, zip, phoneNumber);
		//System.out.println(add_contact);
		addressbook.add(add_contact);
		System.out.println("contacts of Current Address book");
		for(int i=0; i<addressbook.size(); i++) {
			System.out.println(addressbook.get(i));
		}
	}
	
	
	public void edit_contact() { //editing contacts
		System.out.println("Editing a contact");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the firstname of the contact you want to edit: ");
		String fName = sc.next();
		
		for(int i=0; i<addressbook.size(); i++)
		{
			String edit_this_contact = addressbook.get(i).getFirstName();
			System.out.println("firstName_of_addressbook: " +edit_this_contact);
			if(fName.equals(edit_this_contact) ) {
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
					addressbook.get(i).setFirstName(fname);
					break;
				case 2:
					System.out.println("Enter the value: ");
					String lname = sc.next();
					addressbook.get(i).setLastName(lname);
					break;
				case 3:
					System.out.println("Enter the value: ");
					String Address = sc.next();
					addressbook.get(i).setAddress(Address);
					break;
				case 4:
					System.out.println("Enter the value: ");
					String City = sc.next();
					addressbook.get(i).setCity(City);
					break;
				case 5:
					System.out.println("Enter the value: ");
					String State = sc.next();
					addressbook.get(i).setState(State);
					break;
				case 6:
					System.out.println("Enter the value: ");
					String email = sc.next();
					addressbook.get(i).firstName = email ;
					break;
				case 7:
					System.out.println("Enter the value: ");
					int zip = sc.nextInt();
					addressbook.get(i).setZip(zip);
					break;
				case 8:
					System.out.println("Enter the value: ");
					int phoneNumber = sc.nextInt();
					addressbook.get(i).setPhoneNumber(phoneNumber);
					break;
				default:
					System.out.println("Please enter a valid number");	
				}
			}
			else {
				System.out.println("No contact matches the first name you gave");
			}
		}
		System.out.println("the selected contact edited successfully: ");
	}
	
	public void delete_contact() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the firstname of the contact you want to delete: ");
		String fName = sc.next();
		//System.out.println("fName: " +fName);
		for(int i=0; i<addressbook.size(); i++)
		{
			String firstName_of_addressbook = addressbook.get(i).getFirstName();
			//System.out.println("firstName_of_addressbook: " +firstName_of_addressbook);
			if(fName.equals(firstName_of_addressbook) ) {
				addressbook.remove(i);
				System.out.println("the selected contact deleted successfully");
			}
			else {
				System.out.println("No contact matches the first name you gave");
			}
		}
	}
	
}