package SoftAssertTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class null_notnul_ltrue_false_assertfail 
{
	SoftAssert soft= new SoftAssert();
	
  @Test
  public void testcase1() 
  {
	  String Expected="rupali";
	  String Actual=null;
	  Reporter.log("testcase1 softassert is running",true);
	  soft.assertNotNull(Expected, "value is null");
	  soft.assertAll();
	  
	  soft.assertNull(Actual,"value is not null");
	  soft.assertAll();
	  
	  boolean result=true;
	  boolean res = false;
	  
	  soft.assertTrue(result, "result is false");
	  soft.assertAll();
	  soft.assertFalse(res, "result is true");
	  Assert.fail();
  }
}
