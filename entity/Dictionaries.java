package Address_Book.entity;

import java.util.ArrayList;

public class Dictionaries {
	
	public String city;
	public ArrayList<Contact> cityContactsList;
	
	public Dictionaries(String city) {
		this.city = city;
		cityContactsList = new ArrayList<Contact>();
		
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public ArrayList<Contact> getCityDictionary() {
		return cityContactsList;
	}
	public void setCityDictionary(ArrayList<Contact> cityDictionary) {
		this.cityContactsList = cityDictionary;
	}
	
	

}
