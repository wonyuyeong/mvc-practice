package com.ict.homecontroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.homemodel.Command2;
import com.ict.homemodel.IndexCommand2;
import com.ict.homemodel.LoginCommand2;
import com.ict.homemodel.LoginOkCommand2;
import com.ict.homemodel.MypageCommand2;
import com.ict.homemodel.PwdchkCommand2;
import com.ict.homemodel.SignupCommand2;
import com.ict.homemodel.SignupOkCommand2;


@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String cmd = request.getParameter("cmd") ;
		Command2 comm = null ;
		System.out.println("서블릿도착");
		switch (cmd) {
		case "index2": comm = new IndexCommand2(); break;
		case "login2": comm = new LoginCommand2(); break;
		case "login_ok": comm = new LoginOkCommand2(); break;
		case "signup2": comm = new SignupCommand2(); break;
		case "signup_ok": comm = new SignupOkCommand2(); break;
		case "pwdchk": comm = new PwdchkCommand2(); break;
		case "mypage": comm = new MypageCommand2(); break;
		}
		
		String path =	comm.exec(request, response);
		//request의 정보를 가지고 가야한다. => 포워딩한다.
		request.getRequestDispatcher(path).forward(request, response);
	}
	
	

}
