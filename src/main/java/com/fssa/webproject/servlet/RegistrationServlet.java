package com.fssa.webproject.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		PrintWriter out = response.getWriter();
		if (userName == null || "".equals(userName) || userName.length() < 3) {
			out.println("<h2>Error: Invalid Username</h2>");
		} else if (email == null || "".equals(email) || !email.contains("@")) {
			out.println("<h2>Error: Invalid Email</h2>");
		} else if (password == null || "".equals(password) || password.length() < 6) {
			out.println("<h2>Error: Invalid Password</h2>");
		} else {
			out.println("<h1>Email and password are valid</h1>");
		}
	}

}
