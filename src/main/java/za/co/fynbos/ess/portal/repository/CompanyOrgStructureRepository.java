package za.co.fynbos.ess.portal.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import za.co.fynbos.ess.portal.domain.CompanyOrgStructure;

/**
 * @author NMandisa Mkhungo
 *
 */
public interface CompanyOrgStructureRepository extends CrudRepository<CompanyOrgStructure, Long> {

	@Override
	List<CompanyOrgStructure> findAll();

	@Override
	CompanyOrgStructure findOne(Long companyOrgStructureId);
}