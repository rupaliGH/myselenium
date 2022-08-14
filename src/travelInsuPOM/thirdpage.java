package travelInsuPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class thirdpage
{
 @FindBy(xpath="(//input[@type='text'])[1]") private  WebElement Startdatetab;
 @FindBy(xpath="(//span[text()='9'])[1]") private WebElement  pickstartdate;
 @FindBy(xpath="(//span[text()='25'])[1]") private  WebElement pickenddate;
 @FindBy(xpath="//button[@class='travel_main_cta']") private WebElement Nextbutton;
 		
 public thirdpage(WebDriver driver)
 {
	PageFactory.initElements(driver, this); 
 }
 public void clickonStartdatetab()
 {
	 Startdatetab.click();
 }
 public void pleasepickstartdate()
 {
	 pickstartdate.click();
 }
 public void pleasepickenddate()
 {
	 pickenddate.click();
 }
 public void clickonnextbutton()
 {
	Nextbutton.click();
 }
}
