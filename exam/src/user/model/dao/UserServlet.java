package user.model.dao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user.model.vo.User;

@WebServlet(urlPatterns = "/SearchUser")
public class UserServlet extends HttpServlet{
	String url = "/searchUser/";
	UserDao dao;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String temp = req.getParameter("userNo");
		System.out.println("userNo : " + temp);
		
		if(temp != null) {
			int userNo = Integer.parseInt(temp);
			dao = new UserDao();
			User user = dao.selectUser(userNo);
			
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
}
