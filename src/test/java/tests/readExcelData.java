package tests;

import java.util.List;
import java.util.Map;

import utilities.ExcelUtilAssignment;

public class readExcelData {

	public static void main(String[] args) {

		List<Map<String, String>> data = ExcelUtilAssignment.readData("Assignment_5.xlsx", "ProductDetails");
		System.out.println(data);
		

	}

}
