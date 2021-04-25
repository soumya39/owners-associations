package com.mashreq.oa.entity;

public class ManagementCompany {
	private long mid;
	private String managementCompanyName;
	private String remarks;
	
	@Override
	public String toString() {
		return "ManagementCompany [mid=" + mid + ", managementCompanyName=" + managementCompanyName + ", remarks="
				+ remarks + "]";
	}
	/**
	 * @return the mid
	 */
	public long getMid() {
		return mid;
	}
	/**
	 * @param mid the mid to set
	 */
	public void setMid(long mid) {
		this.mid = mid;
	}
	/**
	 * @return the managementCompanyName
	 */
	public String getManagementCompanyName() {
		return managementCompanyName;
	}
	/**
	 * @param managementCompanyName the managementCompanyName to set
	 */
	public void setManagementCompanyName(String managementCompanyName) {
		this.managementCompanyName = managementCompanyName;
	}
	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}
	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}
