package Address_Book.entity;

import java.util.HashSet;
import java.util.Set;

public class AddressBook {
	
	private String addressBookName;
	public Set<Contact> contactsSet;
	
	public AddressBook(String addressbookName) {
		this.addressBookName = addressbookName;
		contactsSet = new HashSet<Contact>();
	}
	
	@Override
	public String toString() {
		return "AddressBooks [AddressBookName=" + addressBookName + ", contacts= " + contactsSet + "]";
	}
	
}
