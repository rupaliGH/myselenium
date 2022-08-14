package AnnotationTestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotationstudy
{
 @BeforeClass
  public void EnterURL()
   {
	Reporter.log("Enter Amazon URL",true);
   }
 @BeforeMethod
 public void searchproduct()
 {
	Reporter.log("Search product and add in cart", true); 
 }
 @BeforeMethod
 public void buypprocess()
 {
	 Reporter.log("Click on Buy Now and proceed for payment", true);
 }
 @Test
 public void buyproduct()
 {
	 Reporter.log("product is ordered and deliver soon", true);
 }
 @AfterMethod
 public void closeapp()
 {
	 Reporter.log("Close app",true);
 }
 @AfterClass
 public void closebrowser()
 {
	 Reporter.log("Close browser", true);
 }
 
}
