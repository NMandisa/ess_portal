package za.co.fynbos.ess.portal.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author NMandisa Mkhungo
 *
 */
@Entity
public class Employee implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long employeeId;
	private String name;
	private String surname;
	private String dob;
	private String employeeNum;

	public Employee() {}
	public Employee(Long employeeId) {
		this.employeeId = employeeId;
	}
	public Employee(Long employeeId,String name) {
		this.employeeId = employeeId;
		this.name = name;
	}
	public Employee(Long employeeId,String name,String surname) {
		this.employeeId = employeeId;
		this.name = name;
		this.surname = surname;
	}
	public Employee(Long employeeId,String name,String surname,String dob) {
		this.employeeId = employeeId;
		this.name = name;
		this.surname = surname;
		this.dob = dob;
	}
	public Employee(Long employeeId,String name,String surname,String dob,String employeeNum) {
		this.employeeId = employeeId;
		this.name = name;
		this.surname = surname;
		this.dob = dob;
		this.employeeNum = employeeNum;
	}
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmployeeNum() {
		return employeeNum;
	}
	public void setEmployeeNum(String employeeNum) {
		this.employeeNum = employeeNum;
	}
}
