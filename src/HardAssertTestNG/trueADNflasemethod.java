package HardAssertTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class trueADNflasemethod 
{
  @Test
  public void TrueANDflase() 
  {
	  boolean a=true;
	  boolean b=false;
	  
	  //Assert.assertTrue(a, "TC pass if both values are true");
	  Assert.assertFalse(b, "TC fail if  value will true");
  }
}
