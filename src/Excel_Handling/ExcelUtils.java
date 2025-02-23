package Excel_Handling;

import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

public class ExcelUtils {
	private static String filePath = "C:/Users/bvp13/eclipse-workspace/28 jan Selenium/src/Excel_Handling/TestData.xlsx";

    public static Map<String, String> getRowData(String sheetName, int rowIndex) {
        Map<String, String> rowData = new HashMap<>();
        try (FileInputStream fis = new FileInputStream(new File(filePath));
             Workbook workbook = WorkbookFactory.create(fis)) {  // Using WorkbookFactory

            System.out.println("Reading data from Excel sheet: " + sheetName);

            Sheet sheet = workbook.getSheet(sheetName);
            Row headerRow = sheet.getRow(0);  // Read header row
            Row dataRow = sheet.getRow(rowIndex);

            for (int i = 0; i < headerRow.getLastCellNum(); i++) {
                String columnName = headerRow.getCell(i).getStringCellValue();
                String cellValue = dataRow.getCell(i).toString(); // Directly reading cell value
                rowData.put(columnName, cellValue);
            }
        } catch (Exception e) {
            System.out.println("Error while reading Excel file: " + e.getMessage());
        }
        return rowData;
    }
}
