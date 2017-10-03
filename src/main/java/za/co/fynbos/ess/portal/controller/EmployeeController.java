package za.co.fynbos.ess.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import za.co.fynbos.ess.portal.domain.Employee;
import za.co.fynbos.ess.portal.service.EmployeeService;

/**
 * @author NMandisa Mkhungo
 *
 */

@CrossOrigin(allowedHeaders = {"*" }, origins = "*")
@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployee();
    }
	
} 