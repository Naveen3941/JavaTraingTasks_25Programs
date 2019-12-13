package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class MainClass {

	public static void main(String[] args) throws IOException, NullPointerException {
		int c_id = 501;
		int cz = 0;

		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader sc = new BufferedReader(r);

		Scanner sc1 = new Scanner(System.in);
		CopyOnWriteArrayList<AgentCompanyFee> l1 = new CopyOnWriteArrayList<>();

		List<Agent> l2 = new ArrayList<>();
		HashMap<String, Integer> h1 = new HashMap<>();
		AgentBo ab1 = new AgentBo();
		System.out.println("Enter the number of agents :");
		int n = sc1.nextInt();
		int a;
		AgentCompanyFee abd1[] = new AgentCompanyFee[n];
		for (int i = 1; i <= n; i++) {
			System.out.println("Select the company where the agent " + i + " is going to work :");
			System.out.println("1. Titanic");
			System.out.println("2. Arcadia");
			System.out.println("3. Umbrella corporation");
			System.out.println("4. Omnicorp");
			System.out.println("Enter your choice");
			a = sc1.nextInt();

			System.out.println("1. New Agent");
			System.out.println("2. Existing Agent");
			System.out.println("Enter the choice");
			String com[] = { "Titanic", "Arcadia", "Umbrella corporation", "Omnicorp" };
			int b = sc1.nextInt();
			if (b == 1) {
				System.out.println("Enter the agent details :");
				String c = sc.readLine();
				String res[] = c.split(",");
				String id = res[0];
				String name = res[1];
				String address = res[2];
				System.out.println("Enter the fee of the agent :");
				int fee = sc1.nextInt();
				l1.add(new AgentCompanyFee(new Agent(com[a - 1], id, address, name),
						new Company(c_id, id, address, com[a - 1]), fee));
				c_id++;

			}

			else {
				System.out.println("Enter the name :");
				String ename = sc.readLine();
				System.out.println("Enter the fee of the agent :");
				int efee = sc1.nextInt();
				for (AgentCompanyFee a12 : l1) {
					if (a12.getAgent().getName().equals(ename)) {

						l1.add(new AgentCompanyFee(
								new Agent(com[a - 1], a12.getAgent().getIataCode(), a12.getAgent().getAddress(),
										a12.getAgent().getName()),
								new Company(a12.getCompany().getId(), a12.getCompany().getFmcCode(),
										a12.getCompany().getAddress(), com[a - 1]),
								efee));

					}
				}

			}
		}

		int y = 0;
		for (AgentCompanyFee a1 : l1) {
			abd1[y] = a1;
			y++;
			cz = cz + 1;

		}
		ab1.setCount(cz);

		System.out.println("Search:");
		System.out.println("1. Find agents");
		System.out.println("2. Find companies");
		int sn = sc1.nextInt();
		if (sn == 1) {
			System.out.println("Enter the company name :");
			String sname = sc.readLine();
			System.out.println("Company has");

			ab1.displayAgentDetailsByCompany(sname, abd1);

		} else

		{
			System.out.println("Enter the agent name :");
			String agentname = sc.readLine();
			System.out.println("Agent works for");

			ab1.displayCompanyDetailsByAgent(agentname, abd1);
		}

	}

}
