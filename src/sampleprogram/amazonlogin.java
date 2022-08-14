package sampleprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonlogin {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
	     
	      Thread.sleep(2000);
	     
	      driver.findElement(By.xpath("//span[text()='Hello, Sign in']")).click();
	     
	       Thread.sleep(2000);
	       
	      WebElement mobnumfield = driver.findElement(By.xpath("//input[@type='email']"));
	     
	      mobnumfield.sendKeys("7387468508");
	     
	      Thread.sleep(2000);
	     
	      driver.findElement(By.xpath("//input[@id='continue']")).click();
	     
	      Thread.sleep(2000);
	     
	      WebElement pass = driver.findElement(By.xpath("//input[@id='ap_password']"));
	     
	      pass.sendKeys("Rupali@21");
	     
	      Thread.sleep(1000);
	     
	      driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	      Thread.sleep(2000);
	     
	      WebElement txt = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	      txt.sendKeys("women tshirts");
	      Thread.sleep(2000);

	}

}
