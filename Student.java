package studentmanagementsys;

import java.util.Scanner;

public class Student {
	
	private String firstname;
	private String lastname;
	private int gradeyear;
	private String courses = "";
	private int tuitionbalance;
	private static int costofcourses = 600;
	private static int id = 1000;
	private String studentID;
	
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the FIRST name of student : ");
		this.firstname = in.nextLine();
		System.out.print("Enter the LAST name of student : ");
		this.lastname = in.nextLine();
		System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter the class level of student : ");
		this.gradeyear = in.nextInt();
		setStudentID();
	}
	
	private void setStudentID()
	{
		id++;
		this.studentID = gradeyear + "" + id;
	}
	
	public void enroll()
	{
		do {
			System.out.print("Enter the course to enroll or 'Q' to quit : ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q"))
			{
				courses = courses +"\n  "+ course;
				tuitionbalance = tuitionbalance + costofcourses;
			}
			else
			{
				break;
			}
		}while(1!=0);
	}
	
	public void viewbalance()
	{
		System.out.println("Your balance is : " + tuitionbalance);
	}
	
	public void payTuition()
	{
		viewbalance();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your payment : ");
		int payment = in.nextInt();
		tuitionbalance = tuitionbalance - payment;
		System.out.println("Thank You for your payment of - " + payment);
		viewbalance();
		System.out.println();
	}
	
	public String tostring()
	{
		return "NAME : " + firstname + " " + lastname +
				"\nGradelevel : " + gradeyear +
				"\nStudent's Id : " + studentID +
				"\nCourses Enrolled : " + courses + 
				"\nBalance : " + tuitionbalance;
	}

}
