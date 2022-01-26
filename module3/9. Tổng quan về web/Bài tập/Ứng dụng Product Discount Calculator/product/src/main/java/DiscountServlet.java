import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", value = "/discount")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Float price = Float.parseFloat(request.getParameter("price"));
        Float discount = Float.parseFloat(request.getParameter("discount"));
        String description=request.getParameter("description");
        double discount_amount = price * discount * 0.01;
        double discount_price = price - discount_amount;
        request.setAttribute("description",description);
        request.getRequestDispatcher("result.jsp").forward(request,response);
//        PrintWriter writer = response.getWriter();
//        writer.print("<html>");
//        writer.print("<h1>discount amount: "+ discount_amount+"</h1>");
//        writer.print("<h1>discount price: "+discount_price+"</h1>");
//        writer.print("<h1> description:"+ description+"</h1>");
//        writer.print("</html>");


    }
}
