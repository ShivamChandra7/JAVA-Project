package studentManager;

import studentDB.*;
import java.util.Scanner;


public class ViewPro extends Retreive {
	Scanner sc=new Scanner(System.in);
	void viewAll() {
		viewAllR();
	}
	public void tostring(String firstname,String lastname,String age,int gradeyear,String courses,int tuitionbalance,int id,String studentID )
	{
		System.out.println("NAME : " + firstname + " " + lastname +
				"\nGradelevel : " + gradeyear +
				"\nDOB of Student : " + age +
				"\nStudent's Id : " + studentID +
				"\nEnrolled in : " + courses + 
				"\nBalance : $" + tuitionbalance);
	}
	void viewByID() {
		System.out.print("Enter ID: ");
		String Id=sc.next();
		viewID(Id);
	}
	void viewByBranch() {
		System.out.println("----C O U R S E----\n1->WebDev\n2->Android\n3->CyberSecurity");
		int choice =sc.nextInt();
		switch(choice) {
		case 1:
			viewByCourse("WebDev");
			break;
		case 2:
			viewByCourse("Android");
			break;
		case 3:
			viewByCourse("CyberSc");
			break;
		default:;
		}
	}
}
