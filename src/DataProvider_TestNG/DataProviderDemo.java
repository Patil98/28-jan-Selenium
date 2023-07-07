package DataProvider_TestNG;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderDemo 
{
	
	@DataProvider(name="create")
	public void DataSet(Object m)
	{
		Object[][] Testdata=null;
		
		if(m.equals("test"))
		{
			Testdata=new Object[][]
			       {
				     {"usename","password"},
				     {"usename1","password1"},
				     {"usename2","password2"},
				     {"usename3","password3"}
					};
			
		}
		
		else if(m.equals("test1"))
		{
			Testdata=new Object[][]
				       {
					     {"usename","password","third"},
					     {"usename1","password1","third"},
					     {"usename2","password2","third"},
					     {"usename3","password3","third"}
						};
		}
		

		else if(m.equals("test2"))
		{
			Testdata=new Object[][]
				       {
					     {"usename","password","third","fourth"},
					     {"usename1","password1","third","fourth"},
					     {"usename2","password2","third","fourth"},
					     {"usename3","password3","third","fourth"}
						};
		}
		
		
	}

}
