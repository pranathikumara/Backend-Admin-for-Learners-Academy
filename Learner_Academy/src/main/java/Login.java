import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.mysql.cj.Session;
@WebServlet("/login")
public class Login extends HttpServlet {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
protected void doGet(HttpServletRequest request, HttpServletResponse 
response) throws ServletException, IOException {
}
protected void doPost(HttpServletRequest request, HttpServletResponse 
response) throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter out = response.getWriter();
String name = request.getParameter("username");
String pwd = request.getParameter("password");
if(name.equals("learnersacademy@gmail.com")&& pwd.equals("learnersacademy")) {
HttpSession session = request.getSession();
session.setAttribute("username", name);
response.sendRedirect("Welcome.jsp");
}
else {
out.println("<div align= center><font color =red size= 10>INVALID USERNAME OR PASSWORD</font></div>");
RequestDispatcher rd= request.getRequestDispatcher("login.html");
rd.include(request, response);
}
 }
}