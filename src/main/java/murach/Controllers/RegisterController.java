package murach.Controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import murach.Business.user;
import murach.Data.AccountDB;

public class RegisterController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		getServletContext()
		.getRequestDispatcher("/register.jsp")
		.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = req.getSession();  
		
        String user_id = req.getParameter("user_id");
        String password= req.getParameter("password");
        
        AccountDB loginDB = new AccountDB();
        user loginUser= loginDB.userExist(user_id, password);
        if (loginUser !=null) {
        	getServletContext()
            .getRequestDispatcher("/index.jsp")
            .forward(req, resp);
        	session.setAttribute("loginUser", loginUser);
        }
        else {
        	req.setAttribute("errorLogin", true);
        	getServletContext()
            .getRequestDispatcher("/login.jsp")
            .forward(req, resp);
		}
	}
	

}
