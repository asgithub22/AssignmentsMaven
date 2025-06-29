package assignments;

public class Assisgnment2_Arrays {

	public static void main(String[] args) {
		/*
		Storing Semesters in 1D Array
		String [] Semesters = {"Sem1","Sem2","Sem3","Sem4","Sem5"};
		
		//Storing Subjects in 1D Array
		String [] Sem1 = {"Mathematics I","Physics","Chemistry","Computer Progamming","Engineering Drawing","Basic Electrical Eng."};
		String [] Sem2 = {"Mathematics II","Mechanics","Environmental Sci","Basic Electronics","Engineering Physics","Engineering Graphics"};
		String [] Sem3 = {"Data Structures","Discrete Mathematics","Digital Electronics","Operating Systems","Signals and Systems","Object-Oriented Prog."};
		String [] Sem4 = {"Algorithms","Computer Networks","Database Systems","Microprocessors","Communication Eng.","Software Engineering"};
		String [] Sem5 = {"Probability & Stats","Machine Learning","Compiler Design","Theory of Computation","Embedded Systems","Computer Graphics"};
		//Storing Status in 1D Array
		String [] Status1 = {"Pass","Pass","Fail","Pass","Pass","Pass"};
		String [] Status2 = {"Pass","Pass","Pass","Fail","Fail","Pass"};
		String [] Status3 = {"Pass","Pass","Pass","Fail","Pass","Pass"};
		String [] Status4 = {"Pass","Pass","Fail","Pass","Pass","Pass"};
		String [] Status5 = {"Pass","Pass","Pass","Pass","Pass","Pass"};
		//Storing Marks in 1D Array
		byte [] Marks1 = { 78 , 85 , 21 , 74 , 88 , 79 };
		byte [] Marks2 = { 82 , 77 , 93 , 19 , 24 , 90 };
		byte [] Marks3 = { 88 , 81 , 76 , 32 , 85 , 78 };
		byte [] Marks4 = { 91 , 73 , 19 , 80 , 76 , 87 };
		byte [] Marks5 = { 86 , 88 , 84 , 95 , 73 , 90 };
		//Storing Subject in 1D Array
		String [] Subject = {"Sem1","Sem2","Sem3","Sem4","Sem5"};
		//Storing Status in 1D Array
		String [] Status = {"Status1","Status2","Status3","Status4","Status5"};
		//Storing Status in 1D Array
		String [] Marks = {"Marks1","Marks2","Marks3","Marks4","Marks5"};
 		//Storing Subjects in 2D Array
		String [][] Subjects = {Subject,Status};
		//Storing Subjects in 2D Array
		String [][] Subjects1 = {Subject,Marks};
		
		//String [][] Subjects2 = {Subject,Marks};
		//
		Strings [][][] All {
		System.out.println();
		*/
		String[][][] data = {
				{ //Semester 1
					{"Mathematics I","Physics","Chemistry","Computer Progamming","Engineering Drawing","Basic Electrical Eng."},
					{"78 Pass","85 Pass","21 Fail","74 Pass","88 Pass","79 Pass"}
				},
				{ //Semester 2
					{"Mathematics II","Mechanics","Environmental Sci","Basic Electronics","Engineering Physics","Engineering Graphics"},
					{"82 Pass","77 Pass","93 Pass","19 Fail","24 Fail","90 Pass"}
				},
				{ //Semester 3
					{"Data Structures","Discrete Mathematics","Digital Electronics","Operating Systems","Signals and Systems","Object-Oriented Prog."},
					{"88 Pass","81 Pass","76 Pass","32 Fail","85 Pass","78 Pass"}
				},
				{ //Semester 4
					{"Algorithms","Computer Networks","Database Systems","Microprocessors","Communication Eng.","Software Engineering"},
					{"91 Pass","73 Pass","19 Fail","80 Pass","76 Pass","87 Pass"}
				},
				{ //Semester 5
					{"Probability & Stats","Machine Learning","Compiler Design","Theory of Computation","Embedded Systems","Computer Graphics"},
					{"86 Pass","88 Pass","84 Pass","95 Pass","73 Pass","90 Pass"}
				}
		};
		// Print Semester 3 Subject 4 and Subject 5 names
		System.out.println("Semester 3, Subject 4: " + data[2][0][3]);
		System.out.println("Semester 3, Subject 5: " + data[2][0][4]);
		
		// Print Semester 5 Subject 3 and Subject 6 names
		System.out.println("Semester 5, Subject 3 Marks: " + data[4][1][2]);
		System.out.println("Semester 5, Subject 6 Marks: " + data[4][1][5]);
		
	}

}
