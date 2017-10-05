/**
 * 
 */
package za.co.fynbos.ess.portal.dao.impl;


import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import za.co.fynbos.ess.portal.dao.EmployeeDAO;
import za.co.fynbos.ess.portal.domain.Employee;
import za.co.fynbos.ess.portal.excel.read.EmployeeExcelRead;
import za.co.fynbos.ess.portal.repository.EmployeeRepository;

/**
 * @author NMandisa Mkhungo
 *
 */
public class DefaultEmployeeDAO implements EmployeeDAO{

	@Autowired(required = true)
	private EmployeeRepository employeeRepository;

	@Override
	public Employee insertEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> selectAllEmployees() {
		return employeeRepository.findAll();
	}


	@Override
	public boolean deleteEmployee() {
		// TODO Auto-generated method stub
		return false;
	}

	
	@Override
	public Employee findEmployee(String employeeNum) {
		return employeeRepository.findByEmployeeNum(employeeNum);
	}

	@Override
	public boolean updateEmployee() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public List<Employee> importAllEmployees() {
		try {
		        List<Employee> employees = new EmployeeExcelRead().EmployeeExcelRead();
		            Iterator<Employee> employeeIterator = employees.iterator();
		            Employee tempEmployee = new Employee();
		            while(employeeIterator.hasNext())
		            {
		            	tempEmployee = employeeIterator.next();
		            	System.out.println("Name : "+tempEmployee.getName()+" Surname :"+tempEmployee.getSurname()+" DoB :"+tempEmployee.getDob()+" Emp Num :"+tempEmployee.getEmployeeNum());
		                //employeeRepository.save(tempEmployee);
		                insertEmployee(tempEmployee);
		            }
		     
		return employees;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}  
}
