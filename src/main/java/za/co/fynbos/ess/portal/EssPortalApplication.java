package za.co.fynbos.ess.portal;

import java.io.Console;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import za.co.fynbos.ess.portal.domain.Employee;
import za.co.fynbos.ess.portal.excel.read.EmployeeExcelRead;


@SpringBootApplication
public class EssPortalApplication {
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(EssPortalApplication.class, args);
		
		 //System.out.println("*******************************************************");
		// System.out.println("|___________________| You Are Here |___________________|");
		// System.out.println("*******************************************************");
		EmployeeExcelRead employeeExcelRead = new EmployeeExcelRead();
		List<Employee> employees = employeeExcelRead.EmployeeExcelRead(System.getProperty("user.dir")+"/src/main/resources/sample_data.xlsx");
		Iterator it = employees.iterator();
		Employee tempEmployee = new Employee();
		  while(it.hasNext())
		  {
		    tempEmployee = (Employee) it.next();
		  
		    //System.out.println("*******************************************************");
		    //System.out.println("| You Are Here |");
		    //System.out.println("*******************************************************");
		  }
	}
}
