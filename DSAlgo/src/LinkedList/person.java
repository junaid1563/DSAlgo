package LinkedList;

public class person {
	private String name;
	private int rollno;

	public person(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	public String toString() {
		return "Name: " + name + "\nRoll-no: " + rollno;
	}

	public String getName() {
		return this.name;
	}

}
