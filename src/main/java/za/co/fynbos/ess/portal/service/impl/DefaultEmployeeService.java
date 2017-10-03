package za.co.fynbos.ess.portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.co.fynbos.ess.portal.domain.Employee;
import za.co.fynbos.ess.portal.repository.EmployeeRepository;
import za.co.fynbos.ess.portal.service.EmployeeService;

/**
 * @author NMandisa Mkhungo
 *
 */

@Service
public class DefaultEmployeeService implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}
}