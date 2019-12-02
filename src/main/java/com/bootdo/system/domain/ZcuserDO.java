package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-28 15:30:39
 */
public class ZcuserDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//
	private String mingchen;
	//
	private String zcuser;
	//
	private String zcpassword;
	//
	private String zcfuzeren;
	//
	private String zctime;
	//
	private String zctype;

	public ZcuserDO() {
	}

	public ZcuserDO(Integer id, String mingchen, String zcuser, String zcpassword, String zcfuzeren, String zctime, String zctype) {
		this.id = id;
		this.mingchen = mingchen;
		this.zcuser = zcuser;
		this.zcpassword = zcpassword;
		this.zcfuzeren = zcfuzeren;
		this.zctime = zctime;
		this.zctype = zctype;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMingchen() {
		return mingchen;
	}

	public void setMingchen(String mingchen) {
		this.mingchen = mingchen;
	}

	public String getZcuser() {
		return zcuser;
	}

	public void setZcuser(String zcuser) {
		this.zcuser = zcuser;
	}

	public String getZcpassword() {
		return zcpassword;
	}

	public void setZcpassword(String zcpassword) {
		this.zcpassword = zcpassword;
	}

	public String getZcfuzeren() {
		return zcfuzeren;
	}

	public void setZcfuzeren(String zcfuzeren) {
		this.zcfuzeren = zcfuzeren;
	}

	public String getZctime() {
		return zctime;
	}

	public void setZctime(String zctime) {
		this.zctime = zctime;
	}

	public String getZctype() {
		return zctype;
	}

	public void setZctype(String zctype) {
		this.zctype = zctype;
	}
}
