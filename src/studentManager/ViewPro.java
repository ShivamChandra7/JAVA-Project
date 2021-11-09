package studentManager;

public class ViewPro {
	public void tostring(String firstname,String lastname,int age,int gradeyear,String courses,int tuitionbalance,int id,String studentID )
	{
		System.out.println("NAME : " + firstname + " " + lastname +
				"\nGradelevel : " + gradeyear +
				"\nAge of Student : " + age +
				"\nStudent's Id : " + studentID +
				"\nEnrolled in : " + courses + 
				"\nBalance : $" + tuitionbalance);
	}
}
