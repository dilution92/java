<%@page import="bean.Autocomplete"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>autocomplete</title>
<link rel="stylesheet" type="text/css" 
href="https://code.jquery.com/ui/1.12.1/themes/south-street/jquery-ui.css">
<script src='https://code.jquery.com/ui/1.12.1/jquery-ui.js'></script>
</head>
<body>
<%!
	Autocomplete ac = new Autocomplete();
	String data = ac.getData();
%>
<div id="autocomplete">
	<label>검색</label>
	<input type="text" name="findStr" id="findStr">
	<input type="button" value="검색"  id="btnFind">
</div>

<script type="text/javascript">
	
	var data = <%=data%>

	$('#findStr').autocomplete({
		source : data
	});
</script>

</body>
</html>