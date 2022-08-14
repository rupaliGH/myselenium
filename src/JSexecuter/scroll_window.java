package JSexecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_window {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");

		Thread.sleep(300);
		
		//typecase driver into JavascriptExecutor and store in ref variable 
		
		JavascriptExecutor JS = (JavascriptExecutor)driver;
		
		Thread.sleep(100);
	
		// call method sccroll by 
		JS.executeScript("window.scrollBy(20,300)");

		
	}

}
