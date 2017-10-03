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
}