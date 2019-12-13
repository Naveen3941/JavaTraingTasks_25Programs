package com.example;

public class AgentBo {
	private int count = 0;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void displayAgentDetailsByCompany(String name, AgentCompanyFee[] agentCompanyFee) {
		String name1 = name;

		AgentCompanyFee a1[] = agentCompanyFee;

		for (int i = 0; i < count; i++) {

			if (a1[i].getCompany().getCompanyName().equals(name1)) {

				System.out.println(a1[i].getAgent().getName() + "    " + a1[i].getFees());
				
			}
		}

	}

	public void displayCompanyDetailsByAgent(String name, AgentCompanyFee[] agentCompanyFee) {

		String name1 = name;

		AgentCompanyFee a1[] = agentCompanyFee;

		for (int i = 0; i < count; i++) {

			if (a1[i].getAgent().getName().equals(name1)) {

				System.out.println(a1[i].getCompany().getCompanyName() + "    " + a1[i].getFees());
			}
		}

	}
}
