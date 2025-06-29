package Assignments5ArrayCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment5 {

	public static void main(String[] args) {
		
		//Map<String, Map<String,Map<String,Map<String,Map<String,Map<String,Map<String,Map<String,Map<String,String>>>>>>>>> TableData = new HashMap<String, Map<String,Map<String,Map<String,Map<String,Map<String,Map<String,Map<String,Map<String,String>>>>>>>>>();
		
		//Map<String, List<Map<String, String>>> tableData = new HashMap<>();
		
		
		
		//'''''''''''''''''Student Data'''''''''''''''''''''
		
		Map<String, String> std1 = new HashMap<>();
		std1.put("Name", "John Doe");
		std1.put("Age", "Twenty");
		std1.put("Gender", "Male");
		std1.put("Roll Number", "SBA12345");
		std1.put("Grade", "A++");
		std1.put("Major", "Computer Science");
		std1.put("GPA", "A3.8");
		std1.put("Email", "john@example.com");
		std1.put("PAN Number", "SDF6543210");
		std1.put("Address", "123 Elm St");
		
		Map<String, String> std2 = new HashMap<>();
		std2.put("Name", "Jane Smith");
		std2.put("Age", "Twenty One");
		std2.put("Gender", "Female");
		std2.put("Roll Number", "SBA12346");
		std2.put("Grade", "B+");
		std2.put("Major", "Mathematics");
		std2.put("GPA", "A3.5");
		std2.put("Email", "jane@example.com");
		std2.put("PAN Number", "REW6543211");
		std2.put("Address", "456 Oak St");
		
		Map<String, String> std3 = new HashMap<>();
		std3.put("Name", "Mike Brown");
		std3.put("Age", "Twenty Two");
		std3.put("Gender", "Male");
		std3.put("Roll Number", "SBA12347");
		std3.put("Grade", "A+");
		std3.put("Major", "Physics");
		std3.put("GPA", "A3.9");
		std3.put("Email", "mike@example.com");
		std3.put("PAN Number", "TYR6543212");
		std3.put("Address", "789 Pine St");
		
		List<Map<String,String>> StudentDetails = new ArrayList<>();
		StudentDetails.add(std1);
		StudentDetails.add(std2);
		StudentDetails.add(std1);
		
		//********************Employee Data**************************
		
		Map<String, String> emp1 = new HashMap<>();
        emp1.put("Name", "Alice Green");
        emp1.put("Age", "Thirty");
        emp1.put("Gender", "Female");
        emp1.put("Department", "Engineering");
        emp1.put("Position", "Software Engineer");
        emp1.put("Salary", "75K Pounds");
        emp1.put("Email", "alice@example.com");
        emp1.put("PAN Number", "SDF6543210");

        Map<String, String> emp2 = new HashMap<>();
        emp2.put("Name", "Bob Johnson");
        emp2.put("Age", "Thirty Five");
        emp2.put("Gender", "Male");
        emp2.put("Department", "Marketing");
        emp2.put("Position", "Marketing Manager");
        emp2.put("Salary", "85K Pounds");
        emp2.put("Email", "bob@example.com");
        emp2.put("PAN Number", "REW6543211");

        Map<String, String> emp3 = new HashMap<>();
        emp3.put("Name", "Carol White");
        emp3.put("Age", "Twenty Eight");
        emp3.put("Gender", "Female");
        emp3.put("Department", "Sales");
        emp3.put("Position", "Sales Executive");
        emp3.put("Salary", "65K Pounds");
        emp3.put("Email", "carol@example.com");
        emp3.put("PAN Number", "TYR6543212");
		
        List<Map<String,String>> EmployeeDetails = new ArrayList<>();
        EmployeeDetails.add(emp1);
        EmployeeDetails.add(emp2);
        EmployeeDetails.add(emp3);
        
      //********************Product Data**************************
        
        
        Map<String, String> product1 = new HashMap<>();
        product1.put("Name", "Laptop");
        product1.put("Category", "Electronics");
        product1.put("Price", "12K Pounds");
        product1.put("Stock Quantity", "Not Available");
        product1.put("Supplier", "Tech Supplies");
        product1.put("Warranty", "2 years");
        product1.put("Rating", "4.5 Stars");
        product1.put("Manufacturing Date", "Aug 2023");
        product1.put("Expiry Date", "Aug 2028");

        Map<String, String> product2 = new HashMap<>();
        product2.put("Name", "Desk Chair");
        product2.put("Category", "Furniture");
        product2.put("Price", "150K Pounds");
        product2.put("Stock Quantity", "Two");
        product2.put("Supplier", "Office Depot");
        product2.put("Warranty", "1 year");
        product2.put("Rating", "4 Stars");
        product2.put("Manufacturing Date", "Sep 2024");
        product2.put("Expiry Date", "N/A");

        Map<String, String> product3 = new HashMap<>();
        product3.put("Name", "Coffee Maker");
        product3.put("Category", "Kitchen");
        product3.put("Price", "75 Pounds");
        product3.put("Stock Quantity", "Two Hundred");
        product3.put("Supplier", "KitchenWorld");
        product3.put("Warranty", "6 months");
        product3.put("Rating", "4.2 Stars");
        product3.put("Manufacturing Date", "Jan 2025");
        product3.put("Expiry Date", "Jan 2027");
		
        List<Map<String,String>> ProductDetails = new ArrayList<>();
        ProductDetails.add(product1);
        ProductDetails.add(product2);
        ProductDetails.add(product3);
        
     // --- Map of Student, Employee and Product Data ---
     		Map<String, List<Map<String, String>>> data = new HashMap<>();
     		data.put("Students", StudentDetails);
     		data.put("Employees", EmployeeDetails);
     		data.put("Products", ProductDetails);
        
        
     // Print the supplier details
    
     		System.out.println(data.get("Products").get(2).get("Rating"));
    		
    		
		    //System.out.println(tableData);
	}

}
