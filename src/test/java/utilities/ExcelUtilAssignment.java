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

	public static List<Map<String, String>> readData(String fileName, String sheetName) {

		List<Map<String, String>> data = new ArrayList<Map<String, String>>();

		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\" + fileName);

			XSSFWorkbook wb = new XSSFWorkbook(fis);

			XSSFSheet sh = wb.getSheet(sheetName);

			int totalRows = sh.getPhysicalNumberOfRows();
			int totalCloumns = sh.getRow(0).getPhysicalNumberOfCells();

			for (int r = 1; r < totalRows; r++) {

				Map<String, String> rowData = new HashMap<String, String>();

				for (int c = 0; c < totalCloumns; c++) {

					String columnName = sh.getRow(0).getCell(c).getStringCellValue();
					String columnValue = sh.getRow(r).getCell(c).getStringCellValue();

					rowData.put(columnName, columnValue);
				}

				data.add(rowData);
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return data;

	}

}
