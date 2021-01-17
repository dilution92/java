package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.Application;

public class MemberDao {
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;
	
	public MemberDao() {
		conn = new Application().getConn();
	}
	
	public boolean login(String mid, String pwd) {
		boolean b = false;
		
		try {
			String sql = "select count(mid) cnt from members where mid=? and pwd=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, mid);
			ps.setString(2, pwd);
			
			rs= ps.executeQuery();
			if(rs.next()) {
				int cnt = rs.getInt("cnt");
				if(cnt >=1) {
					b = true;
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disConn();
			return b;
		}
		
		
		
	}
	
	public void disConn() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
