package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class statictesting {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(1000);
		
		WebElement userid = driver.findElement(By.id("userid"));

		WebElement password = driver.findElement(By.id("password"));
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		userid.sendKeys("ELR321");
		password.sendKeys("Dhana1111");
		loginbutton.click();
		Thread.sleep(1000);
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement continuebutton = driver.findElement(By.xpath("//button[@type='submit']"));
		pin.sendKeys("982278");
		continuebutton.click();
		Thread.sleep(1000);
		
		WebElement ID = driver.findElement(By.xpath("//span[@class='user-id']"));
		String expectedID = "ELR321";
		String actualid = ID.getText();
		Thread.sleep(1000);
		
		if(expectedID.equals(actualid))
		{
			System.out.println("Test Case is pass");
		}
	else
	{
		System.out.println("test case is fail");
	}
		ID.click();	
		Thread.sleep(1000);
		WebElement logout = driver.findElement(By.xpath("//a[@target='_self']"));
		logout.click();
		Thread.sleep(1000);
		
		
	}

	

}
