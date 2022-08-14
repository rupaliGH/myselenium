package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class Fluentwait {

	public static void main(String[] args)
	{
         System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		
		WebElement name = driver.findElement(By.id("name"));

		name.sendKeys("Its Rupali");
		
		FluentWait FL = new FluentWait(driver);
		
		FL.withTimeout(Duration.ofSeconds(200)).withMessage("rupali");
		
		driver.close();
	}

}
