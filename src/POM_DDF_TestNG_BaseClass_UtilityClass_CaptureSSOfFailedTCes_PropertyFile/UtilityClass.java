package POM_DDF_TestNG_BaseClass_UtilityClass_CaptureSSOfFailedTCes_PropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 

{
	
	//@AuthorName:Bhushan
	//This method is use to get Test data from excel.
	//need to pass 2 inputs: 1-rowIndex, 2-colIndex
	
	public static String getTestData(int rowindex ,int colindex) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\\\Users\\\\bvp13\\\\OneDrive\\\\Documents\\\\data.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		String value = sh.getRow(rowindex).getCell(colindex).getStringCellValue();
		
		return value;
	}
	
	public static void captureSS(WebDriver driver, int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\bvp13\\OneDrive\\Documents\\Screenshot\\TestCaseID"+TCID+".jpg");
		FileHandler.copy(src, dest);
			
	}
	
	public static String getPFData(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\bvp13\\eclipse-workspace\\28 jan Selenium\\PropertyFile.properties");
		
		Properties p=new Properties();
		p.load(file);
		
		String value = p.getProperty(key);
		
		return value;
		
	}

	
}
