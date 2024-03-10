package com.ict.homemodel;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.homedb.HomeDAO;
import com.ict.homedb.HomeVO;

public class MypageCommand2 implements Command2{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id") ;
		String pwd = request.getParameter("pwd") ;
		
		HomeVO mvo = new HomeVO();
		mvo.setId(request.getParameter("id"));
		mvo.setPwd(request.getParameter("pwd"));
		
		mvo = HomeDAO.loginchk(mvo) ;
		request.setAttribute("mvo", mvo);
		return "hometest/mypage.jsp";
	}

}
