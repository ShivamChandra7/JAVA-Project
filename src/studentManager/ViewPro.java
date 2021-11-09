package studentManager;

import studentDB.*;
import java.util.Scanner;


public class ViewPro extends Retreive {
	Scanner sc=new Scanner(System.in);
	public void tostring(String firstname,String lastname,int age,int gradeyear,String courses,int tuitionbalance,int id,String studentID )
	{
		System.out.println("NAME : " + firstname + " " + lastname +
				"\nGradelevel : " + gradeyear +
				"\nAge of Student : " + age +
				"\nStudent's Id : " + studentID +
				"\nEnrolled in : " + courses + 
				"\nBalance : $" + tuitionbalance);
	}
	void viewByID() {
		System.out.print("Enter ID: ");
		String Id=sc.next();
		viewID(Id);
	}
}
