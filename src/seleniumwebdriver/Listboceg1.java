package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listboceg1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(3000);
		
		WebElement DDlist = driver.findElement(By.id("dropdown-class-example"));
		
		Select s=new Select(DDlist);
		
//		s.selectByIndex(2);
    	s.selectByValue("option3");
//		s.selectByVisibleText("Option1");

	}

}
