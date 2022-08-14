package Baseclasskitenew;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base 
{
	protected WebDriver driver;
	
  public void OpenApplication()
  {
	  System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Reporter.log("Launching Kite App",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
  }
}	
