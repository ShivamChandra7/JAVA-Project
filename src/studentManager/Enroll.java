package studentManager;

import java.util.Scanner;

public class Enroll {
	private int cntofcourses = 0;
	private static int costofcourses = 600;
	public String Enroll(String courses)
	{
		do {
			System.out.print("Enter the course to enroll or 'Q' to quit : ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q"))
			{
				courses = courses +"\n  "+ course;
				cntofcourses+=1;
			}
			else
			{
				break;
			}
		}while(1!=0);
		return courses;
	}
}
