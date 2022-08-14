package AnnotationTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class annotationeg3 
{
  @Test
  public void mymethod()
  {
	  Reporter.log("mymethod is running", true);
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  Reporter.log("before method is running", true);  
  }

  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("After method is running", true);  
  }

  @BeforeClass
  public void beforeClass()
  {
	  Reporter.log("before class is running", true);  
  }
  

  @AfterClass
  public void afterClass()
  {
	  Reporter.log("After class is running", true);
  }

  @BeforeTest
  public void beforeTest()
  {
	  Reporter.log("Before test is running", true);
  }

  @AfterTest
  public void afterTest() 
  {
	  Reporter.log("After test is running", true);
  }

}
