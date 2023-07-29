package ITestListener;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyListener.class)
public class ITestListenerWithExample 
{
	@Test
	public void TestPassed()
	{
		System.out.println("this test method is passed");
	}
	

	@Test(timeOut=1000)
	public void TestFailed() throws InterruptedException 
	{
		Thread.sleep(3000);
		System.out.println("this test method is failed");
	}


	@Test(dependsOnMethods="TestFailed")
	public void TestSkipped()
	{
		System.out.println("this test method is Skipped");
	}
	

	@Test
	public void TestFailed1() 
	{
		System.out.println("this test method is failed1");
		Assert.assertTrue(false);
	}



}
