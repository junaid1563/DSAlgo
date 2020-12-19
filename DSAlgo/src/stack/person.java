package stack;

public class person {
	private String name;
	private int rollno;

	public person(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}
	public String toString() {
		return ">> Name: "+name+" || Roll-no: "+rollno;
	}
}
