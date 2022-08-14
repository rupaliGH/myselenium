package practiceprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CTtesting 
{
	@Parameters("Browser")
  @Test
  public void CTBrowsertesting(String Browser)
  {
		
		 WebDriver driver = null; //declared driver and initialise
		  
		  if(Browser.equals("chrome"))
		  {
		  System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");

		    driver= new ChromeDriver();
		    
		    driver.manage().window().maximize();
		  }
		  else if (Browser.equals("firefox")) 
		  {
			  System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver.exe");

			    driver= new FirefoxDriver();
			    
			    driver.manage().window().maximize();
		  }
			
			driver.get("https://kite.zerodha.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			
			//provide userID
			Reporter.log("entering userID",true);
			driver.findElement(By.id("userid")).sendKeys("ELR321");
			
			//provide password
			Reporter.log("entering password",true);
			driver.findElement(By.id("password")).sendKeys("Dhana1111");
			
			//click on login button
			driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			
			//provide PIN
			Reporter.log("entering PIN",true);
			driver.findElement(By.id("pin")).sendKeys("982278");
			
			//click on continue
			driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
			//find userid
			Reporter.log("validating userID",true);
			
			String ActualuserID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
			String ExpecteduserID="ELR321";
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

			
			if(ActualuserID.equals(ExpecteduserID))
			{
				Reporter.log("TC passed ID is matching",true);
			}
			else
			{
				Reporter.log("TC failled ID not matching",true);
			}
  }
}
