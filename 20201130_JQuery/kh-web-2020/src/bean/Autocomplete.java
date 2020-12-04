package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Autocomplete {
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;
	public Autocomplete() {
		conn = new Application().getConn();
	};
	
	public String getData() {
		StringBuffer sb = new StringBuffer();
		
		try {
			String sql = "select first_name from hr.employees";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery(); // CRUD
			sb.append("[");
			rs.next();
			sb.append("'" + rs.getString("first_name")+ "'");
			while(rs.next()) {
				sb.append(", '" + rs.getString("first_name")+ "'");
			}
			sb.append("]");
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			String temp = sb.toString();
			temp = temp.replaceAll("'", "\"");
			return temp;
		}
	}
}
