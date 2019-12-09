package com.face.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.RegisterBO;
import com.face.dao.RegisterDAO;
import com.face.util.ConnectionManager;

/**
 * Servlet implementation class RegisterServlet
 */
//@WebServlet("/RegisterServlet")

/**
 * @author Anoop Varghese
 * Action Servlet implementation class to  perform registeration
 * Date:14-11-2019
 * @category controller class
 *
 */

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @implSpec -> action method to register customer with database
	 */
    
    
    
    
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		String uname=request.getParameter("uname");
		String pass=request.getParameter("password");
		int MN=Integer.parseInt(request.getParameter("Mnumber"));
		String date=request.getParameter("Date");
		
		RegisterBO bo=new RegisterBO();
		
		bo.setUname(uname);
		bo.setPass(pass);
		bo.setMob(MN);
		bo.setDate(date);
		
		ConnectionManager cm=new ConnectionManager();
		
		
		try {
			RegisterDAO.save(cm.getConnection(),bo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.sendRedirect(request.getContextPath()+"/login.jsp");
		
	}

}
