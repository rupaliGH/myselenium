package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CBpopup 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");

		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demoqa.com/alerts");
		 WebElement button = driver.findElement(By.id("alertButton"));
		 button.click();
		 Alert alt = driver.switchTo().alert();
		 Thread.sleep(200);
		 alt.accept();
		 driver.switchTo().defaultContent();
		 Thread.sleep(200);
		 driver.findElement(By.xpath("(//div[@class='header-text'])[1]")).click();
 
	}

}
