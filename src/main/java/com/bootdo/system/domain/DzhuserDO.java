package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-28 16:26:39
 */
public class DzhuserDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//
	private String dzhuser;
	//
	private String dzhpassword;
	//
	private String dzhfzr;
	//
	private String dzhyongtu;

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
	public void setDzhuser(String dzhuser) {
		this.dzhuser = dzhuser;
	}
	/**
	 * 获取：
	 */
	public String getDzhuser() {
		return dzhuser;
	}
	/**
	 * 设置：
	 */
	public void setDzhpassword(String dzhpassword) {
		this.dzhpassword = dzhpassword;
	}
	/**
	 * 获取：
	 */
	public String getDzhpassword() {
		return dzhpassword;
	}
	/**
	 * 设置：
	 */
	public void setDzhfzr(String dzhfzr) {
		this.dzhfzr = dzhfzr;
	}
	/**
	 * 获取：
	 */
	public String getDzhfzr() {
		return dzhfzr;
	}
	/**
	 * 设置：
	 */
	public void setDzhyongtu(String dzhyongtu) {
		this.dzhyongtu = dzhyongtu;
	}
	/**
	 * 获取：
	 */
	public String getDzhyongtu() {
		return dzhyongtu;
	}
}
