package com.mashreq.oa.entity;

import java.util.Date;

public class AttachmentData {
	
	private String issuanceAuthority;
	private Date tradeLicenseExpDate;
	private Date agreementExpDate;
	private int budgetYear;
	private String invoiceDateYear;
	private double invoiceAmount;
	private String supplierName;
	private Integer mgmtCompId;
	private Integer documentId;
	
	public AttachmentData()
	{
		
	}

	public AttachmentData(String issuanceAuthority, Date tradeLicenseExpDate, Date agreementExpDate, int budgetYear,
			String invoiceDateYear, double invoiceAmount, String supplierName, Integer mgmtCompId, Integer documentId) {
		this.issuanceAuthority = issuanceAuthority;
		this.tradeLicenseExpDate = tradeLicenseExpDate;
		this.agreementExpDate = agreementExpDate;
		this.budgetYear = budgetYear;
		this.invoiceDateYear = invoiceDateYear;
		this.invoiceAmount = invoiceAmount;
		this.supplierName = supplierName;
		this.mgmtCompId = mgmtCompId;
		this.documentId = documentId;
	}

	public String getIssuanceAuthority() {
		return issuanceAuthority;
	}

	public void setIssuanceAuthority(String issuanceAuthority) {
		this.issuanceAuthority = issuanceAuthority;
	}

	public Date getTradeLicenseExpDate() {
		return tradeLicenseExpDate;
	}

	public void setTradeLicenseExpDate(Date tradeLicenseExpDate) {
		this.tradeLicenseExpDate = tradeLicenseExpDate;
	}

	public Date getAgreementExpDate() {
		return agreementExpDate;
	}

	public void setAgreementExpDate(Date agreementExpDate) {
		this.agreementExpDate = agreementExpDate;
	}

	public int getBudgetYear() {
		return budgetYear;
	}

	public void setBudgetYear(int budgetYear) {
		this.budgetYear = budgetYear;
	}

	public String getInvoiceDateYear() {
		return invoiceDateYear;
	}

	public void setInvoiceDateYear(String invoiceDateYear) {
		this.invoiceDateYear = invoiceDateYear;
	}

	public double getInvoiceAmount() {
		return invoiceAmount;
	}

	public void setInvoiceAmount(double invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public Integer getMgmtCompId() {
		return mgmtCompId;
	}

	public void setMgmtCompId(Integer mgmtCompId) {
		this.mgmtCompId = mgmtCompId;
	}

	public Integer getDocumentId() {
		return documentId;
	}

	public void setDocumentId(Integer documentId) {
		this.documentId = documentId;
	}

	@Override
	public String toString() {
		return "AttachmentData [issuanceAuthority=" + issuanceAuthority + ", tradeLicenseExpDate=" + tradeLicenseExpDate
				+ ", agreementExpDate=" + agreementExpDate + ", budgetYear=" + budgetYear + ", invoiceDateYear="
				+ invoiceDateYear + ", invoiceAmount=" + invoiceAmount + ", supplierName=" + supplierName
				+ ", mgmtCompId=" + mgmtCompId + ", documentId=" + documentId + "]";
	}

}
