package KeywordsTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityTestNG
{
  @Test (priority =0)
  public void A() 
  {
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
  @Test(priority = -3)
  public void D() 
  {
	  Reporter.log("D is running", true);
  }
  @Test (priority = -4)
  public void E() 
  {
	  Reporter.log("E is running", true);
  }
}
