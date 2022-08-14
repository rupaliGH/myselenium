package Popup;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class closemultipletab {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Rupali Selenium\\chromedriver.exe");
	     
	     WebDriver driver= new ChromeDriver();
	     
	     driver.manage().window().maximize();
	     
	     driver.get("https://vctcpune.com/");
	     
	     Thread.sleep(2000);
	     
	     driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]")).click();
	     
	    //get id of main page
	     String idmainpg = driver.getWindowHandle();
	     System.out.println("id pf main page"+idmainpg);
	     
	     //id of 2nd tab
	     
	     Set<String> idsecondpg = driver.getWindowHandles();
	     System.out.println("id of second page"+idsecondpg);
	     
	     ArrayList<String> al=new ArrayList<String>(idsecondpg);
	     
	        String idmainpage =al.get(0);
	        String idchildpage = al.get(1);
	       
	        //switch focus 1st tab to 2nd tab
	        driver.switchTo().window(idchildpage);
	        driver.findElement(By.id("autocomplete")).sendKeys("selenium");
	        driver.findElement(By.xpath("//input[@value='Radio1']")).click();
	        driver.findElement(By.xpath("//input[@value='option1']")).click();
	       
	        //switch focus 2nd to 1st page
	        driver.switchTo().window(idmainpage);
	        List<WebElement> links = driver.findElements(By.tagName("a"));
	        links.size();
	       
	        //list of links
	        for(WebElement l:links)
	        {
	        System.out.println("total links are"+l.getText());
	        }

	}

}
