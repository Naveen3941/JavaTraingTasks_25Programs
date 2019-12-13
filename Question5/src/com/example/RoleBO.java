package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class RoleBO {
	static int highest = 0;

	void display(Role[] role) {
		int m = 0;
		System.out.println("entered....");

		TreeSet<String> t1 = new TreeSet<>();

		List<Role> l1 = Arrays.asList(role);

		for (Role e1 : l1) {
			Privilege[] privilege = e1.getPrivilege();
			String name = privilege[m].getName();
			String a1 = e1.getName();
			String a2[] = name.split(",");

			if (highest < a2.length) {
				highest = a2.length;
			}
			if (a2.length > 2) {
				t1.add(a1);
			}
			m++;
		}

		for (String s : t1) {
			System.out.println(s + "????????????");
		}

	}
}
