package testclasseskitenew;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Baseclasskitenew.Base;
import KiteloginusingTestNG.kitepinpage;
import Utilityclasskitenew.utility;
import kitewithPOMusingExcel.kitehomepage;
import kitewithPOMusingExcel.kiteloginpage;

public class ValidatekiteuserID extends Base 
{
	 kiteloginpage login;
	 kitepinpage pin;
	 kitehomepage home;
	
  @BeforeClass
  public void LaunchBrowser()
  {
	  OpenApplication();
	   login = new kiteloginpage(driver);
	   pin = new kitepinpage(driver);
	   home = new kitehomepage(driver);
  }
  @BeforeMethod
  public void logintoKiteApp() throws EncryptedDocumentException, IOException, InterruptedException
  {
	  login.senduserid(utility.readdatafromexcel(0, 0));
	  login.sendpassword(utility.readdatafromexcel(0, 1));
	  login.clickonlogbutton();
	   utility.waits(driver, 2);
	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	  
	  pin.sendpin(utility.readdatafromexcel(0, 2));
	  pin.clickoncontinuebutton();
	  utility.waits(driver, 2);
	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
  }
  @Test
  public void Kiteuservalidation() throws EncryptedDocumentException, IOException
  {
	  String TCID="1234";
	  Assert.assertEquals(home.getActualuserID(),utility.readdatafromexcel(0, 0),"TC failled actual and expected user id not matching");
      utility.captureScreenshot(driver, TCID);
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
  }
}
