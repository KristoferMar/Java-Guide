package classe_and_objects;

public class Program {
	
	public static void nonmain(String[] args) {
		
		Student student = new Student();
		student.SetStudentId(1);
		student.SetName("kristofer");
		
		System.out.println("Welcome to " + student.GetName());	
		student.ReadABook();
	}
}
