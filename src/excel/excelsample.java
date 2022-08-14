package excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class excelsample 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
      File myfile= new File("E:\\selenium\\RupaliExcelforSelenium.xlsx");
      String value = WorkbookFactory.create(myfile).getSheet("First").getRow(0).getCell(0).getStringCellValue();
       System.out.println(value);
       
       String value1 = WorkbookFactory.create(myfile).getSheet("First").getRow(0).getCell(1).getStringCellValue();
       System.out.println(value1);
       
       String value2 = WorkbookFactory.create(myfile).getSheet("First").getRow(1).getCell(0).getStringCellValue();
       System.out.println(value2);
       
       
       
       System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("autocomplete")).sendKeys(value2);
        
	}

}
