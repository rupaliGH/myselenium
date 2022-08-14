package excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exceleg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myfile= new File("E:\\selenium\\RupaliExcelforSelenium.xlsx");
		Workbook myWB = WorkbookFactory.create(myfile);
		Sheet mysheet = myWB.getSheet("Sheet4");
		Row myrow = mysheet.getRow(0);
		Cell mycell = myrow.getCell(0);
		CellType celltypeinfo = mycell.getCellType();
		System.out.println(celltypeinfo);
		System.out.println();
		System.out.println(mysheet.getRow(0).getCell(1).getStringCellValue());

	}

}
