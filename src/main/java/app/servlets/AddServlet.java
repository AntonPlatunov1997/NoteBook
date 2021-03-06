package app.servlets;

import app.Utillity.Regex;
import app.Utillity.UtilityCuntroller;
import app.entities.User;

import app.exceptions.UniqueException;
import app.exceptions.ValidationException;
import app.model.Model;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("view/add.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String login = req.getParameter("login");
        String password = req.getParameter("password");
        Model model = Model.getInstance();
        UtilityCuntroller utilityCuntroller= UtilityCuntroller.getInstance();
try {
    if ((model.checkUnique(login)) && (utilityCuntroller.checkValidData(login, Regex.LOGIN)) && (utilityCuntroller.checkValidData(password, Regex.PASSWORD))) {
        User user = new User(login, password);
        model.addUser(user);
    }
}catch (UniqueException exceptionLogin){
    req.setAttribute("exceptionLogin",exceptionLogin);
} catch (ValidationException exceptionValid) {
   req.setAttribute("exceptionValid",exceptionValid);
}


        req.setAttribute("userLogin",login);
        req.setAttribute("userPassword",password);
        doGet(req,resp);
    }
}
