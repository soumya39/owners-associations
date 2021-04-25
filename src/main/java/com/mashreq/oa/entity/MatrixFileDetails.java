package com.mashreq.oa.entity;

import java.time.LocalDate;

public class MatrixFileDetails {
	
	private long matrixRefNo;
	private long debitAccountNo;
	private LocalDate valueDate;
	private String customerReference;
	private long beneficiaryAccountNo;
	private String beneficiaryName;
	private String beneficiaryType;
	private long debitCcyAmount;
	private long amountCcyAmount;
	private LocalDate initiationDate;
	private String secondaryInformation;
	private String debitAccountCurrency;
	private int budgetYear;
	private int invoiceYear;
	private String remarks;
	
	
	public long getMatrixRefNo() {
		return matrixRefNo;
	}

	public void setMatrixRefNo(long matrixRefNo) {
		this.matrixRefNo = matrixRefNo;
	}
	public long getDebitAccountNo() {
		return debitAccountNo;
	}
	public void setDebitAccountNo(long debitAccountNo) {
		this.debitAccountNo = debitAccountNo;
	}
	public LocalDate getValueDate() {
		return valueDate;
	}
	public void setValueDate(LocalDate valueDate) {
		this.valueDate = valueDate;
	}
	public String getCustomerReference() {
		return customerReference;
	}
	public void setCustomerReference(String customerReference) {
		this.customerReference = customerReference;
	}
	public long getBeneficiaryAccountNo() {
		return beneficiaryAccountNo;
	}
	public void setBeneficiaryAccountNo(long beneficiaryAccountNo) {
		this.beneficiaryAccountNo = beneficiaryAccountNo;
	}
	public String getBeneficiaryName() {
		return beneficiaryName;
	}
	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}
	public String getBeneficiaryType() {
		return beneficiaryType;
	}
	public void setBeneficiaryType(String beneficiaryType) {
		this.beneficiaryType = beneficiaryType;
	}
	public long getDebitCcyAmount() {
		return debitCcyAmount;
	}
	public void setDebitCcyAmount(long debitCcyAmount) {
		this.debitCcyAmount = debitCcyAmount;
	}
	public long getAmountCcyAmount() {
		return amountCcyAmount;
	}
	public void setAmountCcyAmount(long amountCcyAmount) {
		this.amountCcyAmount = amountCcyAmount;
	}
	public LocalDate getInitiationDate() {
		return initiationDate;
	}
	public void setInitiationDate(LocalDate initiationDate) {
		this.initiationDate = initiationDate;
	}
	public String getSecondaryInformation() {
		return secondaryInformation;
	}
	public void setSecondaryInformation(String secondaryInformation) {
		this.secondaryInformation = secondaryInformation;
	}
	public String getDebitAccountCurrency() {
		return debitAccountCurrency;
	}
	public void setDebitAccountCurrency(String debitAccountCurrency) {
		this.debitAccountCurrency = debitAccountCurrency;
	}
	public int getBudgetYear() {
		return budgetYear;
	}
	public void setBudgetYear(int budgetYear) {
		this.budgetYear = budgetYear;
	}
	public int getInvoiceYear() {
		return invoiceYear;
	}
	public void setInvoiceYear(int invoiceYear) {
		this.invoiceYear = invoiceYear;
	}
	
	
	
	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "MatrixFileDetails [matrixRefNo=" + matrixRefNo + ", debitAccountNo=" + debitAccountNo + ", valueDate="
				+ valueDate + ", customerReference=" + customerReference + ", beneficiaryAccountNo="
				+ beneficiaryAccountNo + ", beneficiaryName=" + beneficiaryName + ", beneficiaryType=" + beneficiaryType
				+ ", debitCcyAmount=" + debitCcyAmount + ", amountCcyAmount=" + amountCcyAmount + ", initiationDate="
				+ initiationDate + ", secondaryInformation=" + secondaryInformation + ", debitAccountCurrency="
				+ debitAccountCurrency + ", budgetYear=" + budgetYear + ", invoiceYear=" + invoiceYear + ", remarks="
				+ remarks + "]";
	}

	
	
}
