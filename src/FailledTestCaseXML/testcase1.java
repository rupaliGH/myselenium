package FailledTestCaseXML;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testcase1 
{
	@Test 
	  public void A() 
	  {
		 //Assert.fail();
		 Reporter.log("A is running", true);
	  }
	  @Test
	  public void B() 
	  {
		  Assert.fail();
		  Reporter.log("B is running", true);
	  }
	  @Test
	  public void C() 
	  {
		  //Assert.fail();
		  Reporter.log("C is running", true);
	  }
	 
}
