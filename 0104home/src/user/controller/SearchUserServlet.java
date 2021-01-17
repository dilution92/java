package user.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user.model.dao.UserDao;
import user.model.vo.User;

@WebServlet(name = "SearchUser", urlPatterns = {"/searchUser"})
public class SearchUserServlet extends HttpServlet{
	UserDao dao;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");

		String temp = req.getParameter("userId");

		if(temp != null) {
			String userId = temp;
			dao = new UserDao();
			User user = dao.selectUser(userId);
	
			RequestDispatcher rd = null;
			
			if(user == null) {
				rd = req.getRequestDispatcher("./view/searchFail.jsp");
			}else {
				rd = req.getRequestDispatcher("./view/searchSuccess.jsp");
			}
	
			req.setAttribute("user", user);
			rd.forward(req, resp);

		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doGet(req, resp);
	}

	
	
}
