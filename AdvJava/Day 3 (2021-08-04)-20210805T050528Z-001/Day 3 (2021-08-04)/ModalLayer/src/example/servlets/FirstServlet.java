package example.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import example.dao.StudentDao;
import example.dao.StudentDaoImpl;
import example.pojo.Student;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentDao studentDao = new StudentDaoImpl();
		
		// Insert Student
//		Student student = new Student("Mansi", "mansi@gmail.com", "Cpp", 5000);
//				
//		int studentsInserted=0;
//		try {
//			studentsInserted = studentDao.insertStudent(student);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("Students Inserted: " + studentsInserted);
		
		// Update Student
//		Student student1 = new Student();
//		student1.setStudentId(4);
//		student1.setStudentCourse("dotNet");
//		student1.setStudentFees(20000);
//		try {
//			int noOfStudentsUpdated = studentDao.updateStudent(student1);
//			System.out.print("\n No Of Student Records Updated: " + noOfStudentsUpdated);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}	
		
		// Delete Record
//		try {
//			int noofStudentsDeleted = studentDao.deleteStudent(4);
//			System.out.println("noofStudentsDeleted: " + noofStudentsDeleted);
//		} catch (SQLException e) {
//			
//			e.printStackTrace();
//		}
		

		// Get single student record
//		try {
//			Student student = studentDao.getSingleStudent(100);
//			System.out.println(student);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		// Get All students Records
		
//		try {
//			List<Student> studentsList = studentDao.getAllStudents();
//			
//			for(Student student: studentsList) {
//				System.out.println(student);
//			}
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		// Get names of students
		
		try {
			List<String>  names = studentDao.getStudentNames();
			
			for(String name: names) {
				System.out.println(name);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
			
	}
}
