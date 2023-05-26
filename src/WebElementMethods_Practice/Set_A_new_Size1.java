package WebElementMethods_Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_A_new_Size1 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    // get default size
	     Dimension size = driver.manage().window().getSize();
	     int h = size.getHeight();
	     int w = size.getWidth();
	     System.out.println(h);
	     System.out.println(w);
	     
	     //set new size
	     Dimension d=new Dimension(800, 1000);
	     driver.manage().window().setSize(d);
	   Thread.sleep(2000);  
	     
	     //get new size
	     Dimension get = driver.manage().window().getSize();
	    int height = get.getHeight();
	   int width = get.getWidth();
	   System.out.println(height);
	   System.out.println(width);
		
	}

}
