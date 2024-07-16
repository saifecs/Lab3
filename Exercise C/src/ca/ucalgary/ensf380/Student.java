package ca.ucalgary.ensf380;
/*
 * Student.java
 * Lab3_ExC
 * Submission Date: July 18, 2024
 * @author Saif Youssef
 * @author Mark Guerta
 */
public class Student extends Person {
	private String studentNumber;
	Professor supervisor;
	private double averageMark;
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public Professor getSupervisor() {
		return supervisor;
	}
	public void setSupervisor(Professor professor) {
		this.supervisor = professor;
	}
	public double getAverageMark() {
		return averageMark;
	}
	public void setAverageMark(double averageMark) {
		this.averageMark = averageMark;
	}
	public Student(String studentNumber, Professor supervisor, double averageMark) {
		this.studentNumber = studentNumber;
		this.supervisor = supervisor;
		this.averageMark = averageMark;
	}
	public boolean isEligibleToEnroll() {
		if (this.averageMark >= 60)
			return true;
		return false;
	}
}
