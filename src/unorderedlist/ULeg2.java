package unorderedlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ULeg2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='Hello, Sign in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("7387468508");
		Thread.sleep(2000);
//	    driver.findElement(By.xpath("//input[@id='continue']")).click();
//	    Thread.sleep(1000);
//	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Rupali@21");
//	    Thread.sleep(1000);
//	    driver.findElement(By.id("signInSubmit")).click();
//	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("apple  laptop");
	    
	    
	    
		

	}

}
