package studentDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Retreive {
	protected void viewAllR() {
		try {
			Connection con=null;
			ResultSet rs=null;
			String query="SELECT * FROM students";
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb?user=me&password=me123");
			Statement stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			System.out.println("ID\tName\t\tDOB\t\tCourse\t\tGradeYr\t\tTuitionbal(Rs.)\n");
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+" "+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t\t"+rs.getInt(6)+"\t\t"+rs.getInt(7));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	protected void viewID(String ID) {
		try {
			Connection con=null;
			ResultSet rs=null;
			String query="SELECT * FROM students WHERE ID="+ID;
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb?user=me&password=me123");
			Statement stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			if(rs.next()) {
				System.out.print("ID: "+rs.getString(1)+"\nName: "+rs.getString(2)+" "+rs.getString(3)+"\nAge: "+rs.getString(4)+"\nCourse: "+rs.getString(5)+"\nGrade Year: "+rs.getInt(6)+"\nTuition Balance: "+rs.getInt(7)+"Rs.");
			}
			else {
				System.out.print("Student with such ID does'nt exist.");
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	protected void viewByCourse(String s) {
		try {
			Connection con=null;
			ResultSet rs=null;
			String query="SELECT * FROM students WHERE Course='"+s+"'";
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb?user=me&password=me123");
			Statement stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			System.out.println("ID\tName\t\tDOB\t\tCourse\t\tGradeYr\t\tTuitionbal(Rs.)\n");
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+" "+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t\t"+rs.getInt(6)+"\t\t"+rs.getInt(7));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
}
