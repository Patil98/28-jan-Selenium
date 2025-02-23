package Excel_Handling;

import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class PrintAllDatatoConsole {
	private static String filePath = "src/Excel_Handling/TestData.xlsx"; // Ensure the correct file path

	//to call this method we pass the sheet name 
	public static void printAllData(String sheetName) {
		try (FileInputStream fis = new FileInputStream(new File(filePath));
				Workbook workbook = WorkbookFactory.create(fis)) {  // Using WorkbookFactory

			Sheet sheet = workbook.getSheet(sheetName);
			int rowCount = sheet.getLastRowNum();

			for (int i = 0; i <= rowCount; i++) {
				Row row = sheet.getRow(i);
				if (row != null) {
					for (int j = 0; j < row.getLastCellNum(); j++) {
						Cell cell = row.getCell(j);
						System.out.print(cell.toString() + "  |  "); // Print with separator
					}
					System.out.println(); // Move to next line
				}
			}
		} catch (IOException e) {
			System.out.println("Error while reading Excel file: " + e.getMessage());
		}

	}

	public static void main(String[] args) {
		printAllData("LoginData");
	}
}


