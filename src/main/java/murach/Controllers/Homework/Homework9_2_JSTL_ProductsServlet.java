package murach.Controllers.Homework;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.ArrayList;

import murach.Data.Homework.ProductIO;
import murach.Business.Homework.ProductHomework;

public class Homework9_2_JSTL_ProductsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        String path = getServletContext().getRealPath("/homework9/2/products.txt");
        ArrayList<ProductHomework> products = ProductIO.getProducts(path);
        session.setAttribute("products", products);

        String url = "/homework9/2/index.jsp";
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
}