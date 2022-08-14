package travelInsuPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class firstpage 
{
	
@FindBy(xpath="(//i[contains(@class,'icon-bg homeIconsBg')])[29]") private WebElement travelinsurancebutton;

	public firstpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickontravelinsurance()
	{
		travelinsurancebutton.click();
	}

}