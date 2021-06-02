package classe_and_objects;

public class Student {
	
	private int studentId;
	private String name;
	private char lastGrade = 'A';
	
	public Student() {
	}
	
	public Student(int studentId, String name, char lastGrade) {
		this.studentId = studentId;
		this.name = name;
		this.setLastGrade(lastGrade);
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
	
	public char getLastGrade() {
		return lastGrade;
	}
	
	public void setLastGrade(char lastGrade) {
		this.lastGrade = lastGrade;
	}
	
	public void ReadABook() {
		if(this.name != null) {
			System.out.println(this.name + " just started reading a book");			
		} else {
			System.out.println("Student does not have a name");
		}
	}

}
