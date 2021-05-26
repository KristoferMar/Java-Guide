package ClassesAndObjects;

public class Student {
	
	private int studentId;
	private String name;
	
	public Student() {
	}
	
	public Student(int studentId, String name) {
		this.studentId = studentId;
		this.name = name;
	}
		
	public int GetStudentId() {
		return this.studentId;
	}
	
	public void SetStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public String GetName() {
		return this.name;
	}
	
	public void SetName(String name) {
		this.name = name;
	}
	
	public void ReadABook() {
		if(this.name != null) {
			System.out.println(this.name + " just started reading a book");			
		} else {
			System.out.println("Student does not have a name");
		}
	}
}
