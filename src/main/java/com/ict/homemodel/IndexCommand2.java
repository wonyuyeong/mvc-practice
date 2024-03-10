package com.ict.homemodel;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexCommand2 implements Command2{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		return "hometest/index.jsp";
	}

}
