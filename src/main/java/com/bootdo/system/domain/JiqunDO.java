package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-13 11:02:24
 */
public class JiqunDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//
	private String ip;
	//
	private String hostname;
	//
	private String type;
	//
	private String pingtai;
	//
	private String version;
	private String cmversion;
	private String fuzeren;
	private String cmuser;
	private String cmpassword;

	public JiqunDO() {
	}

	public JiqunDO(Integer id, String ip, String hostname, String type, String pingtai, String version, String cmversion, String fuzeren, String cmuser, String cmpassword) {
		this.id = id;
		this.ip = ip;
		this.hostname = hostname;
		this.type = type;
		this.pingtai = pingtai;
		this.version = version;
		this.cmversion = cmversion;
		this.fuzeren = fuzeren;
		this.cmuser = cmuser;
		this.cmpassword = cmpassword;
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

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPingtai() {
		return pingtai;
	}

	public void setPingtai(String pingtai) {
		this.pingtai = pingtai;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getCmversion() {
		return cmversion;
	}

	public void setCmversion(String cmversion) {
		this.cmversion = cmversion;
	}

	public String getFuzeren() {
		return fuzeren;
	}

	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}

	public String getCmuser() {
		return cmuser;
	}

	public void setCmuser(String cmuser) {
		this.cmuser = cmuser;
	}

	public String getCmpassword() {
		return cmpassword;
	}

	public void setCmpassword(String cmpassword) {
		this.cmpassword = cmpassword;
	}
}
