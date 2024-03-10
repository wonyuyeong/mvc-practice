package com.ict.homemodel;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command2 {
	public String exec(HttpServletRequest request,HttpServletResponse response);
}
