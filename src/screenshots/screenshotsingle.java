package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import seleniumwebdriver.Webdrivermethods;

public class screenshotsingle 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
	 System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");

	 WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 
	 driver.get("https://en-gb.facebook.com/");
	 Thread.sleep(5000);
     File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     File dest=new File("C:\\Users\\RUPALI TARADE\\Desktop\\testing material\\Screenshots\\snapshot.png");
	 FileHandler.copy(source, dest);
	 
	}

}
