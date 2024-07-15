package ca.ucalgary.ensf380;

public class Story {
	private Author[] theAuthors;
	public String plot() {
		return "Method called plot called from Story";
	}
	public Author[] getTheAuthors() {
		return theAuthors;
	}
	public void setTheAuthors(Author[] theAuthors) {
		this.theAuthors = theAuthors;
	}
}
