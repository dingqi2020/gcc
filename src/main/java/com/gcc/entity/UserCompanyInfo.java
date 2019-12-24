package com.gcc.entity;

import java.sql.Date;

public class UserCompanyInfo {

	/** 用户ID */
	private String userid;

	/** 所属部门 */
	private String department;

	/** 直接上级 */
	private String leader;

	/** 职务 */
	private String position;

	/** 入司时间 */
	private Date intocompanydt;

	/** 转正时间 */
	private Date regulardt;

	/** 产假结束时间 */
	private Date maternitydt;

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
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the leader
	 */
	public String getLeader() {
		return leader;
	}

	/**
	 * @param leader the leader to set
	 */
	public void setLeader(String leader) {
		this.leader = leader;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * @return the intocompanydt
	 */
	public Date getIntocompanydt() {
		return intocompanydt;
	}

	/**
	 * @param intocompanydt the intocompanydt to set
	 */
	public void setIntocompanydt(Date intocompanydt) {
		this.intocompanydt = intocompanydt;
	}

	/**
	 * @return the regulardt
	 */
	public Date getRegulardt() {
		return regulardt;
	}

	/**
	 * @param regulardt the regulardt to set
	 */
	public void setRegulardt(Date regulardt) {
		this.regulardt = regulardt;
	}

	/**
	 * @return the maternitydt
	 */
	public Date getMaternitydt() {
		return maternitydt;
	}

	/**
	 * @param maternitydt the maternitydt to set
	 */
	public void setMaternitydt(Date maternitydt) {
		this.maternitydt = maternitydt;
	}

}
