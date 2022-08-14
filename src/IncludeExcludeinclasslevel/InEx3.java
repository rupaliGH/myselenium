package IncludeExcludeinclasslevel;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InEx3 
{
	@Test 
	  public void K() 
	  {
		 Reporter.log("K is running", true);
	  }
	  @Test
	  public void L() //ic
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
	  public void O() //ic
	  {
		  Reporter.log("O is running", true);
	  }
}
