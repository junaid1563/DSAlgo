package project;

public class students {
	private String name;
	private double cgpa;
	private String roll_no;

//constructor
	public students(String name, double cgpa, String roll_no) {
		this.name = name;
		this.cgpa = cgpa;
		this.roll_no = roll_no;
	}

//setName()	
	public void setName(String name) {
		this.name = name;
	}

	// getName()
	public String getName() {
		return this.name;
	}

//setrollno()
	public void setrollno(String roll_no) {
		this.roll_no = roll_no;
	}

	// getrollno()
	public String getrollno() {
		return this.roll_no;
	}

	// setCgpa()
	public void setCgpa(double c) {
		this.cgpa = c;
	}

	// getcgpa()
	public double getcgpa() {
		return this.cgpa;
	}

	// toString()
	public String toString() {
		return ">> Name: " + this.name + "\t|| Roll No: " + this.roll_no + "\t|| CGPA: " + this.cgpa;
	}
}
