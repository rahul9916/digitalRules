package com.myspace.digitalrules;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class premiumCalc implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("membershipType")
	private java.lang.String membershipType;
	@org.kie.api.definition.type.Label("salary")
	private java.lang.Integer salary;
	@org.kie.api.definition.type.Label("premiumAmount")
	private java.lang.Integer premiumAmount;
	@org.kie.api.definition.type.Label("salaryBand")
	private java.lang.String salaryBand;

	@org.kie.api.definition.type.Label(value = "coverage")
	private java.lang.Integer coverage;

	@org.kie.api.definition.type.Label(value = "benefitType")
	private java.lang.String benefitType;

	@org.kie.api.definition.type.Label(value = "productName")
	private java.lang.String productName;

	public premiumCalc() {
	}

	public java.lang.String getMembershipType() {
		return this.membershipType;
	}

	public void setMembershipType(java.lang.String membershipType) {
		this.membershipType = membershipType;
	}

	public java.lang.Integer getSalary() {
		return this.salary;
	}

	public void setSalary(java.lang.Integer salary) {
		this.salary = salary;
	}

	public java.lang.Integer getPremiumAmount() {
		return this.premiumAmount;
	}

	public void setPremiumAmount(java.lang.Integer premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public java.lang.String getSalaryBand() {
		return this.salaryBand;
	}

	public void setSalaryBand(java.lang.String salaryBand) {
		this.salaryBand = salaryBand;
	}

	public java.lang.Integer getCoverage() {
		return this.coverage;
	}

	public void setCoverage(java.lang.Integer coverage) {
		this.coverage = coverage;
	}

	public java.lang.String getBenefitType() {
		return this.benefitType;
	}

	public void setBenefitType(java.lang.String benefitType) {
		this.benefitType = benefitType;
	}

	public java.lang.String getProductName() {
		return this.productName;
	}

	public void setProductName(java.lang.String productName) {
		this.productName = productName;
	}

	public premiumCalc(java.lang.String membershipType,
			java.lang.Integer salary, java.lang.Integer premiumAmount,
			java.lang.String salaryBand, java.lang.Integer coverage,
			java.lang.String benefitType, java.lang.String productName) {
		this.membershipType = membershipType;
		this.salary = salary;
		this.premiumAmount = premiumAmount;
		this.salaryBand = salaryBand;
		this.coverage = coverage;
		this.benefitType = benefitType;
		this.productName = productName;
	}

}