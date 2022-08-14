package HardAssertTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class equalANDnotequalmethod 
{
  @Test
  public void equal() 
  {
	  String a="pune";
	  String b="pune";
	  String c="mumbai";
	  String d="delhi";
	 
	  
	 // Assert.assertEquals(a, b,"TC fails if values not matching");
	 // Assert.assertEquals(a, c,"TC pass if values are matching");
	  
	 // Assert.assertNotEquals(c, d, "TC fail if both values are same");
	 Assert.assertNotEquals(a, b, "TC pass if values are different"); 
  }
}
