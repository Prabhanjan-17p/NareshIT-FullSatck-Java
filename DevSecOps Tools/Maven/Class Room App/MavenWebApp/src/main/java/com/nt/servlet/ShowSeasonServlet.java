//ShowSeasonServlet.java
package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;
import java.time.LocalDate;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/season")
public class ShowSeasonServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest  req,HttpServletResponse res)throws ServerException,IOException{
		System.out.println("ShowSeasonServlet.doGet()");
		  //get  PrintWriter
		PrintWriter pw=res.getWriter();
		//set response content type
		 res.setContentType("text/html");
		 //get  System Date
		 LocalDate  ldate=LocalDate.now();
		 //get current month of  a year
		 int month=ldate.getMonthValue();
		 if(month>=3 && month<=6)
			 pw.println("<h1 style='color:red;text-align:center'> Summer Season </h1>");
		 else if(month>=7 && month<=10)
			 pw.println("<h1 style='color:blue;text-align:center'> Rainy Season </h1>");
		 else 
			 pw.println("<h1 style='color:blue;text-align:center'> Winter Season </h1>");
		 
		  //add home  hyperlink
		 pw.println("<br>  <a href='index.jsp'> home </a>");
		 	 
        //close the stream
		   pw.close();
	}//doGet(-,-)
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("ShowSeasonServlet.doPost()");
		doGet(req, res);
	}

}
