package za.co.fynbos.ess.portal.dao;

import java.util.List;

import za.co.fynbos.ess.portal.domain.Employee;

/**
 * @author NMandisa Mkhungo
 *
 */
public interface EmployeeDAO {
	
	Employee addEmployee(Employee employee);

	List<Employee> getAllEmployee();
}
