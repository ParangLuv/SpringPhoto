package com.parangluv.domain;

public class UserVO {

	private String userId;
	private String userPw;
	private String userName;
	private String userEmail;
	private String userPhone;
	private int userPhone1;
	private int userPhone2;
	private int userPhone3;
	
	@Override
	public String toString() {
		return "UserVO [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", userEmail=" + userEmail
				+ ", userPhone=" + userPhone + "]";
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(int userPhone1, int userPhone2, int userPhone3) {
		String ph1 = Integer.toString(userPhone1);
		String ph2 = Integer.toString(userPhone2);
		String ph3 = Integer.toString(userPhone3);
		String phone = "0" + ph1 + "-" + ph2 + "-" + ph3;
		this.userPhone = phone;
	}
	public int getUserPhone1() {
		return userPhone1;
	}
	public void setUserPhone1(int userPhone1) {
		this.userPhone1 = userPhone1;
	}
	public int getUserPhone2() {
		return userPhone2;
	}
	public void setUserPhone2(int userPhone2) {
		this.userPhone2 = userPhone2;
	}
	public int getUserPhone3() {
		return userPhone3;
	}
	public void setUserPhone3(int userPhone3) {
		this.userPhone3 = userPhone3;
	}
	
	
	
	
	
	
}
