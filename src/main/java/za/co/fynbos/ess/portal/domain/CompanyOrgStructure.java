package za.co.fynbos.ess.portal.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CompanyOrgStructure implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long companyOrgStructureId;
	private String grade;
	private String title;
	private String employeeNum;
	
	
	public Long getCompanyOrgStructureId() {
		return companyOrgStructureId;
	}
	public void setCompanyOrgStructureId(Long companyOrgStructureId) {
		this.companyOrgStructureId = companyOrgStructureId;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmployeeNum() {
		return employeeNum;
	}
	public void setEmployeeNum(String employeeNum) {
		this.employeeNum = employeeNum;
	}

}
