package com.kpmg.client;

import java.util.Scanner;

import com.kpmg.service.EmployeeServiceImpl;

public class EmployeeImpl {

	public static void main(String[] args) {
		EmployeeServiceImpl emp = new EmployeeServiceImpl();
		System.out.println("1. Create /n 2. Update /n 3. Delete /n 4.AllEmployee");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input: ");
		int x=sc.nextInt();
		switch (x) {
		case 1:
			System.out.println("please enter the Employee Details to Add");
			int eid= sc.nextInt();
			String ename= sc.next();
			String eclass = sc.next();
			int key= sc.nextInt();
			emp.createEmp(eid, ename, eclass,key);
			
			break;
		case 2:
			System.out.println("Please enter emp key and empname you wanna update");
			int a= sc.nextInt();
			String  b= sc.next();
			emp.updateEmp(a, b);
			break;
		case 3:
			System.out.println("please enter the key number for Remove the Employee");
			int s = sc.nextInt();
			emp.removeEmp(s);
			
			break;
		case 4:
			emp.listEmp();
			break;
	}
		sc.close();
		}
}
