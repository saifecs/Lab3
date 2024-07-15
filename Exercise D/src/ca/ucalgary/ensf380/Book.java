package ca.ucalgary.ensf380;
public abstract class Book {
	private String isbn;
	private int publicationYear;
	private int pages;
	public Book() {

	}
	public Book(String isbn, int pages) {

		this.isbn = isbn;
		this.pages = pages;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
}
