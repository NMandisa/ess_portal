package za.co.fynbos.ess.portal.service;

import java.util.List;

import za.co.fynbos.ess.portal.domain.Employee;

/**
 * @author NMandisa Mkhungo
 *
 */
public interface EmployeeService {

	Employee addEmployee(Employee employee);

	List<Employee> getAllEmployee();
}