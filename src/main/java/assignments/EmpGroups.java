package assignments;

public class EmpGroups 
{
	String [] Name_data = {"Bharath","ABC","XYZ"};
	int [] Id_data = {1234,1235,1236};
	
	public static void main(String[] args) {
		
		EmpGroups obj1 = new EmpGroups();
		System.out.println("Employee Name:" + obj1.Name_data[0] + " , " + "Employee ID:" + obj1.Id_data[0]);
		System.out.println("Employee Name:" + obj1.Name_data[1] + " , " + "Employee ID:" + obj1.Id_data[1]);
		System.out.println("Employee Name:" + obj1.Name_data[2] + " , " + "Employee ID:" + obj1.Id_data[2]);

	}

}
