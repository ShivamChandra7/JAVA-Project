package studentmanagementsys;

import java.util.Scanner;

public class Studentmanagement {

	public static void main(String[] args) {
		
		System.out.println("Enter the numbers of students to enroll : ");
		Scanner in = new Scanner(System.in);
		int numofstu = in.nextInt();
		Student[] students = new Student[numofstu];
		for(int i=0; i<numofstu; i++)
		{
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
		}
		for(int i=0; i<numofstu; i++)
		{
			System.out.println(students[i].tostring());
			System.out.println();
		}
	}

}
