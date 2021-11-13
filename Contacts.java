package Address_Book;

public class Contacts {
	String firstName;
	private String lastName;
	private String Address;
	private String City;
	private String State;
	private String email;
	private int zip;
	private long phoneNumber;
	
	
	public Contacts(String firstName, String lastName, String address, String city, String state, String email, int zip,
					long phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.Address = address;
		this.City = city;
		this.State = state;
		this.email = email;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Contacts [firstName=" + firstName + ", lastName=" + lastName + ", Address=" + Address + ", City=" + City
				+ ", State=" + State + ", email=" + email + ", zip=" + zip + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	

}
