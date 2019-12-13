package com.example;

public class CompanyBO {
	
	public void displayCompanyDetails(Company[] companies)
	{
		System.out.format("%-15s %-15s %-15s %-15s %-15s","Company ID","IATA Code",
				"FMC Code","State","Country");
		System.out.println();
		for(Company c1:companies)
		{
			System.out.println(c1);
		}

	}

}
