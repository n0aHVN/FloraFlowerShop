package murach.Controllers;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

import murach.Business.*;
import murach.Data.*;

public class Home extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
    	
        
        HttpSession session = request.getSession();

        String url = "/index.jsp";
        
        ArrayList<Category> categories = CategoryDB.selectCategories();    
        request.setAttribute("categories", categories);
        
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
