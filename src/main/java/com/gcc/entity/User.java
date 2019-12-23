package com.gcc.entity;

import java.sql.Date;

public class User {

	/** 用户ID */
	private String userid;

	/** 员工ID */
	private int employid;

	/** 密码 */
	private String password;

	/** 用户名 */
	private String username;

	/** 上次密码更新时间 */
	private Date updatepwddt;

	/** 上次登录时间 */
	private Date logindt;

	/** 上次登出时间 */
	private Date logoutdt;

	/** 用户状态 */
	private int status;

	/**
	 * @return the userid
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * @param userid the userid to set
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}

	/**
	 * @return the employid
	 */
	public int getEmployid() {
		return employid;
	}

	/**
	 * @param employid the employid to set
	 */
	public void setEmployid(int employid) {
		this.employid = employid;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the updatepwddt
	 */
	public Date getUpdatepwddt() {
		return updatepwddt;
	}

	/**
	 * @param updatepwddt the updatepwddt to set
	 */
	public void setUpdatepwddt(Date updatepwddt) {
		this.updatepwddt = updatepwddt;
	}

	/**
	 * @return the logindt
	 */
	public Date getLogindt() {
		return logindt;
	}

	/**
	 * @param logindt the logindt to set
	 */
	public void setLogindt(Date logindt) {
		this.logindt = logindt;
	}

	/**
	 * @return the logoutdt
	 */
	public Date getLogoutdt() {
		return logoutdt;
	}

	/**
	 * @param logoutdt the logoutdt to set
	 */
	public void setLogoutdt(Date logoutdt) {
		this.logoutdt = logoutdt;
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

}
