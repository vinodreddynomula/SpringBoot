package com.heydari.seed.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.heydari.seed.Employee;

@Repository
public class MyserviceDaoImpl implements MyServiceDao{

	@Override
	public List<Employee> getEmployeeByID(String name) {
		Employee obj = new Employee();
		obj.setName("ravi");
		obj.setDept("IT");
		Employee obj1 = new Employee();
		obj1.setName("ravi");
		obj1.setDept("IT");
		Employee obj2 = new Employee();
		obj2.setName("ravi");
		obj2.setDept("IT");
		Employee obj3 = new Employee();
		obj3.setName("ravi");
		obj3.setDept("IT");
		Employee obj4 = new Employee();
		obj3.setName("ravi");
		obj3.setDept("IT");
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(obj);
		empList.add(obj1);
		empList.add(obj2);
		empList.add(obj3);
		empList.add(obj4);
		return empList;
	}

}
