package WebElementMethods_Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_A_new_Size 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		//get default size
		Dimension get = driver.manage().window().getSize();
		int w = get.getWidth();
		int h = get.getHeight();
		System.out.println("get width " + w);
		System.out.println("get height "+ h);

		//set new size
		Dimension d=new Dimension(800,600);
		driver.manage().window().setSize(d);

		System.out.println("********************");

		//get new size
		Dimension g = driver.manage().window().getSize();
		int width = g.getWidth();
		int height = g.getHeight();
		System.out.println("get width "+ width);
		System.out.println("get height "+ height);

	}
}