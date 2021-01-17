package com.iei.dao;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.iei.vo.Member;

public class MemberDao {

public Member loginMember(Member member) {

Connection conn = null;

PreparedStatement pstmt = null;

ResultSet rset = null;

String query = "select * from member_tbl where member_id=? and member_pw=?";

Member login = null;

try {

Class.forName("oracle.jdbc.driver.OracleDriver");

conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "examuser", "1234");

pstmt = conn.prepareStatement(query);

pstmt.setString(1, member.getMemberId()); @@
pstmt.setString(2, member.getMemberPw()); @@

rset = pstmt.executeQuery();

if(rset.next()) {

login = new Member();

login.setMemberId(rset.getString("member_id"));

login.setMemberPw(rset.getString("member_pw"));

login.setMemberName(rset.getString("member_name"));

}

} catch (ClassNotFoundException e) {

e.printStackTrace();

} catch (SQLException e) {

e.printStackTrace();

}finally {

try {

rset.close();

pstmt.close();

conn.close();

} catch (SQLException e) {

e.printStackTrace();

}

}

return login;

}

}
