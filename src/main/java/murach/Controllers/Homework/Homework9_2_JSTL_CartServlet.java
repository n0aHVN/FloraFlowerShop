package murach.Controllers.Homework;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import murach.Data.Homework.*; //productIO and userIO
import murach.Business.Homework.*; //carthomework, lineitemhomework, producthomework, userhomework

public class Homework9_2_JSTL_CartServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        ServletContext sc = getServletContext();
        
        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "cart";  // default action
        }

        // perform action and set URL to appropriate page
        String url = "/homework/9/2/index.jsp";
        if (action.equals("shop")) {            
            url = "/homework/9/2/index.jsp";    // the "index" page
        } 
        else if (action.equals("cart")) {
            String productCode = request.getParameter("productCode");
            String quantityString = request.getParameter("quantity");

            HttpSession session = request.getSession();
            CartHomework cart = (CartHomework) session.getAttribute("cart");
            if (cart == null) {
                cart = new CartHomework();
            }

            //if the user enters a negative or invalid quantity,
            //the quantity is automatically reset to 1.
            int quantity;
            try {
                quantity = Integer.parseInt(quantityString);
                if (quantity < 0) {
                    quantity = 1;
                }
            } catch (NumberFormatException nfe) {
                quantity = 1;
            }

            String path = sc.getRealPath("/homework/9/2/products.txt");
            ProductHomework product = ProductIO.getProduct(productCode, path);

            LineItemHomework lineItem = new LineItemHomework();
            lineItem.setProduct(product);
            lineItem.setQuantity(quantity);
            if (quantity > 0) {
                cart.addItem(lineItem);
            } else if (quantity == 0) {
                cart.removeItem(lineItem);
            }

            session.setAttribute("cart", cart);
            url = "/homework/9/2/cart.jsp";
        }
        else if (action.equals("checkout")) {
            url = "/homework/9/2/checkout.jsp";
        }

        sc.getRequestDispatcher(url)
                .forward(request, response);
    }
    
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
    
}