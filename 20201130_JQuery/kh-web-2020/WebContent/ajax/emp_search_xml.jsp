<?xml version='1.0' encoding='UTF-8' ?>
<%@page import="bean.EmpDao"%>
<%@page import="bean.EmpVo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/xml; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% //root element(root node) tag
	String findStr = request.getParameter("findStr");
	EmpDao dao = new EmpDao();
	List<EmpVo> list = dao.search(findStr);
%>
<emps>
   <%for(EmpVo vo: list){%>
	<emp>
		<id><%=vo.getEmployee_id()%></id>
		<name><%=vo.getFirst_name()%></name>
		<email><%=vo.getEmail()%></email>
		<phone><%=vo.getPhone_number()%></phone>
		<salary><%=vo.getSalary()%></salary>
	</emp>
	<%}%>
</emps>