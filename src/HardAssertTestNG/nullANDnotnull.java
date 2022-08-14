package HardAssertTestNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class nullANDnotnull
{
  @Test
  public void nullANDnotnullmethod()
  {
	  String a=null;
	  String b="abcd";
	  
	  //Assert.assertNull(b, "TC pass if value will null");
	  Assert.assertNotNull(b, "TC fail if value will null");
	 
  }
}
