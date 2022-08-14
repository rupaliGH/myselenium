package POMkitenew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitepinpage 
{
  
  @FindBy(id="pin")private  WebElement PIN;
  @FindBy(xpath="//button[@type='submit']")  private WebElement continuebutton;
  
  public kitepinpage(WebDriver driver)
	
  {
	  PageFactory.initElements(driver, this);
  }
  
  public void sendpin(String Pin)
  {
	  PIN.sendKeys(Pin);
  }
  public void clickoncontinuebutton()
  {
	  continuebutton.click();
  }
}

