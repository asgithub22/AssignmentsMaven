package Assignments3ArrayClassObjects;

public class EmpGroups {

	public static void main(String[] args) {
		Employees obj = new Employees();
		String[] EmpNames = {obj.E_Names1,obj.E_Names2,obj.E_Names3};
		int[] EmpIds = {obj.E_Id1,obj.E_Id2,obj.E_Id3};
		System.out.println("Employee Name: " + EmpNames[0] + " , " + "Employee ID: " + EmpIds[0]);

	}

}
