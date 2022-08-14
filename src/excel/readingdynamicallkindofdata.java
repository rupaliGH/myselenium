package excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readingdynamicallkindofdata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile= new File("E:\\selenium\\RupaliExcelforSelenium.xlsx");
		Workbook myWB = WorkbookFactory.create(myfile);
		Sheet mysheet = myWB.getSheet("second");
		int totnoofrows = mysheet.getLastRowNum();
		int totnoofcells = mysheet.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<=totnoofrows;i++)
		{
			for(int j=0;j<=totnoofcells;j++)
			{
				Cell mycell = mysheet.getRow(i).getCell(j);
				CellType celldatatype = mycell.getCellType();
				if(celldatatype==CellType.STRING)
				{
					String value = mycell.getStringCellValue();
					System.out.print(value+"  ");
					
				}
				else if (celldatatype==CellType.NUMERIC) 
				{
					double value = mycell.getNumericCellValue();
					System.out.print(value+" ");
				}
				else if (celldatatype==celldatatype.BOOLEAN) 
				{
					boolean value = mycell.getBooleanCellValue();
					System.out.print(value+" ");
				}
				else if(celldatatype==CellType.BLANK);
				
			}
			System.out.println();
		}
		
	}

}
