package com.virtualpairprogarmmers.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtualpairprogrammers.data.MenuDataService;
import com.virtualpairprogrammers.domain.MenuItem;

public class ViewMainServlet extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		MenuDataService menuDataService = new MenuDataService();
		List<MenuItem> menuItems = menuDataService.getFullMenu();
		
		out.print("<html><body><h1> Hello world </h1> <ul>");
		for (MenuItem menuItem : menuItems) {
			out.println("<li>"+menuItem+"</li>");
		}
		out.print("</ul></body></html>");
		out.close();
	}
}
