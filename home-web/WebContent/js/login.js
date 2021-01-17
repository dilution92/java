/**
 *  2021.01.03 로그인 스크립트 돌멩이
 */



var logInOut = function(){
	var btnLogin = document.getElementById('btnLogin');
	var btnLogout = document.getElementById('btnLogout');
	
	if(btnLogin != null){
		btnLogin.onclick = function(){
			var frm = document.frm_log;
			frm.action = './member/login.jsp';
			frm.submit();
		}
	}
	if(btnLogout != null){
		btnLogout.onclick = function(){
			location.href = './member/logout.jsp';
		}
	}
		
}