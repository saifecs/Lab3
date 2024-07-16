package ca.ucalgary.ensf380;
/*
 * Person.java
 * Lab3_ExC
 * Submission Date: July 18, 2024
 * @author Saif Youssef
 * @author Mark Guerta
 */
public abstract class Person {
	protected String name;
	protected String phoneNumber;
	protected String emailAddress;
	protected Address address;
	private static int lastPersonalNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public static int getLastPersonalNumber() {
		return lastPersonalNumber;
	}
	public static void setLastPersonalNumber(int lastPersonalNumber) {
		Person.lastPersonalNumber = lastPersonalNumber;
	}
	protected static String nextPersonalNumber(short type) {
		return String.valueOf(type);
	}
	public boolean hasValidAddress() {
		if (this.address == null)
			return false;
		return true;
	}
}
