package DataProvider_TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Test 
{
	
	
	@Test(dataProvider="dataProvider")
	public void test(String username,String password)
	{
		System.out.println(username+"------"+password);
	}
	
	
	
	@Test(dataProvider="create")
	public void test(String username,String password,String test) 
	{
		System.out.println(username+"---"+password+"----"+test);	
	}
	
	
	
	@DataProvider(name="create")
	public Object[][] dataset1() 
	{
		 return new  Object[][]
				{
			         {"username1","password1","test1"},
			         {"username2","password2","test2"},
			         {"username3","password3","test3"},
			         {"username4","password4","test4"}
				} ;    
			
	}
	
	
	
	@DataProvider
	public Object[][] dataProvider() 
	{
		Object dataset [][] = new Object[4][2];
		
		//first Row
		dataset[0][0]="user1";
	    dataset[0][1]="pass1";	
				
		//second Row
		dataset[1][0]="user2";
	    dataset[1][1]="pass2";	
		
		//third Row
		dataset[2][0]="user3";
	    dataset[2][1]="pass3";	
				
		//fourth Row
		dataset[3][0]="user4";
	    dataset[3][1]="pass4";	
	    
	    return dataset;
				
	}

}
