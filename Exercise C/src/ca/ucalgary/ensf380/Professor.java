package ca.ucalgary.ensf380;
/*
 * Professor.java
 * Lab3_ExC
 * Submission Date: July 18, 2024
 * @author Saif Youssef
 * @author Mark Guerta
 */
public class Professor extends Person {
	private String teacherNumber;
	private double salary;
	public String getTeacherNumber() {
		return teacherNumber;
	}
	public void setTeacherNumber(String teacherNumber) {
		this.teacherNumber = teacherNumber;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Professor(String teacherNumber, double salary) {
		this.teacherNumber = teacherNumber;
		this.salary = salary;
	}

}
