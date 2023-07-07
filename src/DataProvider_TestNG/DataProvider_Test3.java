package DataProvider_TestNG;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Test3 

{
	@Test(dataProvider="create")
	public void testData(String b) 
	{
		System.out.println(b);
		System.out.println("---------");
	}
	
	
	
	@DataProvider(name="create")
	public Iterator<Object> Dataset()
	{
		List<Object> data=new ArrayList<>();
		data.add("bhushan");
		data.add("dheeraj");
		data.add("kuldeep");
		
		return data.iterator();
		
	}

}
