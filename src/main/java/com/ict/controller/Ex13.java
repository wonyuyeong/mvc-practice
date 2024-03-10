package com.ict.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.model.Command;
import com.ict.model.Command01;
import com.ict.model.Command02;
import com.ict.model.Command03;

@WebServlet("/Ex13")
public class Ex13 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String cmd = request.getParameter("cmd");
		
		Command comm = null;
		switch (cmd) {
			case "1" : comm = new Command01(); break;
			case "2" : comm = new Command02(); break;
			case "3" : comm = new Command03(); break;
		}
		String path =	comm.exec(request, response);//호출
		request.getRequestDispatcher(path).forward(request, response);

		/*
		String cmd = request.getParameter("cmd");
		  switch (cmd) {
		case "1" : 
			Command01 cmd01 = new Command01();//객체생성
			//받기(sting으로 보내서 string으로 받기)
			String path =	cmd01.exec(request, response);//임포트하기 호출하기
			//request의 정보를 가지고 가야한다. => 포워딩한다. 넘어가기
			request.getRequestDispatcher(path).forward(request, response);
			break;
		
		case "2" :
			Command02 cmd02 = new Command02();
			String path2 =	cmd02.exec(request, response);
			//request의 정보를 가지고 가야한다. => 포워딩한다.
			request.getRequestDispatcher(path2).forward(request, response);
			break;

		case "3" : 
			Command03 cmd03 = new Command03();
			String path3 =	cmd03.exec(request, response);
			//request의 정보를 가지고 가야한다. => 포워딩한다.
			request.getRequestDispatcher(path3).forward(request, response);
			break;
		}
		 */
	}
}













