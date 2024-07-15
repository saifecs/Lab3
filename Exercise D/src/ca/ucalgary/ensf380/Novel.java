package ca.ucalgary.ensf380;

public class Novel {
	private Author[] theAuthor;
	private Series mySeries;
	public String theme() {
		return "Method theme called from Novel";
	}
	public Author[] getTheAuthor() {
		return theAuthor;
	}
	public void setTheAuthor(Author[] theAuthor) {
		this.theAuthor = theAuthor;
	}
	public Series getMySeries() {
		return mySeries;
	}
	public void setMySeries(Series mySeries) {
		this.mySeries = mySeries;
	}
	public String coverArt() {
		return "Method coverArt called from Novel";
	}
}
