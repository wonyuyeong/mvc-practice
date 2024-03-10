package com.ict.homemodel;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.homedb.HomeDAO;
import com.ict.homedb.HomeVO;

public class SignupOkCommand2 implements Command2{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		HomeVO mvo = new HomeVO();
		
		mvo.setId(request.getParameter("id"));
		mvo.setPwd(request.getParameter("pwd"));
		mvo.setName(request.getParameter("name"));
		mvo.setEmail(request.getParameter("email"));
		mvo.setAddr(request.getParameter("addr"));
		mvo.setPhone(request.getParameter("phone"));
		int result = HomeDAO.getsignup(mvo);
		System.out.println("index2 리턴전");
		return "Home?cmd=index2";
	}

}
