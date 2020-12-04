<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" 
href="https://code.jquery.com/ui/1.12.1/themes/south-street/jquery-ui.css">
<script src='https://code.jquery.com/ui/1.12.1/jquery-ui.js'></script>
<title>drop</title>

<style type="text/css">
	.abc{
		background-color: #aaa;
	}

	#drag{
		border: 2px solid #00f;
		width: 200px;
		height: 200px;
	}
	#drop>div{
		border: 2px solid #00f;
	}
	
	#droppable{
		width: 400px;
		height: 400px;
	
	}
	
</style>
</head>
<body>
<div id="drop">
	<div id="drag">이 부분을 옮겨 보세요</div>
	
	<div id="droppable">여기에 떨어뜨리세요~</div>	
</div>
<script type="text/javascript">
	$('#drag').draggable();
	$('#droppable').droppable({
		drop : function(){
			$(this).addClass('abc')
		}
	});
</script>
</body>
</html>