package KeywordsTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeout 
{
	@Test (timeOut = 500)
	  public void A() throws InterruptedException 
	  {
		 Thread.sleep(100);
		 Reporter.log("A is running", true);
	  }
	  @Test
	  public void B() 
	  {
		  Reporter.log("B is running", true);
	  }
	  @Test
	  public void C() 
	  {
		  Reporter.log("C is running", true);
	  }
}
