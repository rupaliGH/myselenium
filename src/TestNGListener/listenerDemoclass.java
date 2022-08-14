package TestNGListener;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestNGListener.Listener.class)
public class listenerDemoclass 
{
  @Test
  public void firstmethod()
  {
	  Reporter.log("firstmethod-->TC execution is started",true);
  }
  
  @Test
  public void secondmethod()
  {
	   Assert.fail();
	  Reporter.log("secondmethod-->TC execution is started",true);
  }
  
  @Test(dependsOnMethods = {"secondmethod"})
  public void thirdmethod()
  {
	  Reporter.log("thirdmethod-->TC execution is started",true);
  }
}
