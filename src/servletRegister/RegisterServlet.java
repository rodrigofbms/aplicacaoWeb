package servletRegister;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String login = request.getParameter("login");
        String password = request.getParameter("password");
String confirmPassword = request.getParameter("confirmPassword");
if(password.equals(confirmPassword) && login.equals(password)){
    RequestDispatcher rd = request.getRequestDispatcher("chat.jsp");
    rd.forward(request, response);
}else{
    RequestDispatcher rd2 = request.getRequestDispatcher("erroRegister.jsp");
    rd2.forward(request, response);
}

    }

}
