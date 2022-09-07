package practice;

public class Student {
	String studentName;

	public Student() {

	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void display() {
    System.out.println("Inside Display  " + studentName);
	}

}
