package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Piyal on 11/13/2019.
 */
public class Home extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("f****** home visite");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>hello b***h</h1>");
        out.println("<h1>hello b***h</h1>");
        out.println("<h2>hello b***h</h2>");
    }
}
