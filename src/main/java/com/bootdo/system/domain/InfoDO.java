package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-22 18:00:20
 */
public class InfoDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//
	private String ip;
	//
	private String cpuCore;
	//
	private String memoryCapacity;
	//
	private String diskSize;
	//
	private String systemsDesc;
	//
	private String xuliehao;
	//
	private String xinhao;
	//
	private String leixin;
	//
	private String functionary;

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
	public void setCpuCore(String cpuCore) {
		this.cpuCore = cpuCore;
	}
	/**
	 * 获取：
	 */
	public String getCpuCore() {
		return cpuCore;
	}
	/**
	 * 设置：
	 */
	public void setMemoryCapacity(String memoryCapacity) {
		this.memoryCapacity = memoryCapacity;
	}
	/**
	 * 获取：
	 */
	public String getMemoryCapacity() {
		return memoryCapacity;
	}
	/**
	 * 设置：
	 */
	public void setDiskSize(String diskSize) {
		this.diskSize = diskSize;
	}
	/**
	 * 获取：
	 */
	public String getDiskSize() {
		return diskSize;
	}
	/**
	 * 设置：
	 */
	public void setSystemsDesc(String systemsDesc) {
		this.systemsDesc = systemsDesc;
	}
	/**
	 * 获取：
	 */
	public String getSystemsDesc() {
		return systemsDesc;
	}
	/**
	 * 设置：
	 */
	public void setXuliehao(String xuliehao) {
		this.xuliehao = xuliehao;
	}
	/**
	 * 获取：
	 */
	public String getXuliehao() {
		return xuliehao;
	}
	/**
	 * 设置：
	 */
	public void setXinhao(String xinhao) {
		this.xinhao = xinhao;
	}
	/**
	 * 获取：
	 */
	public String getXinhao() {
		return xinhao;
	}
	/**
	 * 设置：
	 */
	public void setLeixin(String leixin) {
		this.leixin = leixin;
	}
	/**
	 * 获取：
	 */
	public String getLeixin() {
		return leixin;
	}
	/**
	 * 设置：
	 */
	public void setFunctionary(String functionary) {
		this.functionary = functionary;
	}
	/**
	 * 获取：
	 */
	public String getFunctionary() {
		return functionary;
	}
}
