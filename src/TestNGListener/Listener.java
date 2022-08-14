package TestNGListener;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import Baseclassusingpropertyfile.Basenew;

public class Listener implements ITestListener
{
	
	Basenew b=new Basenew(); //created object of base class
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		//Reporter.log("TC is failled" + result.getName(),true);
		
		String TCname=result.getName();
		try
		{
			b.takeScreenshot(TCname);
		} catch (IOException e) 
		{
			// TODO: handle exception
			 e.printStackTrace();	
		}
	}
	
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		Reporter.log("TC is Success",true);
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Success TC name is "+result.getName(),true); 
	}

	
    @Override
	public void onTestSkipped(ITestResult result)
	{
    	Reporter.log("TC is skipped, please check dependent TC",true); 
    	Reporter.log("Skipped TC is "+result.getName(),true);  
    	ITestListener.super.onTestSkipped(result); 
	}
	
	
	
}
