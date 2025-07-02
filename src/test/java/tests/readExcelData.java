package tests;

import java.util.List;
import java.util.Map;

import utilities.ExcelUtilAssignment;

public class readExcelData {

	public static void main(String[] args) {

		// Pass FileName and SheetName
		List<Map<String, String>> data = ExcelUtilAssignment.readData("Assignment_5.xlsx", "ProductDetails");

		// Get the data from Second Row and Supplier column
		System.out.println(data.get(1).get("Supplier")); // Output : Office Depot

	}

}
