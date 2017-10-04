package za.co.fynbos.ess.portal.dao;

import java.util.List;

import za.co.fynbos.ess.portal.domain.Employee;

/**
 * @author NMandisa Mkhungo
 *
 */
public interface EmployeeDAO {
	
	Employee insertEmployee(Employee employee);
	List<Employee> selectAllEmployees();
	boolean deleteEmployee();
	Employee findEmployee(String employeeNum);
	boolean updateEmployee();
	  
}
