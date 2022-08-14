package KeywordsTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Innvocationcount 
{
  @Test (invocationCount = 3)
  public void Innvoke()
  {
	 Reporter.log("Innvocation count keyword is used when wants to run a test multiple time", true); 
  }
}
