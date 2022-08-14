package travelinsutestcase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMkitenew.fourthpage;
import travelInsuPOM.fifthpage;
import travelInsuPOM.firstpage;
import travelInsuPOM.secondpage;
import travelInsuPOM.sixthpage;
import travelInsuPOM.thirdpage;
import travellBase.travelinsuBase;
import travellutility.utility;

public class travelinsurancetestcase extends travelinsuBase
{
	firstpage p1;
	secondpage p2;
	thirdpage p3;
	fourthpage p4;
	fifthpage p5;
	sixthpage p6;
	//WebDriver driver;
	
  @BeforeClass
  public void Launchbrowser() throws IOException
  {
	  openPBwebsite();
	  
	  Reporter.log("successfully launched travell insurance website",true);
	  p1=new firstpage(driver);
	  p2=new secondpage(driver);
	  p3=new thirdpage(driver);
	  p4=new fourthpage(driver);
	  p5=new fifthpage(driver);
	  p6=new sixthpage(driver);
  }
  @BeforeMethod
  public void clickontravellinsurance()
  {
	  p1.clickontravelinsurance();
	  utility.waits(driver, 1000);
	  Reporter.log("successfully clicked on travell insurance",true);
	  
  }
  @Test(priority = 1)
  public void EnteryourDestination()
  {
	  //String PBTCID=TCID;
	  p2.selectcountryoption();
	  Reporter.log("successfully selected country option",true);
	  utility.waits(driver, 300);
	  p2.clickonnextbutton();
	  utility.waits(driver, 1000);
  }
  @Test(priority = 2)
  public void Selectdateoftravell()
  {
	  p3.clickonStartdatetab();
	  Reporter.log("successfully clicked on start date tab",true);
	  utility.waits(driver, 1000);
	  p3.pleasepickstartdate();
	  Reporter.log("successfully selected on start date ",true);
	  utility.waits(driver, 1000);
	 
	  p3.pleasepickenddate();
	  Reporter.log("successfully selected on END date ",true);
	  utility.waits(driver, 1000);
	  p3.clickonnextbutton();
  }
  @Test(priority=3)
  public void Selectnoofpeopletravelling()
  {
	  p4.selectpeople();
	  utility.waits(driver, 1000);
	  Reporter.log("successfully selected people ",true);
	  p4.clickonselectage();
	  utility.waits(driver, 1000);
	  Reporter.log("successfully clicked on people ",true);
	  p4.selectage();
	  utility.waits(driver, 1000);
	  Reporter.log("successfully selected people ",true);
	  p4.clickonnextbutton();
  }
  @Test(priority = 5)
  public void selectpreexistingmedicalcondition()
  {
	  p5.selectmedicalcondition();
	  utility.waits(driver, 1000);
	  Reporter.log("successfully selected pre medical condition ",true);
	  p5.clickonNextbutton();
  }
  @Test(priority = 6)
  public void EnterMobnoToproceed()
  {
	  p6.sendmobilenumber("mobno");
	  Reporter.log("successfully entered mobile no ",true);
	  utility.waits(driver, 1000);
	  p6.clickonviewplanbutton();
  }
  
  @AfterMethod
  public void visitedonmainpage()
  {
	  Reporter.log("successfully visited on main page ",true);
  }
  @AfterClass
  public void closebrowser()
  {
	  driver.close();
  }
}
