package TestNGListener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Pune 
{
	  @Test  
	  public void Swargate() 
	  { 
		   Assert.fail();  
		   Reporter.log("Swargate TC is running", true);  
	   }    
	  @Test 
	  public void shivajiNagar()  
	  {   
		  Reporter.log("shivajiNagar TC is running", true); 
	  }
}
