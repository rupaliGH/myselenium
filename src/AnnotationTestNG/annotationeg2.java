package AnnotationTestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotationeg2
{
  @Test
  public void ValidateUSERID()
  {
	  Reporter.log("validate userID", true);
  }
  @Test
  public void ValidatePIN()
  {
	  Reporter.log("validate PIN", true);
  }
  @BeforeClass
  public void enterURL()
  {
	  Reporter.log("enter URL", true);
  }
  @BeforeMethod
  public void EnterUIDandPASS()
  {
	  Reporter.log("enter UID and PASS", true);
  }
  @BeforeMethod
  public void EnterPIN()
  {
	  Reporter.log("Enter PIN", true);
  }
  @AfterMethod
  public void closeKite()
  {
	  Reporter.log("Close kite", true);
  }
  @AfterClass
  public void closebrowser()
  {
	  Reporter.log("close browser", true);
  }
}
