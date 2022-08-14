package Utilitykiteusingpropertyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Reporter;

public class utilitynew 

{
	public static String readDatafromPropertyFile(String key) throws IOException
	{
	 Properties prop = new Properties();
	 FileInputStream myfile= new FileInputStream("C:\\Users\\RUPALI TARADE\\eclipse-workspace\\Selenium\\Propertyfile.properties");
	 prop.load(myfile);	
	 String value = prop.getProperty(key);
	 return value;
	}
	
	
	/*public static void captureScreenshot(WebDriver driver , String TCID) throws IOException
	{
		File SRC = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File DEST=new File("E:\\selenium\\Screenshots\\TC"+TCID+".png");
		FileHandler.copy(SRC, DEST);
		Reporter.log("Taken Screenshot",true);
	}
	*/
	
	
	public static Timeouts waits(WebDriver driver, int seconds)
	{
		Timeouts Wait = driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    return Wait;
	}
}
