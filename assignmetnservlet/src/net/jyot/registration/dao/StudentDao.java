package net.jyot.registration.dao;

import java.sql.*;

import net.jyot.registration.model.Student;

public class StudentDao {
	
	public int registerStudent(Student student) throws ClassNotFoundException{
		
		int result=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaassn", "root", "jyot123");
			System.out.println("Connected");
			PreparedStatement ps = conn.prepareStatement("insert into student values (?,?,?,?,?,?,?,?,?);");
			ps.setString(1, student.getName());
			ps.setInt(2, student.getRollno());
			ps.setString(3, student.getEmail());
			ps.setString(4, student.getPassword());
			ps.setInt(5, student.getMaths());
			ps.setInt(6, student.getPhysics());
			ps.setInt(7, student.getChemistry());
			ps.setInt(8, student.getBiology());
			ps.setInt(9, student.getComputer());
			
			
			result = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return 0;		
	}

}
