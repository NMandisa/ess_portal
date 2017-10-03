package za.co.fynbos.ess.portal.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author NMandisa Mkhungo
 *
 */
@Entity
public class EmployeeSalary implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long empSalId;
	private String grade;
	private double salary;

	public Long getEmpSalId() {
		return empSalId;
	}

	public void setEmpSalId(Long empSalId) {
		this.empSalId = empSalId;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
