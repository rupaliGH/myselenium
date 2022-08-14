package unorderedlist;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uleg3 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("accessories");
		Thread.sleep(1000);
		List<WebElement> acc = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		Thread.sleep(1000);
		acc.size();
		for(WebElement a:acc)
		{
			System.out.println(a.getText());
		}
		
		for(WebElement a:acc)
		{
			String ex = "accessories for women";
			Thread.sleep(1000);
			String ac = a.getText();
			if(ac.equals(ex))
			{
				a.click();
				break;
			}
		}
         driver.findElement(By.linkText("Images")).click();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
	}

}
