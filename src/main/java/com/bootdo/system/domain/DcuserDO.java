package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-28 15:31:02
 */
public class DcuserDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//
	private String dcuser;
	//
	private String dcpassword;
	//
	private String dcfzr;
	//
	private String dcyongtu;

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
	public void setDcuser(String dcuser) {
		this.dcuser = dcuser;
	}
	/**
	 * 获取：
	 */
	public String getDcuser() {
		return dcuser;
	}
	/**
	 * 设置：
	 */
	public void setDcpassword(String dcpassword) {
		this.dcpassword = dcpassword;
	}
	/**
	 * 获取：
	 */
	public String getDcpassword() {
		return dcpassword;
	}
	/**
	 * 设置：
	 */
	public void setDcfzr(String dcfzr) {
		this.dcfzr = dcfzr;
	}
	/**
	 * 获取：
	 */
	public String getDcfzr() {
		return dcfzr;
	}
	/**
	 * 设置：
	 */
	public void setDcyongtu(String dcyongtu) {
		this.dcyongtu = dcyongtu;
	}
	/**
	 * 获取：
	 */
	public String getDcyongtu() {
		return dcyongtu;
	}
}
