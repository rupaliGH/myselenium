package Utilityclasskitenew;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Reporter;

public class utility 
{
	public static String readdatafromexcel(int rownum,int cellnum) throws EncryptedDocumentException, IOException
	{
	File myfile = new File("E:\\selenium\\RupaliExcelforSelenium.xlsx");
	Reporter.log("Reading data from Excel",true);
	String value = WorkbookFactory.create(myfile).getSheet("kite").getRow(rownum).getCell(cellnum).getStringCellValue();	
	return value;
	}
	
	public static void captureScreenshot(WebDriver driver , String TCID) throws IOException
	{
		File SRC = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File DEST=new File("E:\\selenium\\Screenshots\\TC"+TCID+".png");
		FileHandler.copy(SRC, DEST);
		Reporter.log("Taken Screenshot",true);
	}
	public static Timeouts waits(WebDriver driver, int seconds)
	{
		Timeouts Wait = driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    return Wait;
	}
}
