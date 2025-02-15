package ca.ucalgary.ensf380;
/*
 * University.java
 * Lab3_ExC
 * Submission Date: July 18, 2024
 * @author Saif Youssef
 * @author Mark Guerta
 */
import java.util.Scanner;
public class University {
	// Scenario adding final grades for three students
	public static void main(String[] args) {
		Professor professor1 = new Professor("987654321", 100000);
		Student student1 = new Student("123123123", professor1, 0);
		Student student2 = new Student("456456456", professor1, 0);
		Student student3 = new Student("789789789", professor1, 0);
		student1.setName("Karl");
		student2.setName("Bran");
		student3.setName("Fernando");
		Student ENSF380[] = {student1, student2, student3};
		for (int i = 0; i < ENSF380.length; i++) {
			PrintStudent(ENSF380[i]);
		}
		Student waitlist[] = {null, null, null}; 
		Scanner scn = new Scanner(System.in);

		while(true) {
			System.out.println("Choose a mode: grading or manage");
			String mode = scn.nextLine();
			if (mode.equals("exit")) {
				System.out.println("Exiting program...");
				break;
			}
			else if (mode.equals("grading"))
				Grading(ENSF380, scn);
			else if (mode.equals("manage"))
				manageClass(ENSF380, waitlist, scn, professor1);
			else {
				System.out.println("Enter a valid command: ");
			}
		}
		scn.close();
	}

	public static void PrintStudent(Student student) {
		System.out.println("Person Object for Student: ");
		System.out.println("Name: " + student.getName());
		System.out.println("Phone number: " + student.getPhoneNumber());
		System.out.println("Email address: " + student.getEmailAddress());
		System.out.println("Address: " + student.getAddress());
		System.out.println("Last personal number: " + Student.getLastPersonalNumber() + "\n");
		System.out.println("Student Object: ");
		Address studentAddress = student.getAddress();
		if (studentAddress != null) {
			System.out.println(studentAddress.getStreet());
			System.out.println(studentAddress.getCity());
			System.out.println(studentAddress.getState());
			System.out.println(studentAddress.getPostalCode());
			System.out.println(studentAddress.getCountry());
		}
		else
			System.out.println("Address does not exist");
		System.out.println("Student number: " + student.getStudentNumber());
		System.out.println("Supervisor: " + student.getSupervisor());
		System.out.println("Average mark: " + student.getAverageMark() + "\n");
	}
	public static void PrintProfessor(Professor professor) {
		System.out.println("Person Object for Professor: ");
		System.out.println("Name: " + professor.getName());
		System.out.println("Phone number: " + professor.getPhoneNumber());
		System.out.println("Email address: " + professor.getEmailAddress());
		System.out.println("Address: " + professor.getAddress());
		System.out.println("Last personal number: " + Professor.getLastPersonalNumber() + "\n");
		Address professorAddress = professor.getAddress();
		if (professorAddress != null) {
			System.out.println(professorAddress.getStreet());
			System.out.println(professorAddress.getCity());
			System.out.println(professorAddress.getState());
			System.out.println(professorAddress.getPostalCode());
			System.out.println(professorAddress.getCountry());
		}
		else
			System.out.println("Address does not exist");
		System.out.println("Professor object:");
		System.out.println("Teacher number: " + professor.getTeacherNumber());
		System.out.println("Teacher number: " + professor.getSalary() + "\n");
	}
	public static void Grading(Student[] course, Scanner scn) {
		
		while(true) {
			for (int i = 0; i < course.length; i++) 
				System.out.println((i + 1) + ": "+ course[i].getName() + " - " + course[i].getStudentNumber());
			System.out.println("\n" + "Choose a student based on position or type exit to end the program: ");
			String mode = scn.nextLine();
			Student student;
			mode.toLowerCase();
			mode.replace("\n", "");
				if (mode.equals("exit"))
					return;
				else if (mode.equals("1") || mode.equals("2") || mode.equals("3")) {
					student = course[Integer.parseInt(mode) - 1];
					if (student == null) {
						System.out.println("Student slot is empty");
						continue;
					}
				}
				else {
					System.out.println("Enter a valid command: ");
					continue;
			}
				System.out.println("Enter a grade: ");
				student.setAverageMark(scn.nextDouble());
				PrintStudent(student);
				scn.nextLine();
			}
		}
	
	public static void manageClass(Student[] course, Student[] waitlist, Scanner scn, Professor professor) {
		while(true) {
				Student student = null;
				while(true) {
					System.out.println("Add from waitlist (add), remove a student from the class (remove) or exit to main menu (exit): ");
					String mode = scn.nextLine();
					mode = mode.toLowerCase();
					int count = 0;
					if (mode.equals("add")) {
						
						for (int i = 0; i < waitlist.length; i++) {
							if (waitlist[i] == null) {
								count++;
								continue;
							}
							
							System.out.println((i + 1) + ": "+ waitlist[i].getName() + " - " + waitlist[i].getStudentNumber());
						}
						if (count == 3)	{
							System.out.println("No students in waitlist");
							continue;
						}
						System.out.println("Choose a student based on position or type exit to return to previous menu: ");
						mode = scn.nextLine();
						mode.toLowerCase();
						mode.replace("\n", "");
							if (mode.equals("1") || mode.equals("2") || mode.equals("3")) {
								if (waitlist[Integer.parseInt(mode) - 1] == null) {
									System.out.println("Empty slot");
									continue;
								}
									student = waitlist[Integer.parseInt(mode) - 1];
									waitlist[Integer.parseInt(mode) - 1] = null;
									student.setSupervisor(professor);
							}
							
							else if (mode.equals("exit"))
								break;
							else {
								System.out.println("Enter a valid command: ");
								continue;
						}
						count = 0;
						for (int i = 0; i < course.length; i++) {
							if (course[i] != null) {
								count++;
								continue;
							}
							else {
								course[i] = student;
								break;
							}
						}
						if (count == 3) {
							System.out.println("Class full");
							continue;
						}
					}
					else if (mode.equals("remove")) {
						count = 0;
						for (int i = 0; i < course.length; i++) {
							if (course[i] == null) {
								count++;
								continue;
							}
							System.out.println((i + 1) + ": "+ course[i].getName() + " - " + course[i].getStudentNumber());
						}
						System.out.println("Choose a student based on position or type exit to return to previous menu: ");
						mode = scn.nextLine();
							if (mode.equals("1") || mode.equals("2") || mode.equals("3")) {
								student = course[Integer.parseInt(mode) - 1];
								course[Integer.parseInt(mode) - 1] = null;
								if (student == null) {
									System.out.println("Student slot is empty");
									continue;
								}
								count = 0;
								for (int i = 0; i < waitlist.length; i++) {
									if (waitlist[i] == null) {
										waitlist[i] = student;
										break;
									}
								}
								
								student.setSupervisor(null);
							}
							else if (mode.equals("exit"))
								break;
							else {
								System.out.println("Enter a valid command: ");
								continue;
						}
					}
					else if (mode.equals("exit")) {
						break;
					}
					else {
						System.out.println("Enter a valid command: ");
						continue;
					}
				}
				if (student != null)
					PrintStudent(student);
			}
		}

	
}
