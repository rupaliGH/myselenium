package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterDotloguse
{
  @Test
  public void display() 
  {
	  System.out.println("This is not used in TestNG");   //only printing on console
	  
	  Reporter.log("Hii using Reporter.log", true);       //printing on console and reports
	  Reporter.log("this is another statement",true);
  }
}
