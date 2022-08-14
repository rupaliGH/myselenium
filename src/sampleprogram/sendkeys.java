package sampleprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(3000);
		
       driver.findElement(By.xpath("//input[@name='q']")).sendKeys("apple laptop");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//input[@name='q']")).clear();
	  	 
	
	}

}
