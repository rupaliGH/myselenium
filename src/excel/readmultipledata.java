package excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readmultipledata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile= new File("E:\\selenium\\RupaliExcelforSelenium.xlsx");
		Workbook myWB = WorkbookFactory.create(myfile);
		Sheet mysheet = myWB.getSheet("Sheet3");
		//reading multiple data from single row
		for(int i=0;i<=3;i++)
		{
			String value = mysheet.getRow(0).getCell(i).getStringCellValue();
			System.out.println(value+" ");
		}
		//reading multiple data from single column
		for(int i=0;i<=1;i++)
		{
			String value = mysheet.getRow(i).getCell(0).getStringCellValue();
			System.out.print(value+" ");
		}
         System.out.println();
	}

}
