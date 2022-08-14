package travelInsuPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class secondpage 
{
 @FindBy(xpath="//p[text()='Thailand']") private WebElement countryoption;
 @FindBy(xpath="//button[@class='travel_main_cta']") private WebElement nextbutton;
 
 public secondpage(WebDriver driver)
 {
	 PageFactory.initElements(driver,this);
 }
 public void selectcountryoption()
 {
	 countryoption.click();
 }
 public void clickonnextbutton()
 {
	 nextbutton.click();
 }
}
