package com.iei.test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import com.iei.dao.MemberDao;

import com.iei.vo.Member;

/**

* Servlet implementation class LoginServlet

*/

@WebServlet(name = "Login", urlPatterns = { "/login" })

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

request.setCharacterEncoding("utf-8");

String memberId = request.getParameter("memberId"); // name 값으로 파라미터를 받아옴

String memberPw = request.getParameter("memberPw");

Member member = new Member();

member.setMemberId(memberId);

member.setMemberPw(memberPw);

Member login = new MemberDao().loginMember(member);

String msg = "";

if(login != null) { @@

msg = "로그인 성공!";

}else {

msg = "로그인 실패";

}

RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/loginResult.jsp");

request.setAttribute("msg", msg);

dispatcher.forward(request, response);

}

/**

* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)

*/

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

// TODO Auto-generated method stub

doGet(request, response);

}

}
