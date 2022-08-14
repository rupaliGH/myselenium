package unorderedlist;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Unorderedlisteg {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("headphone");
		Thread.sleep(1000);
		List<WebElement> head = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		Thread.sleep(3000);
		head.size();
		for(WebElement h:head)
		{
			System.out.println(h.getText());
		}
		for(WebElement h:head)
		{
			String ex ="headphones wireless";  
			Thread.sleep(3000);
			String ac = h.getText();
			if(ac.equals(ex))
			{
				h.click();
				break;
			}
		}
		driver.findElement(By.linkText("Images")).click();
	}

}
