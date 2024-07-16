package ca.ucalgary.ensf380;
/*
 * Contract.java
 * Lab3_ExD
 * Submission Date: July 18, 2024
 * @author Saif Youssef
 * @author Mark Guerta
 */
public class Contract {
	private String date;
	private Publisher[] publisherInfo;
	private Author[] authorInfo;
	public Contract(String date, Publisher[] publisherInfo, Author[] authorInfo) {
		this.date = date;
		this.publisherInfo = publisherInfo;
		this.authorInfo = authorInfo;
	}
	public String printContract() {
		return "Method printContract called from Contract";
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Publisher[] getPublisherInfo() {
		return publisherInfo;
	}
	public void setPublisherInfo(Publisher[] publisherInfo) {
		this.publisherInfo = publisherInfo;
	}
	public Author[] getAuthorInfo() {
		return authorInfo;
	}
	public void setAuthorInfo(Author[] authorInfo) {
		this.authorInfo = authorInfo;
	}
}
