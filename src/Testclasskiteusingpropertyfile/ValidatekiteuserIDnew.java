package Testclasskiteusingpropertyfile;

import java.io.IOException;

import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Baseclasskitenew.Base;
import Baseclassusingpropertyfile.Basenew;
import KiteloginusingTestNG.kitepinpage;
import Utilityclasskitenew.utility;
import Utilitykiteusingpropertyfile.utilitynew;
import kitewithPOMusingExcel.kitehomepage;
import kitewithPOMusingExcel.kiteloginpage;

@Listeners(TestNGListener.Listener.class)
public class ValidatekiteuserIDnew extends Basenew 
{
	 kiteloginpage login;
	 kitepinpage pin;
	 kitehomepage home;
	
  @BeforeClass
  public void LaunchBrowser() throws IOException
  {
	   OpenApplication();
	   login = new kiteloginpage(driver);
	   pin = new kitepinpage(driver);
	   home = new kitehomepage(driver);
  }
  @BeforeMethod
  public void logintoKiteApp() throws EncryptedDocumentException, IOException, InterruptedException
  {
	  login.senduserid(utilitynew.readDatafromPropertyFile("UN"));
	  login.sendpassword(utilitynew.readDatafromPropertyFile("PWD"));
	  login.clickonlogbutton();
	   utility.waits(driver, 2);
	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	  
	  pin.sendpin(utilitynew.readDatafromPropertyFile("PIN"));
	  pin.clickoncontinuebutton();
	  utility.waits(driver, 2);
	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
  }
  
  @Test
  public void Kiteuservalidation() throws EncryptedDocumentException, IOException
  {
	  String actualuserID=home.getActualuserID();
	  String expecteduserID=utilitynew.readDatafromPropertyFile("UN1");
	  Assert.assertEquals(actualuserID, expecteduserID,"Actual and Expected are not matching, TC is failed");
	  Reporter.log("Actual and Expected are matching, TC is PASSED", true); 
	  
	  /*
	  String TCID="555";
	  Assert.assertEquals(home.getActualuserID(),utilitynew.readDatafromPropertyFile("UN"),"TC failled actual and expected user id not matching");
      utility.captureScreenshot(driver, TCID);
     */
  }
  
  
  @AfterMethod
  public void logoutfromkite() throws InterruptedException
  {
	  home.clickonlogoutbutton();
  }
  
  
  @AfterClass
  public void closeBrowser()
  {
	  driver.close();
	 // driver.manage().deleteAllCookies();
  }
}
