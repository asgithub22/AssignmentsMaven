package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilAssignment {
	
	// Read data from Excel and convert it into collections
	public static List<Map<String, String>> readData(String fileName, String sheetName) {

		List<Map<String, String>> data = new ArrayList<Map<String, String>>();

		try {
			// Read the Excel file
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\" + fileName);

			// Load the file into Excel class
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			// Read the data from specific excel sheet
			XSSFSheet sh = wb.getSheet(sheetName);

			// Get the total rows and columns having data
			int totalRows = sh.getPhysicalNumberOfRows();
			int totalCloumns = sh.getRow(0).getPhysicalNumberOfCells();

			// Use for loops and copy the data (starts with row 2 as row 1 have headers)
			for (int r = 1; r < totalRows; r++) {
				
				//Initialize map for each row
				Map<String, String> rowData = new HashMap<String, String>();

				for (int c = 0; c < totalCloumns; c++) {

					String columnName = sh.getRow(0).getCell(c).getStringCellValue(); // Store the key value (Header)
					String columnValue = sh.getRow(r).getCell(c).getStringCellValue(); // Store the Value (Data)

					rowData.put(columnName, columnValue); // Store the Data in Map in Key Value pair
				}

				data.add(rowData); // Store the Data in List
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return data; //Send the Data to Method

	}

}
