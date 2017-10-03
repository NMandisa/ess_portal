package za.co.fynbos.ess.portal.repository;

import org.springframework.data.repository.CrudRepository;
import za.co.fynbos.ess.portal.domain.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {

}