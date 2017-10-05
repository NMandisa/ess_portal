package za.co.fynbos.ess.portal;

import java.io.Console;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import za.co.fynbos.ess.portal.domain.Employee;
import za.co.fynbos.ess.portal.excel.read.EmployeeExcelRead;


@SpringBootApplication
public class EssPortalApplication {
	
	
	
	
	public static void main(String[] args) throws IOException {
		SpringApplication.run(EssPortalApplication.class, args);
		
		 //System.out.println("*******************************************************");
		// System.out.println("|___________________| You Are Here |___________________|");
		// System.out.println("*******************************************************");
		EmployeeExcelRead employeeExcelRead = new EmployeeExcelRead();
		employeeExcelRead.EmployeeExcelRead(); 
		//Iterator it = employees.iterator();
		//Employee tempEmployee = new Employee();
		  //while(it.hasNext())
		//  {
		    // tempEmployee = (Employee) it.next();
		  
		    //System.out.println("*******************************************************");
		    //System.out.println("| You Are Here |");
		    //System.out.println("*******************************************************");
		  //}
	}
}
