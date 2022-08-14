package Baseclassusingpropertyfile;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import Utilitykiteusingpropertyfile.utilitynew;

public class Basenew 
{
	protected static WebDriver driver;
	
  public void OpenApplication() throws IOException
  {
	  System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(utilitynew.readDatafromPropertyFile("URL"));
		Reporter.log("Launching Kite App",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
  }
 
  public void takeScreenshot( String TCName) throws IOException 
    {
	    File SRC = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File DEST=new File("E:\\selenium\\Screenshots\\TC"+TCName+".png");
		FileHandler.copy(SRC, DEST);
		Reporter.log("Taken Screenshot",true);
    }
  
}	
