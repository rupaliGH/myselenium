package wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit 
{

	public static void main(String[] args)
	{
        System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		
		driver.close();
	}

}
