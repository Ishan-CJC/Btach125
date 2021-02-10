package com.cjc.main.Dao;

import java.util.List;

import com.cjc.main.model.Student;

public interface StudentDaoI {

    public int saveData(Student s);
	
	public List<Student> loginCheck(String uname,String pass);
	
	public List<Student> deleteRecord(int id);
	
	public Student editRecord(int id);
	
	public List<Student> updateRecord(Student s);
}
