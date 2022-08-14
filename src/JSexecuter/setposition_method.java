package JSexecuter;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setposition_method {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");

		Thread.sleep(300);
		
		//1. Create object of point class and pass x and y values 
		
		Point P= new Point(300, 400);
		
		//call method getposition to get the position on browser
		
		driver.manage().window().getPosition();
		
		   //2.call setPosition method and pass object of Point class 
		
		driver.manage().window().setPosition(P);
		
	}

}
