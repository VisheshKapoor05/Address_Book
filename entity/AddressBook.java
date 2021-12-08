package Address_Book.entity;

import java.util.ArrayList;

public class AddressBook {
	
	private String addressBookName;
	public ArrayList<Contact> contactsList;
	
	public AddressBook(String addressbookName) {
		this.addressBookName = addressbookName;
		contactsList = new ArrayList<Contact>();
	}
	
	@Override
	public String toString() {
		return "AddressBooks [AddressBookName=" + addressBookName + ", contacts= " + contactsList + "]";
	}
	

}
