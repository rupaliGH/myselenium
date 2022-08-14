package framework;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kitetesting {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		File myfile= new File("E:\\selenium\\RupaliExcelforSelenium.xlsx");
		Workbook myWB = WorkbookFactory.create(myfile);
		Sheet mysheet = myWB.getSheet("kite");
		
	    String UID = mysheet.getRow(0).getCell(0).getStringCellValue();
	    String PWD = mysheet.getRow(0).getCell(1).getStringCellValue();
	    String PIN = mysheet.getRow(0).getCell(2).getStringCellValue();
						
        WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(1000);
		
		WebElement userid = driver.findElement(By.id("userid"));

		WebElement password = driver.findElement(By.id("password"));
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		userid.sendKeys(UID);
		password.sendKeys(PWD);
		loginbutton.click();
		Thread.sleep(1000);
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement continuebutton = driver.findElement(By.xpath("//button[@type='submit']"));
		pin.sendKeys(PIN);
		continuebutton.click();
		Thread.sleep(1000);
		
		WebElement ID = driver.findElement(By.xpath("//span[@class='user-id']"));
		String expectedID = "ELR321";
		String actualid = ID.getText();
		Thread.sleep(1000);
		
		if(expectedID.equals(actualid))
		{
			System.out.println("Test Case is pass");
		}
	else
	{
		System.out.println("test case is fail");
	}
		ID.click();	
		Thread.sleep(1000);
		WebElement logout = driver.findElement(By.xpath("//a[@target='_self']"));
		logout.click();
		Thread.sleep(1000); 
		
		
	
	}

}
