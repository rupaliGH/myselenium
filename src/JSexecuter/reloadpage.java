package JSexecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class reloadpage {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://sdetforum.com");

		Thread.sleep(300);
		
		JavascriptExecutor JS= (JavascriptExecutor)driver;
		JS.executeScript("history.go(0)");
		Thread.sleep(300);
		driver.quit();
	}

}
