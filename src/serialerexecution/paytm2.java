package serialerexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class paytm2 
{
	 @Test
	  public void Kitelogin()
	  {
		  System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");

			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://paytm.com/"); 
	  }
}
