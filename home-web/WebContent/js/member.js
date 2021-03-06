/**
 * 
 */


function getID(id){return document.getElementById(id)}

var member = function(){
	let url = 'index.jsp?inc=./member/';
	
	var btnInsert = getID('btnInsert');
	var btnFind   = getID('btnFind');
	var btnSelect = getID('btnSelect');
	var btnSave   = getID('btnSave');
	var btnFindZip = getID('btnFindZip');
	var btnPhoto  = getID('btnPhoto');
	var btnModify = getID('btnModify');
	var btnUpdate = getID('btnUpdate');
	var btnDelete = getID('btnDelete');
	
	if(btnDelete != null){
		btnDelete.onclick = function(){
			var frm = document.frm_member;
			var win = window.open('./member/input_pwd.jsp', 'win', 'width=400px, height=100px, left=300px, top=300px');
			
			win.onbeforeunload = function(){
				if(frm.pwd.value != ''){
					frm.action = 'member.do?job=delete';
					frm.mid.disabled=false;
					frm.submit();
				}
			}
		}
	}
	
	if(btnUpdate != null){
		btnUpdate.onclick = function(){
			var frm = document.frm_member;

			//암호와 암호확인의 일치여부
			/*
			var pwd = prompt("회원정보를 수정하시려면 암호를 입력하세요");
			if(pwd == null){
				return;
			}
			frm.pwd.value = pwd;
			*/
			
			var win = window.open('./member/input_pwd.jsp', 'win', 'width=400px, height=100px, left=300px, top=300px');
			win.onbeforeunload = function(){
				if(frm.pwd.value != ''){
					frm.enctype = 'multipart/form-data';
					frm.action = 'member.do?job=update'; //수정된 정보를 저장
					frm.submit();
				}
			}
		}
	}
	
	if(btnModify != null){
		btnModify.onclick = function(){
			var frm = document.frm_member;
			frm.mid.disabled=false;
			frm.action = 'member.do?job=modify';//수정화면이동
			frm.submit();
		}
	}
	
	if(btnSave != null){
		btnSave.onclick = function(){
			var frm = document.frm_member;
			var checkFlag=true;
			
			/* example(html 태그에 pattern속성 미 사용시)
			var reg_mid = /[\w!$\-]{4,10}/;
			if( !reg_mid.test(frm.mid.value) ){
				alert('mid');
				checkFlag=false;
			}
			*/
			
			if(!frm.mid.checkValidity()){
				alert('mid');
				checkFlag=false;
			}else if(!frm.name.checkValidity()){
				alert('name');
				checkFlag=false;
			}else if(!frm.pwd.checkValidity()){
				alert('pwd');
				checkFlag=false;
			}else if(!frm.email.checkValidity()){
				alert('email');
				checkFlag=false;
			}else if(!frm.phone.checkValidity()){
				alert('phone');
				checkFlag=false;
			}
			
			//암호와 암호확인의 일치여부
			if(frm.pwd.value != frm.pwdConfirm.value){
				alert('암호를 확인해 주소~');
				return;
			}
			if(checkFlag){
				frm.enctype = 'multipart/form-data';
				frm.action = 'member.do?job=insert';
				frm.submit();
			}
		}
	}
	
	if(btnSelect != null){
		btnSelect.onclick = function(){
			var frm = document.frm_member;
			frm.action = 'member.do?job=select';
			frm.submit();
		}
	}
	
	
	if(btnFind != null){
		btnFind.onclick = function(){
			var frm = document.frm_member;
			frm.action = "member.do?job=select";
			frm.nowPage.value = 1;
			frm.submit();
		}
	}
	
	if(btnInsert != null){
		btnInsert.onclick = function(){
			var frm = document.frm_member;
			frm.action = url + 'insert.jsp';
			frm.submit();
		}
	}

		// 다음 우편번호 검색 API를 사용한 주소 찾기
	if(btnFindZip != null){
		btnFindZip.onclick = function(){
			var frm = document.frm_member;
			new daum.Postcode({
				oncomplete : function(data){
					frm.zipcode.value = data.zonecode;
					frm.address.value = data.address;
				}
			}).open();
		}
	}
	
}

function goPage(page){
	var frm = document.frm_member;
	frm.action = 'member.do?job=select';
	frm.nowPage.value = page;
	frm.submit();
}

function view(mid){
	var frm = document.frm_member;
	frm.action = 'member.do?job=view';
	frm.mid.value = mid;
	frm.submit();
}