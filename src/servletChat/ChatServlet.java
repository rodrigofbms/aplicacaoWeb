package servletChat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/ChatServlet")

public class ChatServlet extends HttpServlet {
ArrayList <String> mensagens = new ArrayList<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String mensagem = request.getParameter("mensagem");
String login = (String) request.getSession().getAttribute("login");
String completo = "";

    mensagens.add(login + ": " + mensagem);

    for (String i : mensagens) {
        completo += i + "\n";
    }
    request.getServletContext().setAttribute("mensagem", completo);
    request.getServletContext().setAttribute("login", login);
    RequestDispatcher rd = request.getRequestDispatcher("chat.jsp");
    rd.forward(request, response);
    }

}
