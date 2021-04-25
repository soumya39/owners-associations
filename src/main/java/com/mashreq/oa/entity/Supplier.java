package com.mashreq.oa.entity;

public class Supplier {
	private long mid;
	private String SupplierName;
	private String remarks;
	@Override
	public String toString() {
		return "Supplier [mid=" + mid + ", SupplierName=" + SupplierName + ", remarks=" + remarks + "]";
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
	 * @return the supplierName
	 */
	public String getSupplierName() {
		return SupplierName;
	}
	/**
	 * @param supplierName the supplierName to set
	 */
	public void setSupplierName(String supplierName) {
		SupplierName = supplierName;
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
