package murach.Controllers;

import java.io.IOException;
import java.net.ResponseCache;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import murach.Data.LoginDB;

public class LoginController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "/login.jsp";
        getServletContext()
        .getRequestDispatcher(url)
        .forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = req.getSession();  
        String username = req.getParameter("username");
        String password= req.getParameter("password");
        LoginDB loginDB = new LoginDB();
        boolean is_exist = loginDB.userExist(username, password);
        System.out.print(is_exist);
        if (is_exist) {
        	getServletContext()
            .getRequestDispatcher("/index.jsp")
            .forward(req, resp);
        	session.setAttribute("username", username);
        }
        else {
        	session.setAttribute("errorMessage", "Sai TK va MK!!!");
        	getServletContext()
            .getRequestDispatcher("/login.jsp")
            .forward(req, resp);
		}
	}
}
