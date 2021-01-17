package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import kh.model.dao.Dao;
import kh.model.vo.Kh;

@WebServlet("/searchKH")
public class KhServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = null;
		String str = req.getParameter("search");
		
		Kh kh = new Kh();
		Dao dao = new Dao();
		Gson gson = new Gson();
		
		kh = dao.selectOneKh(str);
		String gstr = gson.toJson(kh);
		
		
		out.pring(gstr);
		out.close();
//		req.setAttribute("gstr", gstr);
//		rd = req.getRequestDispatcher("/view/searchKH.jsp");
//		rd.forward(req, resp);
	}
}
