package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class SS {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");

		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://kite.zerodha.com/#loggedout");
		 Thread.sleep(3000);
	     File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     String random=RandomString.make(3);
	     File dest=new File("C:\\Users\\RUPALI TARADE\\Desktop\\testing material\\Screenshots\\snapshot"+random+".png");
		 FileHandler.copy(source, dest);

	}

}
