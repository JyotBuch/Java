package net.jyot.registration.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.jyot.registration.dao.StudentDao;
import net.jyot.registration.model.Student;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/register")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private StudentDao studentdao = new StudentDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/StudentRegister.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = request.getParameter("name");
		String rollno = request.getParameter("rollno");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String maths = request.getParameter("maths");
		String physics = request.getParameter("physics");
		String chemistry = request.getParameter("chemistry");
		String biology = request.getParameter("biology");
		String computer = request.getParameter("computers");
		
		Student student = new Student();
		student.setName(name);
		student.setRollno(Integer.valueOf(rollno));
		student.setEmail(email);
		student.setPassword(password);
		student.setMaths(Integer.valueOf(maths));
		student.setPhysics(Integer.valueOf(physics));
		student.setBiology(Integer.valueOf(biology));
		student.setChemistry(Integer.valueOf(chemistry));
		student.setComputer(Integer.valueOf(computer));
		
		try 
		{
			studentdao.registerStudent(student);
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/StudentDetails.jsp");
		dispatcher.forward(request, response);
	}

}
