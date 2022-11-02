import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("Street: " + request.getParameter("street"));
        System.out.println("City: " + request.getParameter("city"));
        System.out.println("State: " + request.getParameter("state"));
        System.out.println("Zip: " + request.getParameter("zip"));
        System.out.println("Size: " + request.getParameter("size"));
        System.out.println("Crust: " + request.getParameter("crust"));
        System.out.println("Sauce: " + request.getParameter("sauce"));
        System.out.println("Toppings: " + Arrays.toString(request.getParameterValues("toppings")));

        request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);
    }
}
