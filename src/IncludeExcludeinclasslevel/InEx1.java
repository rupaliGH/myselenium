package IncludeExcludeinclasslevel;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InEx1 
{
	 @Test 
	  public void A() //ic
	  {
		 Reporter.log("A is running", true);
	  }
	  @Test(timeOut = 100)
	  public void B() throws InterruptedException 
	  {
		  Thread.sleep(300);
		  Reporter.log("B is running", true);
	  }
	  @Test
	  public void C() //ex
	  {
		  Reporter.log("C is running", true);
	  }
	  @Test 
	  public void D() 
	  {
		  Reporter.log("D is running", true);
	  }
	  @Test 
	  public void E() //ic
	  {
		  Reporter.log("E is running", true);
	  }
}
