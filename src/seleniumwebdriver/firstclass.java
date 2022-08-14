package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstclass
{

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		
		
	}

}
