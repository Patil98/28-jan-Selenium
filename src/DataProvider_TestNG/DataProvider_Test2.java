package DataProvider_TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Test2 
{


	@Test(dataProvider="create")
	public void testData(Object[] b) 
	{
		for (int i=0; i<b.length; i++) 
		{
			System.out.println(b[i]);
		}
		System.out.println("------------");



	}

	@DataProvider(name="create")
	public Object[][] datatest() 
	{

		return new Object[][] 
				{ //"username" ,"password"
			{"standard_user","secret_sauce","test", "bhushan"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce","kuldeep"},
			{"performance_glitch_user","secret_sauce","divyanshu","dheeraj","kalpesh"}

				};

	}

}
