package travelInsuPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fifthpage 
{
	@FindBy(xpath="//label[text()='No']") private WebElement medcond ;
	@FindBy(xpath="//button[text()='Next']") private  WebElement Nexbutton;
	
	 public fifthpage(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }
	 public void selectmedicalcondition()
	 {
		 medcond.click();
	 }
	 public void clickonNextbutton()
	 {
		 Nexbutton.click();
	 }
}
