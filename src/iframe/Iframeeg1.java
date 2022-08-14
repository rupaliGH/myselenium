package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframeeg1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");

		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		 
		 driver.switchTo().frame("iframeResult");
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[contains(text(),' Date and Time.')]")).click();
         driver.switchTo().defaultContent();
         Thread.sleep(2000);
         driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
	}

}
