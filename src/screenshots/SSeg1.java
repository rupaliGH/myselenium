package screenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class SSeg1 {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://kite.zerodha.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String random=RandomString.make(4);
        File dest=new File("C:\\Users\\RUPALI TARADE\\Desktop\\Testing Class Material\\Screenshots\\SS"+random+".png");
	     FileHandler.copy(src, dest);
	}
	

}
