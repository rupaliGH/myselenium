package wait;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit 
{

	public static void main(String[] args) 
	{
         System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//applicable for element 
		
		//driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(200));
		
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys("Rupali");
		
		//create object  WebDriverWait class 
		
	 WebDriverWait ww = new WebDriverWait(driver, java.time.Duration.ofSeconds(200));
	 
	 //with object call method and apply cond on element
	 
	 ww.until(ExpectedConditions.visibilityOf(name));
	 
	 driver.close();
	 
		
		

	}

}
