import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", urlPatterns = "/display-discount")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float price= Float.parseFloat(request.getParameter("price"));
        float discount_percent = Float.parseFloat(request.getParameter("discount_percent"));

        float discount_amount = (float) (price * discount_percent*0.01);
        float discount_price = (float) (price -discount_amount);

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>discount_amount: " + discount_amount + "</h1>");
        writer.println("<h1>discount_price: " + discount_price+ "</h1>");
        writer.println("</html>");
    }
}
