<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>effect</title>
<style type="text/css">
	#target{
		background-image: url("https://img.animalplanet.co.kr/news/2020/07/15/700/e05t9x1o0e3trklpwrr3.jpg");
		background-size: 100%;
		border-radius: 10px;
		width: 90%;
		height: 300px;
	}
	
	#parent{
		height: 380px;
	}
</style>
</head>
<body>
<div id="effect">
	<div id="parent">
		<div id="target"></div>
	</div>
	
	<div id="btns">
		<input type="button" value="SHOW" id="btnShow">
		<input type="button" value="HIDE" id="btnHide">
		<input type="button" value="TOGGLE" id="btnToggle">
		<input type="button" value="SLIDE DOWN" id="btnSlideDown">
		<input type="button" value="SLIDE UP" id="btnSlideUp">
		<input type="button" value="SLIDE TOGGLE" id="btnSlideToggle">
		<input type="button" value="FADE IN" id="btnFadeIn">
		<input type="button" value="FADE OUT" id="btnFadeOut">
		<input type="button" value="ANI" id="btnAni">
		
	</div>
</div>
<script type="text/javascript">
	$('#btnShow').on('click', function(){
		$('#target').show(1500);
	})
	
	$('#btnHide').on('click', function(){
		$('#target').hide(1500);
	})
	
	$('#btnToggle').on('click',function(){
		$('#target').toggle(700);
	})
	
	$('#btnSlideDown').on('click', function(){
		$('#target').slideDown(1000);
	})
	
	$('#btnSlideUp').on('click', function(){
		$('#target').slideUp(1000);
	})
	
	$('#btnSlideToggle').on('click', function(){
		$('#target').slideToggle(1000);
	})
	
	$('#btnFadeIn').on('click',function(){
		$('#target').fadeIn(700);
	})
	
	$('#btnFadeOut').on('click',function(){
		$('#target').fadeOut(700);
	})
	
	$('#btnAni').on('click',function(){
		$('#target').animate({width: 'toggle', opacity: 'toggle'}, 2000);
	})
	
	$('')
</script>
</body>
</html>