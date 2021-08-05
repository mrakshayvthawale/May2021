package example.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import example.pojo.Student;

public class StudentDaoImpl implements StudentDao {
	private final static String DRIVER = "com.mysql.cj.jdbc.Driver";
	private final static String DB_URL = "jdbc:mysql://localhost:3306/school";
	private final static String DB_USER = "root";
	private final static String DB_PWD = "1234";
	
	private final static String INSERT_STUDENT = "INSERT INTO students (student_name, "
			+ "student_email, student_course, student_fees) VALUES (?, ?, ?, ?)";
	
	private final static String UPDATE_STUDENT = "UPDATE students SET student_course=?, "
			+ "student_fees=? WHERE student_id = ?";
	
	private final static String DELETE_STUDENT = "DELETE FROM students WHERE student_id = ?";
	private static final String GET_SINGLE_STUDENT = "SELECT * FROM students WHERE student_id = ?";
	private static final String GET_ALL_STUDENTS = "SELECT * FROM students";
	
	private static final String GET_STUDENT_NAMES = "  {call getStudentsNames(?)}  ";
	
	private Connection getConnection() {
		Connection con = null;
		
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(DB_URL, DB_USER, DB_PWD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
	@Override
	public int insertStudent(Student student) throws SQLException {
		
		// Insert code starts
		int noOfStudentsInserted = 0;
		
		// Load the driver
		try(Connection con = getConnection(); 
				PreparedStatement pStmt = con.prepareStatement(INSERT_STUDENT)
				) {
			
			pStmt.setString(1, student.getStudentName());
			pStmt.setString(2, student.getStudentEmail());
			pStmt.setString(3, student.getStudentCourse());
			pStmt.setDouble(4, student.getStudentFees());

			noOfStudentsInserted = pStmt.executeUpdate();
					
			System.out.print("\n No Of Student Records Inserted: " + noOfStudentsInserted);
			
		} 
	
		return noOfStudentsInserted;
	}

	@Override
	public int updateStudent(Student student) throws SQLException {
		
		// Insert code starts
		int noOfStudentsUpdated = 0;
		
		try(Connection con = getConnection(); 
				PreparedStatement pStmt = con.prepareStatement(UPDATE_STUDENT)
				) {
			
			pStmt.setString(1, student.getStudentCourse());
			pStmt.setDouble(2, student.getStudentFees());
			pStmt.setInt(3, student.getStudentId());

			noOfStudentsUpdated = pStmt.executeUpdate();
			
		} 
	
		return noOfStudentsUpdated;
	}

	@Override
	public int deleteStudent(int studentId) throws SQLException {

		try(Connection con = getConnection();
				PreparedStatement pStmt = con.prepareStatement(DELETE_STUDENT)){

			pStmt.setInt(1, studentId);
			return pStmt.executeUpdate();
		}
	}

	@Override
	public Student getSingleStudent(int studentId) throws SQLException {
		Student student = null;
		
		try(Connection con = getConnection();
				PreparedStatement pStmt = con.prepareStatement(GET_SINGLE_STUDENT)){
			pStmt.setInt(1, studentId);
			
			ResultSet rSet = pStmt.executeQuery();
			if(rSet.next()) {
				
				int id = rSet.getInt("student_id");
				String name = rSet.getString("student_name");
				String course = rSet.getString("student_course");
				String email = rSet.getString("student_email");
				double fees = rSet.getDouble("student_fees");
				
				student = new Student(id, name, email, course, fees);
			}
			
		}
	
		return student;
	}

	@Override
	public List<Student> getAllStudents() throws SQLException {
		List<Student> studentsList = new ArrayList<Student>();
		
		try(Connection con = getConnection();
				Statement stmt = con.createStatement();){
			
			ResultSet rSet = stmt.executeQuery(GET_ALL_STUDENTS);
			
			while(rSet.next()) {
				int id = rSet.getInt(1);
				String name = rSet.getString(2);
				String email = rSet.getString(3);
				String course = rSet.getString(4);
				double fees = rSet.getDouble(5);
				
				studentsList.add(new Student(id, name, course, email, fees));
			}
			
		}
		
		return studentsList;
	}

	@Override
	public List<String> getStudentNames() throws SQLException {
		List<String> studentNames = new ArrayList<String>();
		try(Connection con = getConnection();
				CallableStatement callStmt = con.prepareCall(GET_STUDENT_NAMES)){
			callStmt.setDouble(1, 12000);
			
			boolean hasRecord = callStmt.execute();
			if(hasRecord) {
				ResultSet rSet = callStmt.getResultSet();
				while(rSet.next()) {
					studentNames.add(rSet.getString("student_name"));					
				}
			}
		}
		
		
		return studentNames;
	}

}
