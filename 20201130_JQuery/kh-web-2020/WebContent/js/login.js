/**
 * login  logout을 위한 스크립트
 *	작성일 : 2020.12.11
 *	작성자 : 돌멩이
 */



var logInOut = function() {

/*	$('#btnLogin').on('click',function(){
		$('#frm_log').action = "./member/login.jsp";
		$('#frm_log').submit();
		
	});
	
	$('#btnLogout').on('click', function(){
		$('#frm_log').action = "./member/logout.jsp";
		$('#frm_log').submit();
	});
	*/
	//javascript version
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
			btnLogout.onclick = function(){
				location.href = './member/loginout.jsp';
			}
		}
	}
}