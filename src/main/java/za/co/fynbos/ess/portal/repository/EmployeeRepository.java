package za.co.fynbos.ess.portal.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import za.co.fynbos.ess.portal.domain.Employee;

/**
 * @author NMandisa Mkhungo
 *
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	@Override
	List<Employee> findAll();

	@Override
	Employee findOne(Long employeeId);
	
	Employee findByEmployeeNum(String employeeNum);
	
	void delete(Long employeeId);
	
	boolean exists(Long employeeId);
	
	List<Employee> findByName(String name);

	  // Enables the distinct flag for the query
	  List<Employee> findDistinctEmployeeBySurnameOrName(String lastname, String firstname);
	  //List<Employee> findPeopleDistinctByLastnameOrFirstname(String lastname, String firstname);

	  // Enabling ignoring case for an individual property
	  List<Employee> findBySurnameIgnoreCase(String surname);
	
	  // Enabling static ORDER BY for a query
	  List<Employee> findBySurnameOrderByNameAsc(String surname);
	  //List<Employee> findBySurnameOrderByNameDesc(String surname);
}