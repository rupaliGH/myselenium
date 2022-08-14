package kiteusingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitehomepage 
{
	@FindBy(xpath = "//span[@class='user-id']") private WebElement uid;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logout;
	
	public kitehomepage(WebDriver driver)
	
	{
      PageFactory.initElements(driver, this);
	}

	public void validateID()
	{
		String expecteduserid="ELR321";
		String actualuserid=uid.getText();
		
		if(expecteduserid.equals(actualuserid))
		{
			System.out.println("test is pass");
		}
		else
		{
			System.out.println("test is failled");
		}
		
	}
		public void logout() throws InterruptedException
		{
		uid.click();	
		Thread.sleep(200);
		logout.click();
		}

}
 
