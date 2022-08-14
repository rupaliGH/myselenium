package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathlocators 
{

	public static void main(String[] args) 
	{
      System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		
		driver.findElement(By.xpath("//select[@id='dropdown-class-example']")).click();
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		driver.findElement(By.xpath("//input[@value='Radio1']")).click();

	}

}
