package mouseACTIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousemoveelement {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
	     
	     WebDriver driver= new ChromeDriver();
	     
	     driver.manage().window().maximize();
	     
	     //driver.get("https://vctcpune.com/selenium/practice.html");
	     driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	     
	     Thread.sleep(2000);
	     
	     Actions act= new Actions(driver);
	   /*  WebElement name = driver.findElement(By.xpath("//a[text()='About Us']"));
	       act.moveToElement(name).perform();
	   */ act.click().perform();
	   
//	   WebElement dblclick = driver.findElement(By.xpath("//button[contains(text(),'Alert')]"));
//	     act.doubleClick(dblclick).build().perform();
//	     Thread.sleep(1000);
	     
	     
	     WebElement rytclick = driver.findElement(By.xpath("//span[text()='right click me']"));
	     act.contextClick(rytclick).perform();
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     Actions Ac = new Actions(driver);
	     
	     WebElement aboutus = driver.findElement(By.xpath("//a[text()='About Us']"));
	     
	     Ac.moveToElement(aboutus).perform();
	     
	     //Ac.click().perform();
	     
	     WebElement radio1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
	     Ac.moveToElement(radio1).perform();
	     Ac.click().perform();
	     Ac.moveToElement(radio1).build().perform();

	}

}
