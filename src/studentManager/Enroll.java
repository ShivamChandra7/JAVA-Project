package studentManager;

import java.util.Scanner;

public class Enroll {
	private static int a = 1400, b = 1200, c= 1000, d = 800;
	String Course;
	public String Enroll()
	{
		System.out.println("\nHERE, WE OFFER COURSES IN :- \n 1- COMPUTER SCIENCE AND ARTIFICIAL INTELLIGENCE (Type 1) \n 2- COMPUTER SCIENCE (Type 2) \n 3- INFORMATION TECNOLOGY (Type 3)\n");
		System.out.print("Enter your choice :- ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); 
		
		if(n == 1) {
			Course = "COMPUTER SCIENCE AND ARTIFICIAL INTELLIGENCE";
		}
		else if(n==2) {
			Course = "COMPUTER SCIENCE";
		}
		else if(n==3) {
			Course = "INFORMATION TECHNOLOGY";
		}
		return Course;
		
	}
	private int cost;
	public int tuitionfee(int gradeyear) {
		
		if(gradeyear==1) {
			cost = a;
		}
		else if(gradeyear==2) {
			cost = b;
		}
		else if(gradeyear==3) {
			cost = c;
		}
		else if(gradeyear==4) {
			cost = d;
		}
		return cost;
	}
}