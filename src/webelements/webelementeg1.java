package webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementeg1 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a")); //a tag for search the links
		
		System.out.println("total no of links are:"+links.size()); //how many links
		
		for(WebElement l:links)
		{
			System.out.println(l.getText()); //links names
		}
		

	}

}
