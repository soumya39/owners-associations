package com.mashreq.oa.entity;


import java.util.Date;


public class PaymentData {

	private long matrixRefNo;
	private String subProduct;
	private String debitAccountNumber;
	private String beneficiaryName;
	private Date date;
	private String paymentCurrency;
	private double amount;
	private String customerReference;
	private String initiatorNameAndDateAndTime; 
	private String status; 
	
	public PaymentData()
	{
		
	}

	public PaymentData(long matrixRefNo, String subProduct, String debitAccountNumber, String beneficiaryName,
			Date date, String paymentCurrency, double amount, String customerReference,
			String initiatorNameAndDateAndTime, String status) {
		this.matrixRefNo = matrixRefNo;
		this.subProduct = subProduct;
		this.debitAccountNumber = debitAccountNumber;
		this.beneficiaryName = beneficiaryName;
		this.date = date;
		this.paymentCurrency = paymentCurrency;
		this.amount = amount;
		this.customerReference = customerReference;
		this.initiatorNameAndDateAndTime = initiatorNameAndDateAndTime;
		this.status = status;
	}



	public long getMatrixRefNo() {
		return matrixRefNo;
	}

	public void setMatrixRefNo(long matrixRefNo) {
		this.matrixRefNo = matrixRefNo;
	}

	public String getSubProduct() {
		return subProduct;
	}

	public void setSubProduct(String subProduct) {
		this.subProduct = subProduct;
	}

	public String getDebitAccountNumber() {
		return debitAccountNumber;
	}

	public void setDebitAccountNumber(String debitAccountNumber) {
		this.debitAccountNumber = debitAccountNumber;
	}

	public String getBeneficiaryName() {
		return beneficiaryName;
	}

	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPaymentCurrency() {
		return paymentCurrency;
	}

	public void setPaymentCurrency(String paymentCurrency) {
		this.paymentCurrency = paymentCurrency;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCustomerReference() {
		return customerReference;
	}

	public void setCustomerReference(String customerReference) {
		this.customerReference = customerReference;
	}

	public String getInitiatorNameAndDateAndTime() {
		return initiatorNameAndDateAndTime;
	}

	public void setInitiatorNameAndDateAndTime(String initiatorNameAndDateAndTime) {
		this.initiatorNameAndDateAndTime = initiatorNameAndDateAndTime;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "PaymentData [matrixRefNo=" + matrixRefNo + ", subProduct=" + subProduct + ", debitAccountNumber="
				+ debitAccountNumber + ", beneficiaryName=" + beneficiaryName + ", date=" + date + ", paymentCurrency="
				+ paymentCurrency + ", amount=" + amount + ", customerReference=" + customerReference
				+ ", initiatorNameAndDateAndTime=" + initiatorNameAndDateAndTime + ", status=" + status + "]";
	}

	
	
}	
