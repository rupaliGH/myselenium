package dynamicelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicele2 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung galaxy m33 5g");
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		WebElement rev = driver.findElement(By.xpath("((//div[@class='sg-col-inner'])[9]//span)[15]"));
 
		System.out.println("review are:"+rev.getText());
	}

}
