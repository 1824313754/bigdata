package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-08 16:28:23
 */
public class ListDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Long id;
	//
	private String ip;
	//
	private String sid;
	//
	private String user;
	//
	private String password;
	//
	private String freedom;
	//
	private String size;
	//
	private String component;
	//
	private String environment;
	//
	private String describe;

	/**
	 * 设置：
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}
	/**
	 * 获取：
	 */
	public String getIp() {
		return ip;
	}
	/**
	 * 设置：
	 */
	public void setSid(String sid) {
		this.sid = sid;
	}
	/**
	 * 获取：
	 */
	public String getSid() {
		return sid;
	}
	/**
	 * 设置：
	 */
	public void setUser(String user) {
		this.user = user;
	}
	/**
	 * 获取：
	 */
	public String getUser() {
		return user;
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
	public void setFreedom(String freedom) {
		this.freedom = freedom;
	}
	/**
	 * 获取：
	 */
	public String getFreedom() {
		return freedom;
	}
	/**
	 * 设置：
	 */
	public void setSize(String size) {
		this.size = size;
	}
	/**
	 * 获取：
	 */
	public String getSize() {
		return size;
	}
	/**
	 * 设置：
	 */
	public void setComponent(String component) {
		this.component = component;
	}
	/**
	 * 获取：
	 */
	public String getComponent() {
		return component;
	}
	/**
	 * 设置：
	 */
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	/**
	 * 获取：
	 */
	public String getEnvironment() {
		return environment;
	}
	/**
	 * 设置：
	 */
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	/**
	 * 获取：
	 */
	public String getDescribe() {
		return describe;
	}
}
