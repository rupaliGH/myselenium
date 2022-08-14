package Crossbrowsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class chromeANDfirefox 
{
	@Parameters("browserName")
  @Test
  public void firefoxandchrome(String Bname) 
  {
	  WebDriver driver = null; //declared driver and initialise
	  
	  if(Bname.equals("chrome"))
	  {
	  System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");

	    driver= new ChromeDriver();
	  }
	  else if (Bname.equals("firefox")) 
	  {
		  System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver.exe");

		    driver= new FirefoxDriver();
	  }
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		
  }

	
}

