package com.ty.Controller;
import com.ty.Student.dao.*;
import com.ty.Student.dto.*;
public class TestStudent {
 public static void main(String[] args) 
 {
	StudentDao sd = new StudentDao();
	sd.saveStudent(new Student(9,"divya", "divya@gmail.com"));
	sd.getStudentById(9);
}
}
