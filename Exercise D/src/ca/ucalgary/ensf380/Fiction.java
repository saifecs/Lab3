package ca.ucalgary.ensf380;
/*
 * Fiction.java
 * Lab3_ExD
 * Submission Date: July 18, 2024
 * @author Saif Youssef
 * @author Mark Guerta
 */
public abstract class Fiction extends Paperback{
	public abstract String coverArt();;
	public String genre() {
		return "Method genre called from Fiction";
	};
}
