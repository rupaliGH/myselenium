package IncludeExcludeinclasslevel;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InEx2
{
	@Test 
	  public void F() 
	  {
		 Reporter.log("F is running", true);
	  }
	  @Test
	  public void G() //ic
	  {
		  Reporter.log("G is running", true);
	  }
	  @Test
	  public void H() 
	  {
		  Reporter.log("H is running", true);
	  }
	  @Test
	  public void I()  //ic
	  {
		  Reporter.log("I is running", true);
	  }
	  @Test 
	  public void J() 
	  {
		  Reporter.log("J is running", true);
	  }
}
