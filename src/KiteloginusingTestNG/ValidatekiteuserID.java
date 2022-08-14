package KiteloginusingTestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ValidatekiteuserID
{
	
	WebDriver driver=null;
	File myfile;
	Sheet mysheet;
	kiteloginpage login;
	kitepinpage pin;
	kitehomepage home;
	
	@Parameters("browsername")
	@BeforeClass
	
	public void LaunchBrowser(String browsername) throws EncryptedDocumentException, IOException
	{
		
         if(browsername.equals("chrome"))
         {
        	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
     		driver=new ChromeDriver();
        	 
         }
		else if (browsername.equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver.exe");
		    driver= new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Reporter.log("Launching Kite App",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	    myfile= new File("E:\\selenium\\RupaliExcelforSelenium.xlsx");
	    mysheet=WorkbookFactory.create(myfile).getSheet("kite");
	    login = new kiteloginpage(driver);
	    pin = new kitepinpage(driver);
	    home= new kitehomepage(driver);
	    
	    
	    
	}
	@BeforeMethod
	public void LogintoKite()
	{
		login.senduserid(mysheet.getRow(0).getCell(0).getStringCellValue());
		Reporter.log("Entering User ID",true);
		login.sendpassword(mysheet.getRow(0).getCell(1).getStringCellValue());
		Reporter.log("Entering Password",true);
		login.clickonlogbutton();
		Reporter.log("Clicking on login button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		pin.sendpin(mysheet.getRow(0).getCell(2).getStringCellValue());
		Reporter.log("Entering PIN",true);
		pin.clickoncontinuebutton();
		Reporter.log("Clicking on continue button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	
  @Test
  public void ValidateUserID()
  {
	 String expecteduserID=mysheet.getRow(0).getCell(0).getStringCellValue();
	 String actualUserID=home.getActualUserID();
	 Reporter.log(" Validating actualUserID and expected UserID",true);
	 
	 Assert.assertEquals(actualUserID, expecteduserID,"TC failled actual and expected UserID not matching ");
	 Reporter.log("validated actual and expected userID TC is passed",true);
	 
  }
  @AfterMethod
  public void logoutkite() throws InterruptedException
  {
	  home.clickonlogoutbutton();
	  Reporter.log("clicking on logout button",true);
	  Thread.sleep(2000);
	  
  }
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("Closing Browser");
	  driver.close();
  }
}
