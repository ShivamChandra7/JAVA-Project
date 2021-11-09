package studentManager;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.print("Enter the Numbers of students to enroll : ");
		Scanner in = new Scanner(System.in);
		int numofstu = in.nextInt();
		StudentInfo[] students = new StudentInfo[numofstu];
		for(int i=0; i<numofstu; i++)
		{
			students[i] = new StudentInfo();
			students[i].enroll();
			students[i].payTuition();
		}
		for(int i=0; i<numofstu; i++)
		{
			students[i].viewProfile();
			System.out.println();
		}
	}

}
