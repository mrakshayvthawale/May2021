package example.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

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
       
    public FirstServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Student student = new Student("Shikha", "shikha@yahoo.com", "dotNet", 12000);
		
		StudentDao studentDao = new StudentDaoImpl();
		int studentsInserted=0;
		try {
			studentsInserted = studentDao.insertStudent(student);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("Students Inserted: " + studentsInserted);
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
