package JSexecuter;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.Argument;

public class jsdiffoperation {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");

		Thread.sleep(300);
		
		//create object of JavascriptExecutor interface
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		Thread.sleep(300);
		
		//sendkeys using JavascriptExecutor
		
		WebElement text = driver.findElement(By.xpath("//input[@id='name']"));
		JS.executeScript("arguments[0].value='Rupali';",text);
		Thread.sleep(300);
	
		
	   WebElement DD = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
       JS.executeScript("arguments[0].scrollIntoView();",DD);
       Select s= new Select(DD); 
       DD.click();
     
 
       
	}
}
