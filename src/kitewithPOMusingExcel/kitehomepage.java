package kitewithPOMusingExcel;

import java.rmi.server.UID;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

  public class kitehomepage 
  {
     @FindBy(xpath="//span[@class='user-id']") private WebElement userid;
     @FindBy(xpath="//a[@target='_self']") private WebElement logoutbutton;
 
     public  kitehomepage(WebDriver driver)
     {
	 PageFactory.initElements(driver, this);
     }
    
     public void validateuserid(String expectedID)
     {
	 String actualuserID=userid.getText();
	 if(actualuserID.equals(expectedID))
	 {
		 System.out.println("actual and expected is matched, testcase is passed");
	 }
	 else
	 {
		 System.out.println("actual and expected is not matched, testcase is failled");

	 }
 }
    public String getActualuserID()
    {
		String actualuserID=userid.getText();
		return actualuserID;
    	
    }
     
     public void clickonlogoutbutton() throws InterruptedException
     {
	 
	 userid.click();
	 Thread.sleep(2000);
	 logoutbutton.click();
     }
}
