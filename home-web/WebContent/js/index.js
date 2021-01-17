// index java script
// 돌멩이
// 2020.12.17

//제이쿼리로 css 표기

//모든 기본태그의 마진,패딩 0으로 설정
$('*').css({
	'margin': '0px',
	'padding': '0px'
});


//패딩 증가의 영향을 최소화 하기 위한 조치 
$('*').css('box-sizing', 'border-box');
$('*').css('text-decoration', 'none');

//index페이지의 넓이와 중앙배치
$('#index').css({
	'width': '1000px',
	'margin': 'auto',
	'background-color':'#ffffff'
});

//header 높이와 바탕색
$('#index>#header').css({
	'height': '125px',
	'background-color': 'silver',
	'margin-top': '5px',
	'position': 'relative'
});

//header css 설정
$('#header>#nav').css({
	'position' : 'absolute',
	'right': '2px',
	'bottom': '2px'
});

$('#header>#nav>ul').css({
	'list-style' : 'none'
		
});

$('#header>#nav>ul>li').css({
	'display' : 'inline-block',
	'padding' : '3px',
	'width' : '70px',
	'background-color': 'white',
	'text-aline' : 'center'
});

$('#header>#nav>ul>li').first().css('border-radius', '8px 0 0 8px');
$('#header>#nav>ul>li').last().css('border-radius', '0 8px 8px 0');

//contents는 최소 높이만
$('#index>#contents').css('min-height', '250px');

//footer 높이와 바탕색 등을 JSON으로 표기
$('#index>#footer').css({
	'height' : '100px',
	'background-color' : '#aaa',
	'text-align' : 'center',
	'line-height' : '100px'
});
 
$('#index>#contents').css({
	'margin-top' : '5px',
	'margin-bottom' : '5px'
});

$('#index>#contents>.content').css({
	'width' : '800px',
	'float' : 'left'
});

$('#index>#contents>.aside').css({
	'width' : '200px',
	'float' : 'left'
});

$('#index>#contents>.aside>#sub_menu').css({
	'width' : '150px'
});

$('#index>#contents>.aside>#sub_menu>ol').css({
	'margin' : '17px'
});

