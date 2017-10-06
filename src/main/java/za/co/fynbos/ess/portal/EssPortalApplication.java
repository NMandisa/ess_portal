package za.co.fynbos.ess.portal;


import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import za.co.fynbos.ess.portal.dao.impl.DefaultEmployeeDAO;
import za.co.fynbos.ess.portal.excel.read.EmployeeExcelRead;


@SpringBootApplication
public class EssPortalApplication {
	
	
	
	
	public static void main(String[] args) throws IOException {
		SpringApplication.run(EssPortalApplication.class, args);
		
		 //System.out.println("*******************************************************");
		// System.out.println("|___________________| You Are Here |___________________|");
		// System.out.println("*******************************************************"); 
		new DefaultEmployeeDAO().importAllEmployees();
		new DefaultEmployeeDAO().selectAllEmployees();
	}
}
