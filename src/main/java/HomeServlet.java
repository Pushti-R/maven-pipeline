import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HomeServlet extends HttpServlet {

    public String html = "<html><head><title>Home page</title>" +
            "<style>" +
            "li {" +
            "background-color:dodgerblue;" +
            "color:white;" +
            "padding: 16px;" +
            "margin: 8px;" +
            "}" +
            "</style></head><body>" +
            "<h1>Welcome to best website in world</h1>" +
            "<ul>" +
            "<li> Projects</li>" +
            "<li> Contact</li>" +
            "<li> About </li>" +
            "<li>Explore</li>" +
            "</ul></body></html>";

    public void init() throws ServletException {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println(html);
    }

    public void destroy() {

    }
}