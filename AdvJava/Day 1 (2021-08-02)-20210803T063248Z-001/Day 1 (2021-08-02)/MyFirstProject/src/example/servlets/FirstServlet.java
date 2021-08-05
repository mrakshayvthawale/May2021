package example.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FirstServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Request is received");
		response.setContentType("text/html");
		PrintWriter pWriter = response.getWriter();
		
		pWriter.print("<h3 style='color:blue'>Request is received</h3>");
		pWriter.print("<h3 style='color:green'>Response is sent</h3>");
		
		Connection con = null;
		Statement stmt = null;
		// Load the driver
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdactest", "root", "1234");
			stmt = con.createStatement();
			
			String sqlQuery = "INSERT INTO students (name, course) VALUES ('Vinay Pal', 'eDAC')";
			
			int noOfStudentsInserted = stmt.executeUpdate(sqlQuery);
					
			pWriter.print("\n No Of Student Records Inserted: " + noOfStudentsInserted);
			
			sqlQuery = "INSERT INTO students (name, course) VALUES ('Shikha Dutt', 'eDAC')";
			
			noOfStudentsInserted = stmt.executeUpdate(sqlQuery);
			
			pWriter.print("\n No Of Student Records Inserted: " + noOfStudentsInserted);
			
			response.sendRedirect("index.jsp?recordInserted=2");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			pWriter.close();
			
			try {
				if(stmt!=null)
					stmt.close();
					
				if(con!=null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
