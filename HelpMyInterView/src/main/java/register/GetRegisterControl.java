package register;
import register.RegisterDao;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetRegisterControl
 */
public class GetRegisterControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		User obj = new User();
		obj.setEmail(request.getParameter("email"));
		obj.setInstitute(request.getParameter("inst"));
		obj.setUserid(request.getParameter("userid"));
		obj.setPass(request.getParameter("pas"));
		
		int a = RegisterDao.register(obj);
		if(a>0){
			RequestDispatcher rd = request.getRequestDispatcher("success.jsp"); 
			rd.forward(request, response);
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("error.jsp"); 
			rd.forward(request, response);
		}
	}
}
