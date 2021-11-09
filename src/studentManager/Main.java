package studentManager;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("--------Student Management System--------\nEnter Username: ");
		String user=in.next();
		System.out.print("Enter Password: ");
		String pass=in.next();
		AdminLogin a =new AdminLogin();
		
		if(a.Login(user, pass)) {
			int choice =0;
			while(choice!=3) {
				System.out.println("\n------M E N U------\n1->Add Students\n2->View\n3->EXIT");
				choice =in.nextInt();
				switch(choice) {
				case 1:
					System.out.print("Enter the Numbers of students to enroll : ");
					int numofstu = in.nextInt();
					StudentInfo[] students = new StudentInfo[numofstu];
					for(int i=0; i<numofstu; i++)
					{
						students[i] = new StudentInfo();
						students[i].enroll();
						students[i].payTuition();
					}
					System.out.println("Following students are registered successfully: ");
					for(int i=0; i<numofstu; i++)
					{
						students[i].viewProfile();
						System.out.println();
					}
					break;
				case 2:
					//view
					ViewPro v=new ViewPro();
					System.out.println("1->View all students\n2->View student by ID\n3->Back");
					int ch=in.nextInt();
					switch(ch) {
					case 1:
						v.viewAll();
						break;
					case 2:
						v.viewByID();
						break;
					default: ;
					}
				default:
				}
				
			}
			System.out.println("Bye :) ");			
		}
		else {
			System.out.println("Invalid Password!!!\nExiting...");
		}
		
		
	}
}
