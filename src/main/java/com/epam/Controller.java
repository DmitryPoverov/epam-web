package com.epam;

import com.epam.command.Command;
import com.epam.command.CommandFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet("/login")
public class Controller extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        process(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        process(req, resp);
    }

    private void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String commandString = req.getParameter("command");
        System.out.println(commandString);
        req.getSession().setAttribute("testField", "TestTestTest");
        CommandFactory commandFactory = new CommandFactory();
        Command command = commandFactory.createCommand(commandString);
        String page = command.execute(req, resp);
        req.getRequestDispatcher(page).forward(req, resp);
    }
}