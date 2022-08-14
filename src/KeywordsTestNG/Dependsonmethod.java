package KeywordsTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependsonmethod
{
	 @Test 
	  public void A()	 
	  {
		 
		 Reporter.log("A is running", true);
	  }
	  @Test (dependsOnMethods = {"A"},invocationCount = 3,priority = -3)
	  public void B() 
	  {
		  Reporter.log("B is running", true);
	  }
	  @Test (timeOut = 100)
	  public void C() throws InterruptedException 
	  {
		  Thread.sleep(150);
		  Reporter.log("C is running", true);
	  }
	  @Test
	  public void D() 
	  {
		  Reporter.log("D is running", true);
	  }
	  @Test 
	  public void E() 
	  {
		  Reporter.log("E is running", true);
	  }
}
