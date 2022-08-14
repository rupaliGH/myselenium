package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iframeeg2 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        
        driver.switchTo().frame("frame1");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
        driver.findElement(By.tagName("input")).sendKeys("Welcome");
        
        driver.switchTo().frame("frame3");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
        driver.findElement(By.id("a")).click();
        
        driver.switchTo().defaultContent();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        driver.switchTo().frame("frame2");
        WebElement dd = driver.findElement(By.id("animals"));
       Select s=new Select(dd);
       s.selectByVisibleText("Big Baby Cat");
       
       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
       

	}

}
