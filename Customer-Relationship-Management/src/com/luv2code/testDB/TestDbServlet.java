package com.luv2code.testDB;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String user = "springstudent";
		String pass = "springstudent";
		String jdbc_Url = "jdbc:mysql://localhost:3306/web_customer_tracker?allowPublicKeyRetrieval=true&useSSL=false";
		String driver = "com.mysql.jdbc.Driver";
		
		
		try {

			PrintWriter out = response.getWriter();
			
			Class.forName(driver);

			Connection myConn = DriverManager.getConnection(jdbc_Url, user, pass);

			out.println("Connecting to database: " + jdbc_Url);

			out.println("Connection Successfull "+myConn.isClosed());

		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}

	}

}
