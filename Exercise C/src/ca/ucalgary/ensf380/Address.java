package ca.ucalgary.ensf380;

public class Address {
	private String street;
	private String city;
	private String state;
	private String postalcode;
	private String country;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostalCode() {
		return postalcode;
	}
	public void setPostalCode(String postalcode) {
		this.postalcode = postalcode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Address(String street, String city, String state, String postalcode, String country) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.postalcode = postalcode;
		this.country = country;
	}
}
