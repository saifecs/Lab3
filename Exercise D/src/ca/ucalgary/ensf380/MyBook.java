package ca.ucalgary.ensf380;
import java.util.Scanner;
/*
 * MyBook.java
 * Lab3_ExD
 * Submission Date: July 18, 2024
 * @author Saif Youssef
 * @author Mark Guerta
 */
public class MyBook {
	// Publisher adds new classics.
	public static void main(String[] args) {
		Publisher BookCo = new Publisher("BookCo", "Booking Street, England");
		Scanner scn = new Scanner(System.in);
		String credentials[] = {"Admin", "123"};
		while(true) {
			System.out.println("Enter Username and Password: ");
			System.out.println("Username: ");
			String user = scn.nextLine();
			System.out.println("Password: ");
			String password = scn.nextLine();
			if (user.equals(credentials[0]) && password.equals(credentials[1]))
				break;
		}
		while(true) {	
			System.out.println("Add a classic: add. (\"exit\" to end program)");
			String mode = scn.nextLine();
			mode.toLowerCase();
			if (mode.equals("add")) {
				addClassic(BookCo, scn);
				System.out.println("Books total: " + BookCo.getClassicsCatalog().length);
				for (int i = 0; i < BookCo.getClassicsCatalog().length; i++)
					printClassic(BookCo.getClassicsCatalog()[i]);
			}
			else if (mode.equals("exit"))
				break;
			else
				System.out.println("Invalid command: Please try again");
		}
		System.out.println("Program closing...");
		scn.close();
	}
	public static void addClassic(Publisher publisher, Scanner scn) {
		Classic newClassic = new Classic();
		Classic[] books;
		Publisher publishers[] = {publisher};
		newClassic.setBookPublisher(publishers);
		if (publisher.getClassicsCatalog() == null) {
			books = new Classic[1];
			books[0] = newClassic;
		}
		else {
			Classic[] catalog = publisher.getClassicsCatalog();
			books = new Classic[catalog.length + 1];
			for (int i = 0; i < catalog.length; i++) {
				books[i] = catalog[i];
			}
			books[catalog.length] = newClassic;
		}

		publisher.setClassicsCatalog(books);
		System.out.println("Original publishled year: (Enter a year)");
		String temp = scn.nextLine();
		newClassic.setOrigPubYear(Integer.parseInt(temp));
		Author theAuthor = new Author();
		newClassic.setTheAuthor(theAuthor);
		System.out.println("Name of author: (Enter a name)");
		temp = scn.nextLine();
		theAuthor.setName(temp);
		System.out.println("Address of author: (Enter a place)");
		temp = scn.nextLine();
		theAuthor.setAddress(temp);
		System.out.println("Age of author: (Enter a number)");
		temp = scn.nextLine();
		theAuthor.setAge(Integer.parseInt(temp));
		System.out.println("Enter ISBN: ");
		temp = scn.nextLine();
		newClassic.setIsbn(temp);
		System.out.println("Enter publication year: ");
		temp = scn.nextLine();
		newClassic.setPublicationYear(Integer.parseInt(temp));
		System.out.println("Enter number of pages: ");
		temp = scn.nextLine();
		newClassic.setPages(Integer.parseInt(temp));
	}
	public static void printClassic(Classic classic) {
		System.out.println("Book publisher: " + classic.getBookPublisher());
		System.out.println("ISBN: " + classic.getIsbn());
		System.out.println("Original publication year: " + classic.getOrigPubYear());
		System.out.println("Pages: " + classic.getPages());
		System.out.println("Publication year: " + classic.getPublicationYear());
		System.out.println("Author: " + classic.getTheAuthor());
		System.out.println();
	}
}
