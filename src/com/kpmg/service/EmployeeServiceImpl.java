package com.kpmg.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.kpmg.bean.Employee;

public class EmployeeServiceImpl implements EmployeeRepo {

	// Set<Employee> e= new HashSet<>();
	Employee e = new Employee(1, "Amit", "Java Department");
	Employee e1 = new Employee(2, "vinod", "It Department");
	Employee e2 = new Employee(3, "Sasi", "Managing Department");

	// Ma<Employee> emp= new HashSet<>(Set.of(e, e1, e2));
	Map<Integer, Employee> map = new HashMap<>(Map.of(101, e, 102, e1, 103, e2));

	@Override
	public void listEmp() {
		// TODO Auto-generated method stub
		for (Entry m : map.entrySet()) {

			System.out.println("value of collection here -->" + m.getKey() + "" + m.getValue());

		}
	}

	@Override
	public void updateEmp(int id, String name) {
		// TODO Auto-generated method stub

		for (Entry<Integer, Employee> m : map.entrySet()) {

			if (m.getKey().equals(id)) {
				Employee e = m.getValue();
				e.setEmpName(name);
				map.put(id, e);
			}
		}
		for (Entry m : map.entrySet()) {

			System.out.println("value of collection here -->" + m.getKey() + "" + m.getValue());

		}

	}

	@Override
	public void removeEmp(int id) {
		// TODO Auto-generated method stub

		if (map.containsKey(id)){
			map.remove(id);
		}
		for (Entry m : map.entrySet()) {

			System.out.println("value of collection here -->" + m.getKey() + "" + m.getValue());

		}

	}

	@Override
	public void createEmp(int id, String name, String edept, int empKey) {
		// TODO Auto-generated method stub

		Employee employee = new Employee();
		employee.setEmpName(name);
		employee.setEmpId(id);
		employee.setEmpDepartment(edept);
		try {
			map.put(empKey, employee);
			System.out.println("Employee Added Successfully");

			for (Entry m : map.entrySet()) {

				System.out.println("value of collection here -->" + m.getKey() + "" + m.getValue());

			}
		} catch (Exception ex) {
			// TODO: handle exception
			System.out.println("Exception message " + ex.getMessage());
		}

	}

}
