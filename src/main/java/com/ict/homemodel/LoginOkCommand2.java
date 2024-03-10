package com.ict.homemodel;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.homedb.HomeDAO;
import com.ict.homedb.HomeVO;

public class LoginOkCommand2 implements Command2{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		HomeVO mvo = new HomeVO();
		mvo.setId(request.getParameter("id"));
		mvo.setPwd(request.getParameter("pwd"));
		
		mvo = HomeDAO.loginchk(mvo);
		if (mvo==null) {
			System.out.println("로그인 실패");
			return "Home?cmd=login2";
		}else {
			System.out.println("로그인 성공");
			request.setAttribute("mvo", mvo);
			return "Home?cmd=index2";
		}
	}

}
