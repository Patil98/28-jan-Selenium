package Popup;

import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class FileDowloadExample_2
{
		public static void main(String[] args)
		{
			EdgeOptions options=new EdgeOptions();
			HashMap<String, Object> prefs=new HashMap<>();
			prefs.put("plugins.always_open_pdf_externally", true);
			prefs.put("download.default_directory", "C:\\Users\\bvp13\\OneDrive\\Pictures");
			options.setExperimentalOption("prefs", prefs);
			
			WebDriver driver=new EdgeDriver(options);
			driver.manage().window().maximize();
			driver.get("https://www.bpsc.bih.nic.in/");
			
			driver.findElement(By.xpath("(//a[@class='wbg'])[1]")).click();
			
		}
}


