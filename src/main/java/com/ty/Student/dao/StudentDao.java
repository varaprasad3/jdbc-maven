package com.ty.Student.dao;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.ty.Student.dto.Student;
import com.ty.Student.util.ConnectionObject;
public class StudentDao {

	public int saveStudent(Student student) {
		
		Connection connection = ConnectionObject.getConnection();
		String sql = "INSERT INTO student VALUES(?,?,?)";
		
		try {
			PreparedStatement preparedstatement = connection.prepareStatement(sql);
			preparedstatement.setInt(1, student.getId());
			preparedstatement.setString(2, student.getName());
			preparedstatement.setString(3, student.getEmail());
			System.out.println("data inserted");
			return preparedstatement.executeUpdate();
			} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
		}
	public void getStudentById(int id) {
	
		String sql = "SELECT * FROM student WHERE id=?";
		Connection connection = ConnectionObject.getConnection();
		try {
			PreparedStatement preparedstatement = connection.prepareStatement(sql);
			preparedstatement.setInt(1,id);
			 ResultSet resultset = preparedstatement.executeQuery();
//			 Student student = new Student();
//			 student.setId(resultset.getInt(1));
//			 student.setName(resultset.getString(2));
//			 student.setEmail(resultset.getString(3));
			 while(resultset.next())
			 {
				 System.out.println(resultset.getInt(1));
				 System.out.println(resultset.getString(2));
				 System.out.println(resultset.getString(3));
			 }
			 
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}
	}
