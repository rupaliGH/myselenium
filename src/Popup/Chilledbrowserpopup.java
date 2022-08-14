package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chilledbrowserpopup {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(1000);
		//// to get single id(main page)--> 
		String idofmainpage = driver.getWindowHandle();
		System.out.println(idofmainpage);
		
		//to get multiple ids-->
		Set<String> idofallpages = driver.getWindowHandles();
		System.out.println(idofallpages);
		
		// convert set into ArrayList 
		ArrayList<String> al = new ArrayList<String>(idofallpages);
		
		String newidofmainpage = al.get(0);
		String newidofchildpage = al.get(1);
		
		//switch focus from main page to child page
		driver.switchTo().window(newidofchildpage); //focus main to chiled
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='field searchform-s'])[4]")).sendKeys("Selenium");

	}	

}
