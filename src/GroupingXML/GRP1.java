package GroupingXML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GRP1
{
	@Test 
	  public void A() 
	  {
		 Reporter.log("A is running", true);
	  }
	  @Test (groups = "regression")
	  public void B() 
	  {
		  Reporter.log("B regression is running", true);
	  }
	  @Test
	  public void C() 
	  {
		  Reporter.log("C is running", true);
	  }
	  @Test (groups = "sanity")
	  public void D() 
	  {
		  Reporter.log("D sanity is running", true);
	  }
	  @Test 
	  public void E() 
	  {
		  Reporter.log("E is running", true);
	  }
}
