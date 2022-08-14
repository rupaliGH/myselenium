package seleniumwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listboxeg2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://en-gb.facebook.com/");
		
		Thread.sleep(11000);
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2')]")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.name("firstname")).sendKeys("Rupali");
		Thread.sleep(5000);
		
		driver.findElement(By.name("lastname")).sendKeys("Tarade");
		Thread.sleep(5000);
		
		driver.findElement(By.name("reg_email__")).sendKeys("8888713285");
		Thread.sleep(50000);
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("Rup@789");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
	    WebElement day = driver.findElement(By.id("day"));
	    Select s= new Select(day);
	    
	    WebElement month = driver.findElement(By.id("month"));
	    Select s1=new Select(month);
	    
	    WebElement year = driver.findElement(By.id("year"));
	    Select s2=new Select(year);
	    
	    s.selectByVisibleText("21");
	    Thread.sleep(1000);
	    s1.selectByVisibleText("May");
	    Thread.sleep(1000);
	    s2.selectByVisibleText("1992");
	    
	    for(int i=0;i<=10;i++)
	    {
	    	s2.selectByIndex(i);
	    	 Thread.sleep(1000);
	    }

	}

}
