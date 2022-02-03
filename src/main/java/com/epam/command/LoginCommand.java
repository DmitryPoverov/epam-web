package com.epam.command;

import com.epam.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginCommand implements Command {

    private final UserService userService;

    public LoginCommand(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        if (userService.login(login, password)) {
            req.getSession().setAttribute("user", "ADMIN");
            return "WEB-INF/view/main.jsp";     // We are only interested of all is deeper than WEB-INF folder.
        } else {
            req.setAttribute("errorMessage", "invalid input!");
            return "index.jsp";                 // We are only interested of all is deeper than WEB-INF folder.
        }
    }
}
