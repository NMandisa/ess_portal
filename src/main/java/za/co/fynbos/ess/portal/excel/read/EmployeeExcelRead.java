/**
 * 
 */
package za.co.fynbos.ess.portal.excel.read;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import za.co.fynbos.ess.portal.domain.Employee;

/**
 * @author NMandisa Mkhungo
 *
 */
public class EmployeeExcelRead {
	
	public List<Employee> EmployeeExcelRead(String filename) {
	
    try {

        FileInputStream excelFile = new FileInputStream(new File(filename));
        Workbook workbook = new XSSFWorkbook(excelFile);

        Sheet employeeDataSheet = workbook.getSheetAt(0);
        List<Employee> employees = new ArrayList<>();//Initailizing a list of employees
        Iterator<Row> iterator = employeeDataSheet.iterator();

        while (iterator.hasNext()) {

            Row currentRow = iterator.next();
            Iterator<Cell> cellIterator = currentRow.iterator();
            
            Employee tempEmployee = new Employee();//Initializing and Employee Object everytime it loops through        
            
            while (cellIterator.hasNext()) {

                Cell currentCell = cellIterator.next();
                int columnIndex = currentCell.getColumnIndex();
                
                switch (columnIndex) {
                case 0 : 
                	tempEmployee.setName((String)currentCell.getStringCellValue());
                break;
                case 1 :
                	tempEmployee.setSurname((String)currentCell.getStringCellValue());
                
                break;
                case 2 :
                	tempEmployee.setDob((String)currentCell.getStringCellValue());
                break;
                case 3 :
                	System.out.println("*******************************************************");
            		System.out.println("|___________________| You Are Here |___________________|");
            		System.out.println("*******************************************************");
                	tempEmployee.setEmployeeNum((String)currentCell.getStringCellValue());
                break;
                }
                if(!"Name".equals(tempEmployee.getName())) 
                   employees.add(tempEmployee);
                
                
                
                //if (currentCell.getCellTypeEnum() == CellType.STRING) {
                 //   System.out.print(currentCell.getStringCellValue() + " | ");
               // } else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
                  //  System.out.print(currentCell.getNumericCellValue() + " | ");
                //}

            
            System.out.println();
            return employees;
        }}    } catch (FileNotFoundException exception) {
        exception.printStackTrace();
        return null;
    } catch (IOException exception) {
        exception.printStackTrace();
        return null;
    }
	return null;

}

}
