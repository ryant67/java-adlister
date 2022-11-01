import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CountServlet", urlPatterns = "/count")
public class CountServlet extends HttpServlet {

    private int count;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        count += 1;
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if(request.getParameter("reset") != null && request.getParameter("reset").equals("true")) {
            count = 0;
            response.sendRedirect("/count");
        }

        out.println("Count: " + count);

    }
}
