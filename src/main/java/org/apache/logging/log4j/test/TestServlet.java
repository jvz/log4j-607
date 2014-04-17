package org.apache.logging.log4j.test;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@WebServlet("/test607")
public class TestServlet extends HttpServlet {

    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
        throws javax.servlet.ServletException, java.io.IOException
    {
        final PrintWriter out = res.getWriter();
        final String message = "Hello World!";
        LOGGER.error(message);
        out.println(message);
    }
}
