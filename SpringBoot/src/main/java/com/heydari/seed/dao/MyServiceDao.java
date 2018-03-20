package com.heydari.seed.dao;

import java.util.List;

import com.heydari.seed.Employee;

public interface MyServiceDao {
	
	public List<Employee> getEmployeeByID(String name);

}
