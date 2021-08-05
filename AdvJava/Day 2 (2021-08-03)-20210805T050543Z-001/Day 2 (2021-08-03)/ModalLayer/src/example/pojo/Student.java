package example.pojo;

public class Student {

	private int studentId;
	private String studentName;
	private String studentEmail;
	private String studentCourse;
	private double studentFees;

	public Student() {
		super();
	}

	public Student(int studentId, String studentName, String studentEmail, String studentCourse, double studentFees) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentCourse = studentCourse;
		this.studentFees = studentFees;
	}

	public Student(String studentName, String studentEmail, String studentCourse, double studentFees) {
		super();
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentCourse = studentCourse;
		this.studentFees = studentFees;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}

	public double getStudentFees() {
		return studentFees;
	}

	public void setStudentFees(double studentFees) {
		this.studentFees = studentFees;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentEmail=" + studentEmail
				+ ", studentCourse=" + studentCourse + ", studentFees=" + studentFees + "]";
	}

}
