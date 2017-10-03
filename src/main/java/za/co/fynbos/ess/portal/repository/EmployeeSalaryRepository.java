package za.co.fynbos.ess.portal.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import za.co.fynbos.ess.portal.domain.EmployeeSalary;

/**
 * @author NMandisa Mkhungo
 *
 */
public interface EmployeeSalaryRepository extends CrudRepository<EmployeeSalary, Long> {

	@Override
	List<EmployeeSalary> findAll();
	
	@Override
	EmployeeSalary findOne(Long empSalId);
}