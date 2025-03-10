package ITestListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener 
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("on Each Test Start");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("on Test Success "+result.getName());
	}
	

	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("on Test Failure "+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("on Test Skipped "+result.getName());
	}
 
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{
		System.out.println("on Test Failed With Timeout "+result.getName());
	}

	@Override
	public void onStart(ITestContext context)
	{
		System.out.println("on Start");	
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		System.out.println("on Finish");
	}

}
