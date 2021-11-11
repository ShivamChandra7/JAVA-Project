package studentDB;

import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class addToDB {
	private boolean success;
	public boolean addStudent(String id,String fName,String lName,String age,String course,int gy,int tut) {
		try {
			Connection con=null;
			String sql="INSERT into students (ID,FirstName,LastName,DOB,Course,GradeYear,FeeDue) VALUES(?,?,?,?,?,?,?)";
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb?user=me&password=me123");
			PreparedStatement ps=con.prepareStatement(sql);
			con.setAutoCommit(false);
			ps.setString(1, id);
			ps.setString(2, fName);
			ps.setString(3,lName);
			ps.setString(4, age);
			ps.setString(5,course);
			ps.setInt(6, gy);
			ps.setInt(7, tut);
			success=ps.execute();
			con.commit();
			ps.close();
			con.close();	
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return success;
	}
}
