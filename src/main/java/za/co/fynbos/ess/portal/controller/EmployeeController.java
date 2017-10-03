package za.co.fynbos.ess.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
	
	
}