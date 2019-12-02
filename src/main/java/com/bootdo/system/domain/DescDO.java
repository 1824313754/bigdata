package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-18 14:53:33
 */
public class DescDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//
	private String proposer;
	//
	private String email;
	//
	private String projectName;
	//
	private String type;
	//
	private String userName;
	//
	private String sentryId;
	//
	private String adGroup;
	//
	private String password;
	//
	private String jiqun;

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setProposer(String proposer) {
		this.proposer = proposer;
	}
	/**
	 * 获取：
	 */
	public String getProposer() {
		return proposer;
	}
	/**
	 * 设置：
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 获取：
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 设置：
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	/**
	 * 获取：
	 */
	public String getProjectName() {
		return projectName;
	}
	/**
	 * 设置：
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 获取：
	 */
	public String getType() {
		return type;
	}
	/**
	 * 设置：
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * 获取：
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * 设置：
	 */
	public void setSentryId(String sentryId) {
		this.sentryId = sentryId;
	}
	/**
	 * 获取：
	 */
	public String getSentryId() {
		return sentryId;
	}
	/**
	 * 设置：
	 */
	public void setAdGroup(String adGroup) {
		this.adGroup = adGroup;
	}
	/**
	 * 获取：
	 */
	public String getAdGroup() {
		return adGroup;
	}
	/**
	 * 设置：
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 获取：
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 设置：
	 */
	public void setJiqun(String jiqun) {
		this.jiqun = jiqun;
	}
	/**
	 * 获取：
	 */
	public String getJiqun() {
		return jiqun;
	}
}
