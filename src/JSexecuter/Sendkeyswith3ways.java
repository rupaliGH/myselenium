package JSexecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sendkeyswith3ways
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");

		Thread.sleep(300);
		
		//webelement
		
		WebElement sendtext = driver.findElement(By.name("q"));
		
		sendtext.sendKeys("apple laptop");
	     Thread.sleep(300);
		
		sendtext.clear();
		
		//javasciptexecutor
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='apple'",sendtext);
		Thread.sleep(300);
		sendtext.clear();
		
       //action class
		Actions Act = new Actions(driver);
		
		Act.sendKeys(sendtext,"apple laptop").perform();
		Thread.sleep(300);
		sendtext.clear();
		
	}

}
