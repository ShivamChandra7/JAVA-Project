package studentDB;

import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class addToDB {
	private boolean success;
	public boolean addStudent(String id,String fName,String lName,int age,String course,int gy) {
		try {
			Connection con=null;
			String sql="INSERT into students (ID,FirstName,LastName,Age,Course,GradeYear) VALUES(?,?,?,?,?,?)";
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb?user=me&password=me123");
			PreparedStatement ps=con.prepareStatement(sql);
			con.setAutoCommit(false);
			ps.setString(1, id);
			ps.setString(2, fName);
			ps.setString(3,lName);
			ps.setInt(4, age);
			ps.setString(5,course);
			ps.setInt(6, gy);
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
