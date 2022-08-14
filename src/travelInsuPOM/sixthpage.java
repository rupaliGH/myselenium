package travelInsuPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sixthpage 
{
	@FindBy(xpath="//input[@id='mobileNumber']") private WebElement mobileno;
	@FindBy(xpath="//button[text()='View plans']") private WebElement viewplanbutton;	
  
	public sixthpage(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }
	public void sendmobilenumber(String mobno)
	{
		mobileno.sendKeys(mobno);
	}
	public void clickonviewplanbutton()
	{
		viewplanbutton.click();
	}
}
