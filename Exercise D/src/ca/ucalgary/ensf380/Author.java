package ca.ucalgary.ensf380;
/*
 * Author.java
 * Lab3_ExD
 * Submission Date: July 18, 2024
 * @author Saif Youssef
 * @author Mark Guerta
 */
public class Author {
	private String name = "Unknown";
	private String address;
	private int age;
	public Author(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}
	public Author() {
		
	}
	public String write() {
		return "Method write called from Author";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
