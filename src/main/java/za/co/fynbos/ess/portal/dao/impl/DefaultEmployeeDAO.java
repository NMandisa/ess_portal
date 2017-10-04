/**
 * 
 */
package za.co.fynbos.ess.portal.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import za.co.fynbos.ess.portal.dao.EmployeeDAO;
import za.co.fynbos.ess.portal.domain.Employee;
import za.co.fynbos.ess.portal.repository.EmployeeRepository;

/**
 * @author NMandisa Mkhungo
 *
 */
public class DefaultEmployeeDAO implements EmployeeDAO{

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
