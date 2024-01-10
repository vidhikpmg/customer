package com.acceval.integration.customer.entity;

import java.io.Serializable;

import javax.persistence.Column;

public class CustomerMasterYourCompositeKey implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "CUSTCODE")
	private String custCode;
	@Column(name = "SALESORG")
	private String salesOrg;
	@Column(name = "DISTCHNL")
	private String distChnl;
	@Column(name = "DIVISION")
	private String division;

	public String getCustCode() {
		return custCode;
	}

	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}

	public String getSalesOrg() {
		return salesOrg;
	}

	public void setSalesOrg(String salesOrg) {
		this.salesOrg = salesOrg;
	}

	public String getDistChnl() {
		return distChnl;
	}

	public void setDistChnl(String distChnl) {
		this.distChnl = distChnl;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

}
