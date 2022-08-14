package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class sseg6 
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");

		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.youtube.com/channel/UC-9-kyTW8ZkZNDHQJ6FgpwQ");
		 Thread.sleep(1000);
		 
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 String randon=RandomString.make(2);
		 File dest = new File("C:\\Users\\RUPALI TARADE\\Desktop\\Testing Class Material\\Screenshots\\youtube"+randon+".png");
		  FileHandler.copy(src, dest);

	}

	
	}



