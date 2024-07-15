package ca.ucalgary.ensf380;
import java.util.Scanner;

public class MyBook {
	// Publisher adds two new classics to the catalog, Cinderella and Snow White.
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
			System.out.println("Add a classic: add.");
			String mode = scn.nextLine();
			mode.toLowerCase();
			if (mode.equals("add")) {
				addClassic(BookCo, scn);
				System.out.println("Books total: " + BookCo.getClassicsCatalog().length);
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
		if (publisher.getClassicsCatalog() == null)
			books = new Classic[1];
		else {
			Classic[] catalog = publisher.getClassicsCatalog();
			books = new Classic[catalog.length + 1];
			System.arraycopy(catalog, 0, books, 0, catalog.length + 1);
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
}
