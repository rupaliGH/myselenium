package excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook; 
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readingvalues {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile= new File("E:\\selenium\\RupaliExcelforSelenium.xlsx");
		Workbook myWB = WorkbookFactory.create(myfile);
		Sheet mysheet = myWB.getSheet("First");
		//reading numeric value
         double value = mysheet.getRow(0).getCell(0).getNumericCellValue();
         System.out.println(value);
        
         
       //reading boolean value 
         Cell mycell = mysheet.getRow(0).getCell(1);
         System.out.println(mycell.getCellType());
         System.out.println(mycell.getBooleanCellValue());
         
       //reading string cell Value 
         Cell mycell1 = mysheet.getRow(0).getCell(2);
         System.out.println(mycell1.getCellType());
         System.out.println(mycell1.getStringCellValue());
       
	}

}
