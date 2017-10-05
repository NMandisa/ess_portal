/**
 * 
 */
package za.co.fynbos.ess.portal.excel.read;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
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
	
   public List<Employee> EmployeeExcelRead() throws IOException {
		List<Employee> employees = new ArrayList<>();
        InputStream inputStream = getClass().getResourceAsStream("C:/Users/TCS/git/ess_portal/ess_portal/src/main/resources/sample_data.xlsx");
        Workbook workbook = new XSSFWorkbook("C:/Users/TCS/git/ess_portal/ess_portal/src/main/resources/sample_data.xlsx");
        //Workbook workbook = getWorkbook(inputStream, "data.xls");
        
        Sheet employeeSheet = workbook.getSheetAt(0);
        Iterator<Row> iterator = employeeSheet.iterator();

        while (iterator.hasNext()) {
            Row nextRow = iterator.next();
            Iterator<Cell> cellIterator = nextRow.cellIterator();
            Employee tempEmployee = new Employee();

            while (cellIterator.hasNext()) {
                Cell nextCell = cellIterator.next();
                int columnIndex = nextCell.getColumnIndex();

                switch (columnIndex) {
                    case 0:
                    	tempEmployee.setName(nextCell.getStringCellValue());
                    	System.out.print(nextCell.getStringCellValue() +" | ");
                        break;
                    case 1:
                    	tempEmployee.setSurname(nextCell.getStringCellValue());
                    	System.out.print(nextCell.getStringCellValue() +" | ");
                        break;
                    case 2:
                    	tempEmployee.setDob(nextCell.getStringCellValue());
                    	System.out.print(nextCell.getStringCellValue() +" | ");
                        break;
                    case 3:
                    	tempEmployee.setEmployeeNum(nextCell.getStringCellValue());
                    	System.out.print(nextCell.getStringCellValue() +" | ");
                        break;
                }}
            if(!"Name".equals(tempEmployee.getName()))employees.add(tempEmployee);
        }
        //System.out.println("");
		return employees;
		

    }//EmployeeExcelRead

}//EmployeeExcelRead
