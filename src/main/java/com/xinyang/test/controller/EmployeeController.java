package com.xinyang.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xinyang.test.bean.Employee;
import com.xinyang.test.service.EmployeeService;
/**
 * 
 * @author admin
 *
 */
@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	/**
	 * 查询员工数据（分页查询)
	 * @return
	 */
	@RequestMapping("/emps")
	public String getEmps() {
		List<Employee>  emps=employeeService.getAll();
		return "list";
	}
}
