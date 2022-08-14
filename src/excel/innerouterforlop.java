package excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class innerouterforlop {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myfile= new File("E:\\selenium\\RupaliExcelforSelenium.xlsx");
		Workbook myWB = WorkbookFactory.create(myfile);
		Sheet mysheet = myWB.getSheet("Sheet3");
		
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=1;j++)
			{
				String value = mysheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" || ");
				
			}
			System.out.println();
		}
	}

}
