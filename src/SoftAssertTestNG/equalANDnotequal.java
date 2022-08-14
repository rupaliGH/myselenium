package SoftAssertTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class equalANDnotequal
{
	SoftAssert soft = new SoftAssert();
  @Test
  public void equalnotequal()
  {
	  String a="pune";
	  String b="pune";
	  String c="mumbai";
	  String d="delhi";
	  
	 soft.assertEquals(a, b,"Result is not matching");
	 soft.assertNotEquals(a, b,"result is matching");
	 soft.assertAll();
  }
}
