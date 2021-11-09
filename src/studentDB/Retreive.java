package studentDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Retreive {
	public void viewAll() {
		try {
			Connection con=null;
			ResultSet rs=null;
			String query="SELECT * FROM students";
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb?user=me&password=me123");
			Statement stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			System.out.println("ID\tName\t\tAge\tCourse\tGradeYr\tTuitionbal\n");
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+" "+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5)+"\t"+rs.getInt(6)+"\t"+rs.getInt(7));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void viewID(String ID) {
		try {
			Connection con=null;
			ResultSet rs=null;
			String query="SELECT * FROM students WHERE ID="+ID;
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb?user=me&password=me123");
			Statement stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			if(rs.next()) {
				System.out.print("ID: "+rs.getString(1)+"\nName: "+rs.getString(2)+" "+rs.getString(3)+"\nAge: "+rs.getInt(4)+"\nCourse: "+rs.getString(5)+"\nGrade Year: "+rs.getInt(6)+"\nTuition Balance: "+rs.getInt(7));
			}
			else {
				System.out.print("Student with such ID does'nt exist.");
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
