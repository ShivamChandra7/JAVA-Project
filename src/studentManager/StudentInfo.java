package studentManager;

import java.util.Scanner;
import studentDB.*;

public class StudentInfo extends addToDB {
	private String firstName;
	private String lastName;
	private int gradeyear;
	private String course;
	private int age;
	private static int id=1000;
	private String studentID;
	addToDB a=new addToDB();
	public StudentInfo() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the FIRST name of the student: ");
		this.firstName=sc.nextLine();
		System.out.print("Enter the LAST name of the student: ");
		this.lastName=sc.nextLine();
		System.out.print("1-Freshmen\n2-Sophomore\n3-Junior\n4-Senior\n");
		this.gradeyear=sc.nextInt();
		setStudentID();
		System.out.print("Enter Age: ");
		this.age=sc.nextInt();
		
		
		

		
		
		
		a.addStudent(studentID, firstName, lastName, age, course, gradeyear);
		
	}
	public void enroll() {
		Enroll stu = new Enroll();
		course = stu.Enroll(course);
		//tuitionbalance = stu.tuitionfee();
	}
	
	private void setStudentID() {
		id++;
		this.studentID=gradeyear + "" +id;
	}
	
	
}
