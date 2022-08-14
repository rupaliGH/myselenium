package mouseACTIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardactions 
{   

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
	     
	     WebDriver driver= new ChromeDriver();
	     
	     driver.manage().window().maximize();
	     
	     driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	     
	     Thread.sleep(2000);
	     
	     Actions Act= new Actions(driver);
	     
	     WebElement day = driver.findElement(By.id("day"));
	   
	     Act.click(day).perform();
	     
	     for(int i=0;i<=12;i++)
	     {	 
	     Act.sendKeys(Keys.ARROW_DOWN).perform();
	     Act.sendKeys(Keys.ENTER).perform();
	     }
	     
	     WebElement month = driver.findElement(By.id("month"));
	     
	     Act.click(month).perform();
	     for(int i=0;i<=1;i++)
	     {
	     
	     Act.sendKeys(Keys.ARROW_UP).perform();
	     Act.sendKeys(Keys.ENTER).perform();
	     }
	     
	     WebElement year = driver.findElement(By.id("year"));
	      Act.click(year).perform();
	     
	     for(int i=0;i<=30;i++)
	     {
	     
	     Act.sendKeys(Keys.ARROW_DOWN).perform();
	      Act.sendKeys(Keys.ENTER).perform();
	     }
	}

}
