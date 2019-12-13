package com.example;

public class AgentCompanyFee {
	private Agent agent;
	private Company company;
	private Integer fees;
	
	public AgentCompanyFee() {
		super();
	}
	public AgentCompanyFee(Agent agent, Company company, Integer fees) {
		super();
		this.agent = agent;
		this.company = company;
		this.fees = fees;
	}
	public Agent getAgent() {
		return agent;
	}
	public void setAgent(Agent agent) {
		this.agent = agent;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Integer getFees() {
		return fees;
	}
	public void setFees(Integer fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "AgentCompanyFee [agent=" + agent + ", company=" + company + ", fees=" + fees + "]";
	}
	

}
