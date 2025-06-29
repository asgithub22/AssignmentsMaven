package assignments;

public class Employees 
{
	String Names1 = "Bharath";
	String Names2 = "ABC";
	String Names3 = "XYZ";
	int id1 = 1234;
	int id2 = 1235;
	int id3 = 1236;

	public static void main(String[] args) {
		
		Employees obj = new Employees();
		System.out.println("Employee Name:" + obj.Names1 + " , " + "Employee ID:" + obj.id1 );
		System.out.println("Employee Name:" + obj.Names2 + " , " + "Employee ID:" + obj.id2 );
		System.out.println("Employee Name:" + obj.Names3 + " , " + "Employee ID:" + obj.id3 );
	}

}
