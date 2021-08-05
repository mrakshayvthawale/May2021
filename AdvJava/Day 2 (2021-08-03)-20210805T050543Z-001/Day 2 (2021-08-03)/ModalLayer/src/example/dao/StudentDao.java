package example.dao;

import java.sql.SQLException;
import java.util.List;

import example.pojo.Student;

public interface StudentDao {
	
	int insertStudent(Student student) throws SQLException;
	int updateStudent(Student student) throws SQLException;
	int deleteStudent(int studentId) throws SQLException;
	Student getSingleStudent(int studentId) throws SQLException;
	List<Student> getAllStudents() throws SQLException;
}
