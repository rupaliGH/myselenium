package GroupingXML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GRP2 
{
	@Test 
	  public void F() 
	  {
		 Reporter.log("F is running", true);
	  }
	  @Test (groups = "sanity")
	  public void G() 
	  {
		  Reporter.log("G is running", true);
	  }
	  @Test
	  public void H() 
	  {
		  Reporter.log("H is running", true);
	  }
	  @Test
	  public void I() 
	  {
		  Reporter.log("I is running", true);
	  }
	  @Test 
	  public void J() 
	  {
		  Reporter.log("J is running", true);
	  }
}
