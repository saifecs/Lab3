package ca.ucalgary.ensf380;
/*
 * Nonfiction.java
 * Lab3_ExD
 * Submission Date: July 18, 2024
 * @author Saif Youssef
 * @author Mark Guerta
 */
public class Nonfiction extends Paperback{
	private Category deweyClassification;
	public String topic() {
		return "Method topic called from Nonfiction";
	}
	public Category getDeweyClassification() {
		return deweyClassification;
	}
	public void setDeweyClassification(Category deweyClassification) {
		this.deweyClassification = deweyClassification;
	}
	
}
