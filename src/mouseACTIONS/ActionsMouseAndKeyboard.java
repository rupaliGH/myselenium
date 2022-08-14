package mouseACTIONS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMouseAndKeyboard {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
	     
	     WebDriver driver= new ChromeDriver();
	     
	     driver.manage().window().maximize();
	     
	     driver.get("https://demoqa.com/");
	     
	     Thread.sleep(2000);
	     
	     Actions act = new Actions(driver);
	     WebElement oneclick = driver.findElement(By.xpath("//h5[text()='Elements']"));
	     act.moveToElement(oneclick).build().perform();
	     act.click();
	     
	     
	}

}
