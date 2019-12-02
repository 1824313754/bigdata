package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-28 16:26:42
 */
public class LjuserDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//
	private String ljuser;
	//
	private String ljpassword;
	//
	private String ljfzr;
	//
	private String ljyongtu;

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
	public void setLjuser(String ljuser) {
		this.ljuser = ljuser;
	}
	/**
	 * 获取：
	 */
	public String getLjuser() {
		return ljuser;
	}
	/**
	 * 设置：
	 */
	public void setLjpassword(String ljpassword) {
		this.ljpassword = ljpassword;
	}
	/**
	 * 获取：
	 */
	public String getLjpassword() {
		return ljpassword;
	}
	/**
	 * 设置：
	 */
	public void setLjfzr(String ljfzr) {
		this.ljfzr = ljfzr;
	}
	/**
	 * 获取：
	 */
	public String getLjfzr() {
		return ljfzr;
	}
	/**
	 * 设置：
	 */
	public void setLjyongtu(String ljyongtu) {
		this.ljyongtu = ljyongtu;
	}
	/**
	 * 获取：
	 */
	public String getLjyongtu() {
		return ljyongtu;
	}
}
