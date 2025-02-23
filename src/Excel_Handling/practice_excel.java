package Excel_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class practice_excel {

	private static String path = "C:/Users/bvp13/eclipse-workspace/28 jan Selenium/src/Excel_Handling/TestData.xlsx";

	public static Map<String, String> rowdata(String sheetname , int cellindex)
	{
		Map<String, String> data = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

		try {
			FileInputStream file = new FileInputStream(new File(path));
			Workbook create = WorkbookFactory.create(file);
			Sheet sheet = create.getSheet(sheetname);	
			Row headername = sheet.getRow(0);
			Row rowdata = sheet.getRow(cellindex);
			
			for(int i=0; i<headername.getLastCellNum(); i++)
			{
				String headervalues = headername.getCell(i).getStringCellValue();
				String cellvalues = rowdata.getCell(i).toString();
				data.put(headervalues, cellvalues);
			}
				
			return data;

		} catch (EncryptedDocumentException | IOException e) {

			e.printStackTrace();
		}
		return data;

	}
	
	public static void main(String[] args) {
		Map<String, String> rowdata = rowdata("LoginData", 4);

        // Print values using sysout
        System.out.println("Username: " +rowdata.get("username"));
        System.out.println("Password: " +rowdata.get("password"));
        System.out.println("URL: " +rowdata.get("url"));
	}

}
