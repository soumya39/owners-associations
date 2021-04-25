package com.mashreq.oa.dto;

public class Reports {
	private String managementCompany;
	private String supplier;
	private int budgetYear;
	private int invoiceYear;
	private double totalBudget;
	private double consumedAmount;
	private double balanceAmount;

	@Override
	public String toString() {
		return "Repports [managementCompany=" + managementCompany + ", supplier=" + supplier + ", budgetYear="
				+ budgetYear + ", invoiceYear=" + invoiceYear + ", totalBudget=" + totalBudget + ", consumedAmount="
				+ consumedAmount + ", balanceAmount=" + balanceAmount + "]";
	}

	public String getManagementCompany() {
		return managementCompany;
	}

	public void setManagementCompany(String managementCompany) {
		this.managementCompany = managementCompany;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
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

	public double getTotalBudget() {
		return totalBudget;
	}

	public void setTotalBudget(double totalBudget) {
		this.totalBudget = totalBudget;
	}

	public double getConsumedAmount() {
		return consumedAmount;
	}

	public void setConsumedAmount(double consumedAmount) {
		this.consumedAmount = consumedAmount;
	}

	public double getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

}
