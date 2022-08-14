package excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class totalrowandtotalcells {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile= new File("E:\\selenium\\RupaliExcelforSelenium.xlsx");
		Workbook myWB = WorkbookFactory.create(myfile);
		Sheet mysheet = myWB.getSheet("Sheet3");
		int totalrows = mysheet.getLastRowNum();
		System.out.println("total no of rows"+totalrows);
		int totalcell = mysheet.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<=totalrows;i++)  //outer loop rows
		{
			for(int j=0;j<=totalcell;j++)  //inner loop cell
			{
					String value = mysheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(value+" ");
			}
			System.out.println();
		}
	
	}

}
