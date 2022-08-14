package iframe;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class Multiframe {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");

		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
  
		 driver.switchTo().frame("frame1");
		 Thread.sleep(2000);
		 driver.findElement(By.tagName("input")).sendKeys("selenium work");
		 
		 driver.switchTo().frame("frame3");
		 Thread.sleep(2000);
		 driver.findElement(By.id("a")).click();
		 Thread.sleep(2000);
		 
		 driver.switchTo().defaultContent();
		 
		 driver.switchTo().frame("frame2");
		 Thread.sleep(2000);
		 WebElement name = driver.findElement(By.id("animals"));
		 Select s=new Select(name);
		 s.selectByVisibleText("Baby Cat");
		 
		 Thread.sleep(2000);
		 
		 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 String randon=RandomString.make(4);
		 File dest=new File("C:\\Users\\RUPALI TARADE\\Desktop\\testing material\\Screenshots"+randon+".png");
		 FileHandler.copy(src, dest);
	}

}
