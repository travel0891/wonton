package com.travel.model;

import java.util.Date;

public class User {

	private int intId;
	private String account;
	private String password;
	private Date createTime;

	public User() {
	}

	public User(int intId, String account, String password, Date createTime) {

		this.intId = intId;
		this.account = account;
		this.password = password;
		this.createTime = createTime;
	}

	public int getIntId() {
		return intId;
	}

	public void setIntId(int intId) {
		this.intId = intId;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "user [intId=" + intId + ", account=" + account + ", password=" + password + ", createTime=" + createTime
				+ "]";
	}
}
