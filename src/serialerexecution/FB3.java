package serialerexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FB3
{

	  @Test
	  public void Kitelogin()
	  {
		  System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");

			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/"); 
	  }
}
