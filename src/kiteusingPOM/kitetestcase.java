package kiteusingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kitetestcase {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(1000);
		
		kiteloginpage login= new kiteloginpage(driver);
		login.senduserid();
		login.sendpassword();
		login.clickloginbutton();
		Thread.sleep(1000);
		
		kitepinpage pin= new kitepinpage(driver);
		pin.sendpin();
		pin.clickoncontinuebutton();
		Thread.sleep(4000);
		
		kitehomepage home = new kitehomepage(driver);
		home.validateID();
		home.logout();
		Thread.sleep(2000);
		driver.close();

	}

}
