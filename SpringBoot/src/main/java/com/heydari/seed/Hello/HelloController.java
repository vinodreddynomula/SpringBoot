package com.heydari.seed.Hello;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.heydari.seed.Employee;
import com.heydari.seed.service.MyService;


@RequestMapping("/hello")
@RestController
public class HelloController {
	@Autowired
	MyService myService;
	
	@RequestMapping(value="/getEmployee", method = RequestMethod.GET,produces="application/json")
	public List<Employee> getEmployee(Pageable pageable) {
		return myService.getName();
	}
	
	@RequestMapping(value="/showData",method = RequestMethod.POST,produces="application/json")
	@ResponseBody
	public Employee showData( MultipartHttpServletRequest request){
		
		return null;
	}
}

