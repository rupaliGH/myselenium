package FailledTestCaseXML;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testcase2
{
	 @Test
	  public void D() 
	  {
		 //Assert.fail();
		  Reporter.log("D is running", true);
	  }
	  @Test 
	  public void E() 
	  {
		 // Assert.fail();
		  Reporter.log("E is running", true);
	  }
	  @Test 
	  public void F() 
	  {
		  //Assert.fail();
		  Reporter.log("F is running", true);
	  }
}
