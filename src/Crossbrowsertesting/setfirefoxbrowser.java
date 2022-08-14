package Crossbrowsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class setfirefoxbrowser 
{
  @Test
  public void setfirefox() 
  {
	  System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver.exe");

		WebDriver driver= new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/"); 
	  
  }
}
