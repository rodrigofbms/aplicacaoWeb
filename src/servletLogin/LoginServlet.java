package servletLogin;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet ("/LoginServlet")

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String login = request.getParameter("login");
String senha = request.getParameter("senha");
List<String> usuarios = new ArrayList<>();
usuarios = (List) request.getSession().getAttribute("usuarios");
if( login.equals(senha)&& login != null && senha != null) {
    usuarios.add(login);
request.getSession().setAttribute("login", login);
    request.getSession().setAttribute("senha", senha);
    RequestDispatcher rd = request.getRequestDispatcher("chat.jsp");
    rd.forward(request, response);
}else {
    RequestDispatcher rd2 = request.getRequestDispatcher("loginAgain.jsp");
    rd2.forward(request, response);
}
}


}
