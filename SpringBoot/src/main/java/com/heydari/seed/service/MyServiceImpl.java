package com.heydari.seed.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.heydari.seed.Employee;
import com.heydari.seed.dao.MyServiceDao;

@Component
public class MyServiceImpl implements MyService {
	@Autowired
	public MyServiceDao myServiceDao;
	
	@Override
	public List<Employee> getName() {
		// TODO Auto-generated method stub
		return myServiceDao.getEmployeeByID("ravi");
	}

}
