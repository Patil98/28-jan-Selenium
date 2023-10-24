package DataProvider_TestNG;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Test4 
{
	@Test(dataProvider="create")
	public void testData(Object[] b) 
	{
		System.out.println(b[0]+"------"+b[1]);	
	}


	@DataProvider(name="create")
	public Iterator<Object[]> dataset()
	{
		List<Object[]> data= new ArrayList<>();
		data.add(new Object[] {"bhushan",123 });
		data.add(new Object[] {"dheeraj",456 });
		data.add(new Object[] {"kuldeep",789 });
		data.add(new Object[] {"divyanshu",869 });

		return data.iterator();
	}

}