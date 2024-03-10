package com.ict.homemodel;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PwdchkCommand2 implements Command2{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id") ;
		String pwd = request.getParameter("pwd") ;
		
		request.setAttribute("id", id);
		request.setAttribute("pwd", pwd);

		System.out.println("pwdcheck.jsp 가기 전");
		System.out.println(id);
		System.out.println(pwd);
		
		return "hometest/pwdcheck.jsp";
	}

}
