package com.lk;

import java.io.Serializable;


public class UserEntity implements Serializable {

	private static final long serialVersionUID = 1L;
    private Long id;
	private String userName;
	private String passWord;
	private UserSexEnum userSex;
	private String nickName;
	private String testName1;
	private String testName2;
	private String testName3;

	public String getTestName1() {
		return testName1;
	}

	public void setTestName1(String testName1) {
		this.testName1 = testName1;
	}

	public String getTestName2() {
		return testName2;
	}

	public void setTestName2(String testName2) {
		this.testName2 = testName2;
	}

	public String getTestName3() {
		return testName3;
	}

	public void setTestName3(String testName3) {
		this.testName3 = testName3;
	}

	public UserEntity() {
		super();
	}

	public UserEntity(String userName, String passWord, UserSexEnum userSex) {
		super();
		this.passWord = passWord;
		this.userName = userName;
		this.userSex = userSex;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public UserSexEnum getUserSex() {
		return userSex;
	}

	public void setUserSex(UserSexEnum userSex) {
		this.userSex = userSex;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	public String toString() {
		return "UserEntity{" +
				"id=" + id +
				", userName='" + userName + '\'' +
				", passWord='" + passWord + '\'' +
				", userSex=" + userSex +
				", nickName='" + nickName + '\'' +
				", testName1='" + testName1 + '\'' +
				", testName2='" + testName2 + '\'' +
				", testName3='" + testName3 + '\'' +
				'}';
	}
}