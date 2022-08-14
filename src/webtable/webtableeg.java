package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtableeg 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
	     
	     WebDriver driver= new ChromeDriver();
	     
	     driver.manage().window().maximize();
	     
	     driver.get("https://vctcpune.com/selenium/practice.html");
	     
	     Thread.sleep(2000);
	     
	  // how to find no of rows 
	     List<WebElement> noofrows = driver.findElements(By.xpath("//table[@id='product']//tr"));
	     System.out.println("no of rows are-"+noofrows.size());

	  // how to find no of columns
	     List<WebElement> noofcol = driver.findElements(By.xpath("//table[@id='product']//tr[1]/th"));
	     System.out.println("no of columns are-"+noofcol.size());
	     
	    //how to print header in table 
	     
	     for(WebElement c:noofcol)
	     {
	    	 System.out.print(c.getText()+" || ");
	     }
	     System.out.println();
	     
	     for(WebElement r:noofrows)
	     {
	    	 System.out.print(r.getText()+" || ");
	     }
	     System.out.println();
	     for(int i=0;i<noofrows.size();i++)
	     {
	    	for(int j=1;j<noofcol.size();j++) 
	    	{
	    		System.out.println(noofrows.get(i).getText()+" || ");
	    		System.out.println();
	    	}
	     }
	}

}
