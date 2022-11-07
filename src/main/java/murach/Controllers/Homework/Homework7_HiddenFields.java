package murach.Controllers.Homework;

import murach.Data.Homework.ProductIO;
import murach.Business.Homework.LineItemHomework;
import murach.Business.Homework.CartHomework;
import murach.Business.Homework.ProductHomework;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Homework7_HiddenFields extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        String url = "/homework/7/2/index.jsp";
        ServletContext sc = getServletContext();
        
        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "cart";  // default action
        }

        // perform action and set URL to appropriate page
        if (action.equals("shop")) {
            url = "/homework/7/2/index.jsp";    // the "index" page
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

            String path = sc.getRealPath("/homework/7/2/products.txt");
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
            url = "/homework/7/2/cart.jsp";
        }
        else if (action.equals("checkout")) {
            url = "/homework/7/2/checkout.jsp";
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