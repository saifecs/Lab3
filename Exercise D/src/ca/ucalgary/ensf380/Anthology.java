package ca.ucalgary.ensf380;

public class Anthology {
	private Story[] stories;
	public String storyOrder() {
		return "Method storyOrder called from Anthology";
	}
	public Story[] getStories() {
		return stories;
	}
	public void setStories(Story[] stories) {
		this.stories = stories;
	}
	public String coverArt() {
		return "Method coverArt called from Anthology";
	}
}
