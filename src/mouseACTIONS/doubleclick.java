 package mouseACTIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
	     
	     WebDriver driver= new ChromeDriver();
	     
	     driver.manage().window().maximize();
	     
	     driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	     
	     Thread.sleep(2000);
	     
	     Actions Act= new Actions(driver);
	     
	     //double click
	     
	   //  WebElement doubleclick = driver.findElement(By.xpath("//button[contains(text(),'Alert')]"));
	     
	   //  Act.doubleClick(doubleclick).perform();
	     
	     
	     //right click
	     
	     WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
	                                     
	     Act.contextClick(rightclick).perform();
	     
	     
	}

}
