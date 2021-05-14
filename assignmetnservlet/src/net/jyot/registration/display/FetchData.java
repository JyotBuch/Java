package net.jyot.registration.display;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FetchData")
public class FetchData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			response.setContentType("text/html");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaassn", "root", "jyot123");
			PreparedStatement ps = conn.prepareStatement("select name,rollno,email,maths,physics,chemistry,biology,computers,sum(maths+physics+chemistry+biology+computers) from student group by name;");
			ResultSet rs = ps.executeQuery();
			
			PrintWriter out= response.getWriter();
			
			out.println("<html><body><table border='1'><tr><td>Name</td><td>Roll-no</td><td>E-mail</td><td>Maths</td><td>Physics</td><td>Chemistry</td><td>Biology</td><td>Computers</td><td>Total</td></tr>");
			while(rs.next())
			{
				out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td><td>"+rs.getString(7)+"</td><td>"+rs.getString(8)+"</td><td>"+rs.getString(9)+"</td></tr>");
			}
			
			out.println("</table></body></html>");
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			}
	}
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
	}

}
