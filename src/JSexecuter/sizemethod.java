package JSexecuter;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sizemethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		
		//to set size we need to create object of Dimension class and pass width and height as parameters  	
		
		Dimension D= new Dimension(300, 300);
		
		//call  size method
		
		System.out.println(driver.manage().window().getSize());
		
		  //call setSize method which will ask you object of Dimension class
		
		driver.manage().window().setSize(D);
	}
	

}
