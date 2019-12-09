package com.face.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.RegisterBO;
import com.face.bo.loginBO;
import com.face.dao.LoginDAO;
import com.face.util.ConnectionManager;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		boolean status=false;
		
		loginBO bo=new loginBO();
		
		bo.setUname(uname);
		bo.setPass(pass);
		
		ConnectionManager cm=new ConnectionManager();
		
		try {
			 status=LoginDAO.acess(cm.getConnection(),bo);
			if(status==true) {
				
				List <String>newList  = new ArrayList<String>();
				newList.add(bo.getUname());
				newList.add(bo.getPass());
				newList.add(String.valueOf(bo.getMN()));
				newList.add(bo.getDate());
				   request.setAttribute("data", newList);
                   RequestDispatcher dispatcher = request.getRequestDispatcher("welcome.jsp");
                   
                   if(dispatcher !=null)
                   {
                	   dispatcher.forward(request,response);
                   }
				
			}
			
			else
				
				response.sendRedirect(request.getContextPath()+"/login.jsp");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
