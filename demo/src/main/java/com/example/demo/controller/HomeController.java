package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

@RestController
public class HomeController {
	
	/*
	 * Postman : To Test your Restful API'S
	 */
	
	/*
	 * Http Methods
	 * 1)GET    : To Access Resource                    : @GetMapping
	 * 2)POST   : To Post Data To Server                : @PostMapping
	 * 3)PUT    : To Post or To Update Data In Server   : @PutMapping
	 * 4)PATCH  : Partial Update                        : @PatchMapping
	 * 5)DELETE : To Delete Resource                    : @DeleteMapping
	 */

	/*
	 * http://localhost:8080/home
	 */
	@GetMapping(value = "/home")
	public String welcome() {
		String msg = "<h3 style='text-align:center;color:blue'>Welcome To First Spring Restful API</h3>";
		return msg;
	}

	/*
	 * http://localhost:8080/oneEmployee
	 */
	@GetMapping(value = "/oneEmployee")
	public Employee getOneEmployee() {
		return new Employee(1, "Prudhvi", "Goa");
	}

	/*
	 * http://localhost:8080/allEmployees
	 */
	@GetMapping(value = "/allEmployees")
	public List<Employee> getAllEmployees() {
		return Arrays.asList(new Employee(1, "Raj", "Bangalore"),
				new Employee(2, "Praveen", "Hyderabad"),
				new Employee(3, "Rajeev", "Goa"));
	}
	
	@PostMapping(value = "/saveEmployee")
	public String saveEmployee(@RequestBody Employee emp)
	{
		return "Thank You For Registering :Your Employee ID:"+emp.getEid();
	}

}
