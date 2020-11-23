package kh_test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")	// ����� URI
public class a extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private List<String> list = new ArrayList<>();
    /**
     * @see HttpServlet#HttpServlet()
     * ���� ������
     */
    public a() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * HttpServletResponse - �������̽�
	 * 
	 */
	protected void doGet(
			HttpServletRequest request,	// ��Ĺ�� ���� ����ü 
			HttpServletResponse response	// ��Ĺ�� ���� ����ü
	) throws ServletException, IOException {
		response.getWriter()
		.append(""
				+ "<!DOCTYPE html>"
				+ "<html>"
				+ "<head>"
				+ "<title>Hello Servlet!</title>"
				+ "</head>"
				+ "<body>"
				+ "<h1>._.</h1>"
				+ "</body>"
				+ "</html>");
		
		String pathInfo = request.getPathInfo();
		
		System.out.println(request.getMethod());
	}

	@Override
	public void destroy() {
		getServletContext().log("�Ѽ�����.....");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("����!@@@@");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
