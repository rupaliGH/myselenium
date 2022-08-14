package Crossbrowsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CTdemo3 
{
	@Parameters("browserName")
	
	@Test
	
	  public void firefoxandchrome(String browserName) 
	  {
		  WebDriver driver = null; //declared driver and initialise
		  
		  if(browserName.equals("chrome"))
		  {
		  System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");

		    driver= new ChromeDriver();
		  }
		  else if (browserName.equals("firefox")) 
		  {
			  System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver.exe");

			    driver= new FirefoxDriver();
		  }
		  
		  else if (browserName.equals("opera")) 
			{
				 System.setProperty("webdriver.opera.driver","E:\\selenium\\operaDriver.exe");
				 driver= new OperaDriver();
			}
			driver.manage().window().maximize();
			
			driver.get("https://kite.zerodha.com/");
			
			
	  }

}
