package za.co.fynbos.ess.portal.repository;

import org.springframework.data.repository.CrudRepository;
import za.co.fynbos.ess.portal.domain.Employee;

/**
 * @author NMandisa Mkhungo
 *
 */
public interface EmployeeRepository extends CrudRepository<Employee,Long> {

}