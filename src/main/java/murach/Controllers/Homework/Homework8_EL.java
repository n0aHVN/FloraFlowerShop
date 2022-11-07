package murach.Controllers.Homework;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;

import murach.Business.Homework.UserHomework;
//import murach.Data.Homework.UserDB;
import murach.Data.Homework.UserIO;

public class Homework8_EL extends HttpServlet
{    
    @Override
    protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response) 
                          throws ServletException, IOException {

        HttpSession session = request.getSession();
        
        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }

        // perform action and set URL to appropriate page
        String url = "/homework/8/index.jsp";
        if (action.equals("join")) {
            url = "/homework/8/index.jsp";    // the "join" page
        }
        else if (action.equals("add")) {                
            // get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");

            // store data in User object and save User object in database
            UserHomework user = new UserHomework(firstName, lastName, email);
            //UserDB.insert(user);
            
            // set User object in request object and set URL
            session.setAttribute("user", user);
            url = "/homework/8/thanks.jsp";   // the "thanks" page
        }
        
        // create the Date object and store it in the request
        Date currentDate = new Date();
        request.setAttribute("currentDate", currentDate);

        // create users list and store it in the session
        String path = getServletContext().getRealPath("/homework/8/EmailList.txt");
        ArrayList<UserHomework> users = UserIO.getUsers(path);
        session.setAttribute("users", users);

        // forward request and response objects to specified URL
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
    }    
    
    @Override
    protected void doGet(HttpServletRequest request, 
                          HttpServletResponse response) 
                          throws ServletException, IOException {
        doPost(request, response);
    }    
}