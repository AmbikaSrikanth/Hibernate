package com.hb.entity;

import java.io.Serializable;

public class InsurancePolicy  implements Serializable{
	private int policyId;
	private String policyName;
	private int tenture;
	private int closingTime;
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public int getTenture() {
		return tenture;
	}
	public void setTenture(int tenture) {
		this.tenture = tenture;
	}
	public int getClosingTime() {
		return closingTime;
	}
	public void setClosingTime(int closingTime) {
		this.closingTime = closingTime;
	}
	//comment
	

}
