package user.model.vo;

public class User {
	int userNo;
	String userId;
	String userName;
	int UserAge;
	String password;
	String passwordchk;

	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return UserAge;
	}
	public void setUserAge(int userAge) {
		UserAge = userAge;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordchk() {
		return passwordchk;
	}
	public void setPasswordchk(String passwordchk) {
		this.passwordchk = passwordchk;
	}
	
	
}
