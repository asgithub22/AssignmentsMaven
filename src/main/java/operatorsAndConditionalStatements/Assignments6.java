package operatorsAndConditionalStatements;

public class Assignments6 {

	public static void main(String[] args) {
		
		//Store names & marks of students in 1D Array
		
		String[] students= {"Suresh","Mahesh","Naresh"};
		int[] marks = {75, 80, 82};
		
		//Add 10 marks in each marks
		
		marks[0] += 10;
		marks[1] += 10;
		marks[2] += 10;
		
		//Add all 3 updated marks and store in Total Variable
				
		int total = marks[0] + marks[1] + marks[2];
		
		double average = total/3.0;
		
		System.out.println("Updated Marks : ");
		System.out.println(students[0] + " : " + marks[0]);
		System.out.println(students[1] + " : " + marks[1]);
		System.out.println(students[2] + " : " + marks[2]);
		System.out.println("sAverage Marks  : " + average);
		
	}
}
