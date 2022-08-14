package POMkitenew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteloginpage 
{
	
  @FindBy(id="userid") private WebElement userID;
  @FindBy(id="password") private WebElement password;
  @FindBy(xpath="//button[@type='submit']")  private WebElement loginbutton;
  
  public kiteloginpage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  public void senduserID(String UN)
  {
	  userID.sendKeys(UN);
  }
  public void sendpassword(String PWD)
  {
	  password.sendKeys(PWD);
  }
  public void clickonloginbutton()
  {
	  loginbutton.click();
  }
}
