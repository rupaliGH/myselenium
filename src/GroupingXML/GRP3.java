package GroupingXML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GRP3
{
	@Test 
	  public void K() 
	  {
		 Reporter.log("K is running", true);
	  }
	  @Test(groups = "smoke")
	  public void L() 
	  {
		  Reporter.log("L is running", true);
	  }
	  @Test 
	  public void M() 
	  {
		  Reporter.log("M is running", true);
	  }
	  @Test
	  public void N() 
	  {
		  Reporter.log("N is running", true);
	  }
	  @Test 
	  public void O() 
	  {
		  Reporter.log("O is running", true);
	  }
}
