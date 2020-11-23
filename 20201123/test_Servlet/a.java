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
@WebServlet("/HelloServlet")	// 상대적 URI
public class a extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private List<String> list = new ArrayList<>();
    /**
     * @see HttpServlet#HttpServlet()
     * 서블릿 생성자
     */
    public a() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * HttpServletResponse - 인터페이스
	 * 
	 */
	protected void doGet(
			HttpServletRequest request,	// 톰캣이 만든 구현체 
			HttpServletResponse response	// 톰캣이 만든 구현체
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
		getServletContext().log("뿌셔진당.....");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("시작!@@@@");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
