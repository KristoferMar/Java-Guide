package variables;

import classe_and_objects.Student;

public class Array {
	
	public void Arrays() {
		
		// Int array - 3 ways of initilization
		
	/*	int[] scores = new int[4];
		scores[0] = 90;
		scores[1] = 70;
		scores[2] = 80;
		scores[3] = 100;
	*/
		
		// With this method we do not specify the size
	/*	int[] scores = new int[] {90, 70, 80, 100 };
		System.out.println("Mid-Term 1: " + scores[0]);
		System.out.println("Mid-Term 2: " + scores[1]);
		System.out.println("Final: " + scores[2]);
		System.out.println("Project: " + scores[0]);
	*/
		
		int[] scores = {90, 70, 80, 100};
		System.out.println("Mid-Term 1: " + scores[0]);
		System.out.println("Mid-Term 2: " + scores[1]);
		System.out.println("Final: " + scores[2]);
		System.out.println("Project: " + scores[0]);
		
		// Array length
		System.out.println("length of array is: " + scores.length);
		
		
		// Array of objects 
		Student[] studentArr = { new Student(), new Student(), new Student()};
		studentArr[0].SetName("Kristofer");
		System.out.println(studentArr[0].GetName() + " is the name of the first studfent ");
	}	
}
