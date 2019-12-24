package com.gcc.entity;

import java.sql.Date;

public class UserBaseInfo {

	/** 用户ID */
	private String userid;

	/** 用户日文名 */
	private String namejp;

	/** 性别 */
	private int sex;

	/** 电子邮箱 */
	private String email;

	/** 出生年月 */
	private Date birth;

	/** 身份证号 */
	private String identitycode;

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
	 * @return the namejp
	 */
	public String getNamejp() {
		return namejp;
	}

	/**
	 * @param namejp the namejp to set
	 */
	public void setNamejp(String namejp) {
		this.namejp = namejp;
	}

	/**
	 * @return the sex
	 */
	public int getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(int sex) {
		this.sex = sex;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the birth
	 */
	public Date getBirth() {
		return birth;
	}

	/**
	 * @param birth the birth to set
	 */
	public void setBirth(Date birth) {
		this.birth = birth;
	}

	/**
	 * @return the identitycode
	 */
	public String getIdentitycode() {
		return identitycode;
	}

	/**
	 * @param identitycode the identitycode to set
	 */
	public void setIdentitycode(String identitycode) {
		this.identitycode = identitycode;
	}
}
