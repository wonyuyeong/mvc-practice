package com.ict.homemodel;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignupCommand2 implements Command2{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		//아직 입력받은게 없으니깐 return값만 있음.
		return "hometest/signup.jsp";
	}

}
