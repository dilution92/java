package bean;

import java.sql.Connection;
import java.sql.DriverManager;

public class Application {
	Connection conn;
	String userName = "system";
	String userPwd = "oracle";
	public Application() {
		connect();
	}
	
	public Application(String u, String p) {
		this.userName = u;
		this.userPwd = p;
		connect();
	}
	
	public void connect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", 
					userName, userPwd );
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
	public Connection getConn() {
		return conn;
	}
}
