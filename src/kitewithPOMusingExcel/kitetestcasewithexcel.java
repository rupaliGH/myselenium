package kitewithPOMusingExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class kitetestcasewithexcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		
		ChromeOptions cp=new ChromeOptions();
		
		//cp.addArguments("--headless");
		cp.addArguments("incognito");
		cp.addArguments("start-maximized");
		cp.addArguments("disable-extensions");
		cp.addArguments("version");
		cp.addArguments("disable-infobars");
		
		WebDriver driver= new ChromeDriver(cp);
		
		//driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(1000);
		
		File myfile= new File("E:\\selenium\\RupaliExcelforSelenium.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("kite");
		String UN=mysheet.getRow(0).getCell(0).getStringCellValue();
		
		kiteloginpage login= new kiteloginpage(driver);
		login.senduserid(UN);
		login.sendpassword(mysheet.getRow(0).getCell(1).getStringCellValue());
		login.clickonlogbutton();
		Thread.sleep(1000);
		
		kitepinpage pin= new kitepinpage(driver);
		pin.sendpin(mysheet.getRow(0).getCell(2).getStringCellValue());
		pin.clickoncontinuebutton();
		Thread.sleep(1000);
		
		kitehomepage home= new kitehomepage(driver);
		home.validateuserid(mysheet.getRow(0).getCell(0).getStringCellValue());
		home.clickonlogoutbutton();
		Thread.sleep(1000);
		driver.close();
	}

}
