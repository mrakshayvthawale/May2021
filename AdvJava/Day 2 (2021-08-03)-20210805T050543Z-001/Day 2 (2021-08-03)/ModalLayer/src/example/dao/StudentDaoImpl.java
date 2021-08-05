package example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import example.pojo.Student;

public class StudentDaoImpl implements StudentDao {

	private final String INSERT_STUDENT = "INSERT INTO students (student_name, student_email, student_course, student_fees) VALUES (?, ?, ?, ?)";
	
	public StudentDaoImpl() {
		
	}
	
	@Override
	public int insertStudent(Student student) throws SQLException {
		
		// Insert code starts
		int noOfStudentsInserted = 0;
		
		Connection con = null;
		PreparedStatement pStmt = null;
		// Load the driver
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "1234");

			pStmt = con.prepareStatement(INSERT_STUDENT);

			pStmt.setString(1, student.getStudentName());
			pStmt.setString(2, student.getStudentEmail());
			pStmt.setString(3, student.getStudentCourse());
			pStmt.setDouble(4, student.getStudentFees());

			noOfStudentsInserted = pStmt.executeUpdate();
					
			System.out.print("\n No Of Student Records Inserted: " + noOfStudentsInserted);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(pStmt!=null)
					pStmt.close();
					
				if(con!=null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	
		return noOfStudentsInserted;
	}

	@Override
	public int updateStudent(Student student) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteStudent(int studentId) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Student getSingleStudent(int studentId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAllStudents() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
