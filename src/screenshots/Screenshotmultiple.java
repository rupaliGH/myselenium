package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshotmultiple {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");

		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.youtube.com/channel/UC-9-kyTW8ZkZNDHQJ6FgpwQ");
		 Thread.sleep(2000);
		 
		 File Src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 	
		 String random=RandomString.make(3);
		 File Desc=new File("E:\\seleniumSS"+random+".png");
		 
	      FileHandler.copy(Src, Desc);

	}

}
