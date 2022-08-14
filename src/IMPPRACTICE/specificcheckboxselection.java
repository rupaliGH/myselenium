package IMPPRACTICE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class specificcheckboxselection 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");

		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://itera-qa.azurewebsites.net/home/automation");
	      
		 //select specific checkbox
		// driver.findElement(By.xpath("//input[@id='monday']")).click();
		 
		//how to select all checkboxes
		 
		 List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
         
//		 System.out.println("no of checkboxes"+checkboxes.size());
//        
//		 for(int i=0;i<checkboxes.size();i++)
//        {
//        	checkboxes.get(i).click();
//        }
//        
//        
//         for (WebElement chbox : checkboxes) 
//        {
//			chbox.click();
//		}
		 //select monday and sunday
        
//         for (WebElement chbox : checkboxes) 
//         {
//		   String  checkboxname=chbox.getAttribute("id");
//		   if(checkboxname.equals("monday") || checkboxname.equals("sunday"))
//			   chbox.click();
//		 }
         // last two checkbox
		 
		 int totcheckbox = checkboxes.size();
//		
//		 for(int i=totcheckbox-2;i<totcheckbox;i++)
//		 {
//			 checkboxes.get(i).click();
//		 }
		 //first threee checkbox
		 
		 
		 for(int i=0;i<totcheckbox;i++)
		 {
			if(i<2)
			{
			 checkboxes.get(i).click(); 
		 
			}
	      }
	}
}
