import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("username");
        String passWord = request.getParameter("password");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        if ("master@gmail.com".equalsIgnoreCase(userName) && "tuan".equalsIgnoreCase(passWord)) {
            writer.println("<h1> Welcome " + userName + "!");
        } else
            writer.println("Wrong password!");
        writer.println("</html");
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
