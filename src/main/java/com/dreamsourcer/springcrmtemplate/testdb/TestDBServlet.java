package com.dreamsourcer.springcrmtemplate.testdb;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class TestDBServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String user = "user";
        String password = "password";

        String jdbcURL = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";

        String driver = "com.sql.jdbc.Driver";

        try {

            PrintWriter out = response.getWriter();

            out.println("Connecting to database " + jdbcURL);

            Class.forName(driver);

            Connection conn = DriverManager.getConnection(jdbcURL, user, password);

            out.println("Connection is successful!");

            conn.close();


        } catch (Exception exc){

            exc.printStackTrace();

            throw new ServletException(exc);

        }


    }
}
