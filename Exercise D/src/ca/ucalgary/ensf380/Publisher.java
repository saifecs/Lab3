package ca.ucalgary.ensf380;
/*
 * Publisher.java
 * Lab3_ExD
 * Submission Date: July 18, 2024
 * @author Saif Youssef
 * @author Mark Guerta
 */
public class Publisher {
	private String name;
	private String address;
	private Classic[] classicsCatalog;
	public Publisher(String name, String address) {
		this.name = name;
		this.address = address;
	}
	public String printLetterhead() {
		return "Method printLetterhead called from Publisher";
	};
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
	public Classic[] getClassicsCatalog() {
		return classicsCatalog;
	}
	public void setClassicsCatalog(Classic[] classicsCatalog) {
		this.classicsCatalog = classicsCatalog;
	}
}
